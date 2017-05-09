package com.psideris.springBootStarter.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.psideris.springBootStarter.model.Topic;

public class LessonController {

	@RequestMapping("/lessons")
	public List<Topic> getAllLesson() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Java SE 8", "Java SE 8 Description"),
				new Topic("python", "Python Django", "Python Django Description"),
				new Topic("c", "C Basic", "C Basic Description")
				);
	}
	
	@RequestMapping("/lesson/{id}")
	public List<Topic> getLessonById() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Java SE 8", "Java SE 8 Description"),
				new Topic("python", "Python Django", "Python Django Description"),
				new Topic("c", "C Basic", "C Basic Description")
				);
	}
}
