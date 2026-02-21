package com.kothapalli.courseapi.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("java", "Core Java", "Core Java Course"),
//            new Topic("spring", "Spring Boot 4.0", "Spring Boot Course"),
//            new Topic("javascript", "JavaScript ES6", "JavaScript Course")));

    public List<Topic> getAllTopics() {
        // return topics
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic) {
//        for(int i = 0; i < topics.size(); i++) {
//            if(topics.get(i).getId().equals(topic.getId())) {
//                topics.set(i, topic);
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        //topics.removeIf(topic -> topic.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
