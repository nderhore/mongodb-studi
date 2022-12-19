package com.studi.mongodb.pojo;

public class Telephone {

    private String numero;

    private String indicatifPays;

    public Telephone(String numero, String indicatifPays) {
        this.numero = numero;
        this.indicatifPays = indicatifPays;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIndicatifPays() {
        return indicatifPays;
    }

    public void setIndicatifPays(String indicatifPays) {
        this.indicatifPays = indicatifPays;
    }
}
