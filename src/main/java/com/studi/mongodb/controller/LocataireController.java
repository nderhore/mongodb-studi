package com.studi.mongodb.controller;


import com.studi.mongodb.pojo.Locataire;
import com.studi.mongodb.service.LocataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRegistration.API_LOCATAIRE)
public class LocataireController {

    @Autowired
    private LocataireService locataireService;

    @GetMapping
    public List<Locataire> getAllLocataire(){
        return locataireService.getAllLocataire();
    }

    @PostMapping
    public void createLocataire(@RequestBody Locataire locataire){
        locataireService.createLocataire(locataire);
    }

    @DeleteMapping("{id}")
    public void deleteLocataire(@PathVariable(name = "id") String id){
        locataireService.deleteLocataire(id);
    }



}
