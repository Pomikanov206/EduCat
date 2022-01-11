package com.example.dao;

import com.example.model.Course;
import com.example.model.Lecture;
import com.example.repository.CourseRepository;
import com.example.repository.LectureRepository;

import java.util.ArrayList;
import java.util.List;

public class DAOSimulation implements LectureRepository, CourseRepository {
    private static DAOSimulation instance = null;
    private final List<Course> courses;
    private final List<Lecture> lectures;

    private DAOSimulation(){
        courses = new ArrayList<>();
        lectures = new ArrayList<>();
    }

    @Override
    public Course findCourseById(Long id) {
        return null;
    }

    @Override
    public List<Lecture> findAllLecture() {
        return lectures;
    }

    @Override
    public List<Course> findAllCourse() {
        return courses;
    }


    @Override
    public Lecture findLectureById(Long id) {
        return null;
    }

    public static DAOSimulation getInstance() {
        if(instance == null)
            instance = new DAOSimulation();
        return instance;
    }
}
