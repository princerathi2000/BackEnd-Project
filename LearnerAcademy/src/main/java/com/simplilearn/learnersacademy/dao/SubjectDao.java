package com.learnersacademy.dao;

import java.util.Set;

import com.learnersacademy.dto.Subject;

public interface SubjectDao {
	public Integer addSubject(Subject Subject);
    public void updateSubject(int SubjectId,String address);
    public void deleteSubject(int SubjectId);
    public Subject searchSubject(int SubjectId);
    public Set<Subject> getAllSubjects();
}
