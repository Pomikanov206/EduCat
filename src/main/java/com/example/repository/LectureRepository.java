package com.example.repository;

import com.example.model.Lecture;

import java.util.List;

public interface LectureRepository {
    List<Lecture> findAllLecture();
    Lecture findLectureById(Long id);
}
