package com.example.QuizApplication.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class QuestionWrapper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String question_title;

    public QuestionWrapper(Integer id,String question_title,String option1,String option2,String option3,String option4){
        this.id=id;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;
        this.question_title=question_title;

    }

    public QuestionWrapper() {
    }
}
