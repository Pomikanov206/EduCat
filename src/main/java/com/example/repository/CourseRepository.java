package com.example.repository;

import com.example.model.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> findAllCourse();
    Course findCourseById(Long id);
}
