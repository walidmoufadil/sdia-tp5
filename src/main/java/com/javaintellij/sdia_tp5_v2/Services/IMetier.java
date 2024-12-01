package com.javaintellij.sdia_tp5_v2.Services;

import com.javaintellij.sdia_tp5_v2.Entities.*;

import java.util.List;


public interface IMetier {
    List<Professeur> getAllProfesseurs();
    List<Professeur> searchProfesseurs(String keyword);
    void addProfesseur(Professeur professeur);
    void deleteProfesseur(int idProf);
    void updateProfesseur(Professeur professeur);

    // Departement operations
    void addDepartement(Departement departement);
    List<Departement> getAllDepartements();
    void deleteDepartement(int idDepart);
    void updateDepartement(Departement departement);
    List<Professeur> getProfesseursByDepartement(int idDepart);
}