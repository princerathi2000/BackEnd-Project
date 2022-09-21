package com.simplilearn.learnersacademy.service;

import java.util.Set;

import com.simplilearn.learnersacademy.dto.Subject;

public interface SubjectService {
	public Integer addSubject(Subject Subject);
    public void updateSubject(int SubjectId,String address);
    public void deleteSubject(int SubjectId);
    public Subject searchSubject(int SubjectId);
    public Set<Subject> getAllSubjects();
}
