package com.studi.mongodb.service;

import com.studi.mongodb.pojo.Locataire;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LocataireService {

    List<Locataire> getAllLocataire();


    void createLocataire(Locataire locataire);

    void deleteLocataire(String id);
}
