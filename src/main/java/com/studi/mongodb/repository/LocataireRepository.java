package com.studi.mongodb.repository;

import com.studi.mongodb.pojo.Locataire;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocataireRepository extends MongoRepository<Locataire, ObjectId> {
}
