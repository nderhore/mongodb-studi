package com.studi.mongodb.pojo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Appartement {

    @Id
    private ObjectId _id;

    private String adresse;

    private String ville;

    private String code_postal;

    private ObjectId locataireId;

    private Double loyer;

    public Appartement(String adresse, String ville, String code_postal, ObjectId locataireId, Double loyer) {
        this.adresse = adresse;
        this.ville = ville;
        this.code_postal = code_postal;
        this.locataireId = locataireId;
        this.loyer = loyer;
    }

    public Appartement(ObjectId _id, String adresse, String ville, String code_postal, ObjectId locataireId, Double loyer) {
        this._id = _id;
        this.adresse = adresse;
        this.ville = ville;
        this.code_postal = code_postal;
        this.locataireId = locataireId;
        this.loyer = loyer;
    }

    public Appartement() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public ObjectId getLocataireId() {
        return locataireId;
    }

    public void setLocataireId(ObjectId locataireId) {
        this.locataireId = locataireId;
    }

    public Double getLoyer() {
        return loyer;
    }

    public void setLoyer(Double loyer) {
        this.loyer = loyer;
    }
}
