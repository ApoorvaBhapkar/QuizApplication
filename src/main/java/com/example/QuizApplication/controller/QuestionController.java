package com.example.QuizApplication.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.QuizApplication.model.Question;
import com.example.QuizApplication.service.QuestionService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion() {
        return questionService.getAllQuestion();
    }
    
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("addQuestion")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        
        return questionService.save(question);
    }

    @DeleteMapping("deleteQuestion/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Integer id) {
        ResponseEntity<Question> q=questionService.findById(id);
        if(q.getStatusCode().equals(HttpStatus.NOT_FOUND)){
            return new ResponseEntity<>("Question not found",HttpStatus.NOT_FOUND);
        }
        return questionService.delete(q.getBody());
    }

    @PutMapping("updateQuestion")
    public ResponseEntity<String> updateQuestion(@RequestBody Question entity) {
        
        questionService.save(entity);
        return new ResponseEntity<>("Updated",HttpStatus.OK);
    }
    
    
}
