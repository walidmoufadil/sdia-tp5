package com.javaintellij.sdia_tp5_v2.Entities;


public class Departement {
    private int id;
    private String nom;

    public Departement() {
    }

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}