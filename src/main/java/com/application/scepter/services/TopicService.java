package com.application.scepter.services;

import com.application.scepter.data.models.Topic;
import com.application.scepter.data.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<> (Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("Java", "Core Java", "Core Java Description"),
                new Topic("JavaScript", "JavaScript", "JavaScript Description")
        ));

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        //topics.add(topic);
        topicRepository.save(topic);
    }


    public void updateTopic(String id, Topic topic) {
        //for (int i = 0; i < topics.size(); i++) {
            //Topic t = topics.get(i);
            //if (t.getId().equals(id)) {
                //topics.set(i, topic);
                //return;
            //}
        //}
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
