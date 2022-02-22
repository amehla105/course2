package com.agreeya.course.controller;

import com.agreeya.course.courseentity.Course;
import com.agreeya.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/course")

public class CourseController
{

    @Autowired
    private CourseService courseService;

    @PostMapping("/save")
    public Course saveCourseDetails(@RequestBody Course course)
    {
        return courseService.saveCourseDetails(course);
    }

    @GetMapping("/findall")
    public List<Course> getAllCourseDetails()
    {
        return courseService.getAllCourseDetails();
    }

    @GetMapping("/findbyid/{id}")
    public Course findByCourseIdDetails(@PathVariable("id") long courseId)
    {
        return courseService.findByCourseIdDetails(courseId);
    }

    @DeleteMapping("deletebyid/{id}")
    public void deleteCourseById(@PathVariable("id") long courseId)
    {
        courseService.deleteCourseById(courseId);
    }

    @PutMapping("/updatebyid/{id}")
    public Course updateCourseById(@RequestBody Course course,@PathVariable("id") long courseId)
    {
        return courseService.updateCourseById(course,courseId);

    }

}
