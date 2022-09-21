package com.simplilearn.learnersacademy.service;

import java.util.Set;

import com.simplilearn.learnersacademy.dto.Classes;

public interface ClassesService {
	public Integer addClasses(Classes classes);
    public void updateClasses(int ClassesId,String className);
    public void deleteClasses(int ClassesId);
    public Classes searchClasses(int ClassesId);
    public Set<Classes> getAllClassess();
}
