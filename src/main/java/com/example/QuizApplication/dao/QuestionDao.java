package com.example.QuizApplication.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuizApplication.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

    List<Question> findByCategory(String category);

    @Query(value="select * from question q where q.category=:category order By Random() limit :numQ", nativeQuery=true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);

    
}
