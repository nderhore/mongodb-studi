package com.studi.mongodb.service.impl;

import com.studi.mongodb.pojo.Locataire;
import com.studi.mongodb.repository.LocataireRepository;
import com.studi.mongodb.service.LocataireService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocataireServiceImpl implements LocataireService {

    @Autowired
    private LocataireRepository locataireRepository;


    @Override
    public List<Locataire> getAllLocataire() {
        return locataireRepository.findAll();
    }

    @Override
    public void createLocataire(Locataire locataire) {
        locataireRepository.save(locataire);
    }

    @Override
    public void deleteLocataire(String id) {
        locataireRepository.deleteById(new ObjectId(id));
    }
}
