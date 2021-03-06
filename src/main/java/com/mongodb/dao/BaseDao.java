package com.mongodb.dao;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public interface BaseDao {
	MongoTemplate mongoTemplate();

	boolean exists(Query query, String collectionName);

	long count(Query query, String collectionName);

	<T> List<T> find(Query query, Class<T> entityClass, String collectionName);

	void save(Object objectToSave, String collectionName);

	void remove(Query query, String collectionName);

	void update(Query query, Update update, String collectionName);
}
