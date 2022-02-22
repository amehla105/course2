package com.agreeya.course.service;

import com.agreeya.course.courseentity.Course;
import com.agreeya.course.repository.CourserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourserRepository courserRepository;


    public Course saveCourseDetails(Course course)
    {
        return courserRepository.save(course);

    }

    public List<Course> getAllCourseDetails()
    {
        return courserRepository.findAll();
    }

    public Course findByCourseIdDetails(long courseId)
    {
        return courserRepository.findByCourseId(courseId);
    }

    public void deleteCourseById(long courseId)
    {
        courserRepository.deleteById(courseId);
    }

    public Course updateCourseById(Course course, long courseId)
    {
        Course courseId1=courserRepository.getById(courseId);
        courseId1.setTitle(course.getTitle());
        courseId1.setDescription(course.getDescription());
        return courserRepository.save(courseId1);

    }
}
