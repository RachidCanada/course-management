package com.example.controller;

import com.example.course_management.model.Course;
import com.example.course_management.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseViewController {

    private final CourseService courseService;

    public CourseViewController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public String viewCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        model.addAttribute("course", new Course());
        return "courses";
    }
}
