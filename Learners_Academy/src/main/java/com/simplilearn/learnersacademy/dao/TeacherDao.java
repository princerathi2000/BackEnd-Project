package com.simplilearn.learnersacademy.dao;

import java.util.Set;

import com.simplilearn.learnersacademy.dto.Teacher;

public interface TeacherDao {
	public Integer addTeacher(Teacher Teacher);
    public void updateTeacher(int TeacherId,String address);
    public void deleteTeacher(int TeacherId);
    public Teacher searchTeacher(int TeacherId);
    public Set<Teacher> getAllTeachers();
}
