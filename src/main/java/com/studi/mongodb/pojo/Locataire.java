package com.studi.mongodb.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Locataire {

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId _id;

    private String nom;

    private String prenom;

    private Telephone telephone;

    public Locataire() {
    }

    public Locataire(ObjectId _id, String nom, String prenom, Telephone telephone) {
        this._id = _id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public Locataire(String nom, String prenom, Telephone telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
