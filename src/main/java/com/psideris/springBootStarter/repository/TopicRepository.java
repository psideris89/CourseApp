package com.psideris.springBootStarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.psideris.springBootStarter.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

	
	// getTopics()
	// getTopic(String Id)
	// updateTopic(Topic t)
	// deleteTopic(String Id)
}
