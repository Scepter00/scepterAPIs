package com.application.scepter.data.repositories;

import com.application.scepter.data.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
