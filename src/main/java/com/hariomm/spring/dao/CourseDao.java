package com.hariomm.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hariomm.spring.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{
	

}
