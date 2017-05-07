package com.psideris.springBootStarter.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psideris.springBootStarter.entities.Topic;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Topic> getAllCourses() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Java SE 8", "Java SE 8 Description"),
				new Topic("python", "Python Django", "Python Django Description"),
				new Topic("c", "C Basic", "C Basic Description")
				);
	}
	
	@RequestMapping("/courses/{id}")
	public List<Topic> getCourseById() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Java SE 8", "Java SE 8 Description"),
				new Topic("python", "Python Django", "Python Django Description"),
				new Topic("c", "C Basic", "C Basic Description")
				);
	}
}
