package com.example.QuizApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.QuizApplication.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer>{
    
}
