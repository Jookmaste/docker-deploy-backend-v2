package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if (score > 79.5) {
            return "Ayo";
        }
        else if (score > 74.5){
            return "Bob";
        }else if (score > 59.5){
            return "Cat";
        }else if (score > 32.5) {
            return "Dog";
        } else
            return "Fish";

    }
}
