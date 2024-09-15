package org.example.students;

import Exceptions.ItemNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class AverageScoresCache implements StudentsSubjectsAverageCache {

    public static final int INITIAL_CAPACITY = 256;
    protected final Map<String, Double> averageScoresCache = new HashMap<>(INITIAL_CAPACITY);

    @Override
    public double getAverageScoreForSubjectFromCache(String subject) {

        double averageScore = 0;
        if(averageScoresCache.containsKey(subject)) {
            averageScore = averageScoresCache.get(subject);
        } else {
            System.out.print("This subject doesn't exist in the base ");
        }



        System.out.println(averageScore);
        return averageScore;
    }
}
