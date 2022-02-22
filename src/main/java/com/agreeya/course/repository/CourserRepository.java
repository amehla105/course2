package com.agreeya.course.repository;

import com.agreeya.course.courseentity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourserRepository extends JpaRepository<Course, Long>{

    Course findByCourseId(long courseId);
}
