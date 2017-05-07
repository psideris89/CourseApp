package com.psideris.springBootStarter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.psideris.springBootStarter.entities.Topic;

@Service
public class TopicService {

	/*
	 * TODO
	 * Take topics from Database!!
	 */
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Java SE 8", "Java SE 8 Description"),
				new Topic("python", "Python Django", "Python Django Description"),
				new Topic("c", "C Basic", "C Basic Description"),
				new Topic("java", "Java SE 9", "Java 9 Documentation")
				));
	
	public void setAllTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	/*
	 * TODO
	 * Refine the logic here to handle exceptions
	 */
	public Topic getTopicById(String id) {
		return topics.stream().filter(e -> e.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic) {
		topics.stream()
				.filter(e -> e.getId().equals(id))
				.findFirst()
				.get()
				.setAllParameters(topic.getId(), topic.getName(), topic.getDescription());
	}
	
	public void deleteTopic(String id) {
		topics.removeIf(e -> e.getId().equals(id));		
	}
}
