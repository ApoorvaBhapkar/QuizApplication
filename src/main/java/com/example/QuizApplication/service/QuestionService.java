package com.example.QuizApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.QuizApplication.dao.QuestionDao;
import com.example.QuizApplication.model.Question;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestion() {
        try {
            return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST); 
    }

    public ResponseEntity<List<Question>> getQuestionByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST); 
    }

    public ResponseEntity<String> save(Question question) {
        try {
            questionDao.save(question);
            return new ResponseEntity<>("saved question",HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error while saving",HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> delete(Question q) {
        try {
            questionDao.delete(q);
            return new ResponseEntity<>("Deleted question",HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error while deleting",HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Question> findById(Integer id) {
        try {
            return new ResponseEntity<>(questionDao.findById(id).orElse(new Question()),HttpStatus.FOUND);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Question(),HttpStatus.NOT_FOUND);
        
    }
    
}
