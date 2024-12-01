# Gestion des Départements et Professeurs

## Description
Ce projet est une application de bureau développée en **JavaFX** qui permet de gérer les départements et les professeurs d'une organisation (par exemple, une université). Il intègre une base de données relationnelle pour stocker les informations et fournit une interface utilisateur intuitive pour effectuer des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) sur les départements et les professeurs.

## Fonctionnalités
- **Gestion des Départements :**
    - Ajouter un nouveau département.
    - Modifier les informations d'un département.
    - Supprimer un département.
    - Lister tous les départements.

- **Gestion des Professeurs :**
    - Ajouter un professeur.
    - Modifier les informations d'un professeur.
    - Supprimer un professeur.
    - Affecter un professeur à un département.
    - Rechercher des professeurs par mots-clés (nom, prénom, CIN, etc.).

- **Interface utilisateur interactive :**
    - Liste des départements affichée dans un `ListView`.
    - Liste des professeurs affichée dans un `TableView`.
    - Requêtes dynamiques et mise à jour de la base de données en temps réel.

## Technologies utilisées
- **Langage :** Java (JDK 17+)
- **Framework :** JavaFX pour l'interface utilisateur.
- **Base de données :** MySQL (ou toute base de données relationnelle compatible JDBC).
- **Gestion de la connexion :** Singleton Pattern pour la gestion des connexions à la base de données.
- **IDE recommandé :** IntelliJ IDEA (Premium recommandé pour JavaFX).

## Prérequis
1. **Java Development Kit (JDK)** :
    - Installez Java 17 ou supérieur. [Télécharger ici](https://www.oracle.com/java/technologies/javase-downloads.html).
2. **Base de données MySQL** :
    - Configurez une base de données MySQL avec les tables nécessaires.
3. **JavaFX SDK** :
    - Téléchargez et configurez JavaFX. [Guide officiel](https://openjfx.io).
4. **IntelliJ IDEA** :
    - Utilisez l'IDE IntelliJ IDEA pour importer et exécuter le projet.

## Configuration de la base de données
Créez une base de données MySQL et configurez les tables comme suit :

### Script de création de la base de données
```sql
CREATE DATABASE gestion_universite;

USE gestion_universite;

CREATE TABLE departement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL
);

CREATE TABLE professeur (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    cin VARCHAR(20) UNIQUE NOT NULL,
    telephone VARCHAR(15),
    email VARCHAR(255),
    date_recrutement DATE NOT NULL,
    departement_fk INT,
    FOREIGN KEY (departement_fk) REFERENCES departement(id)
);
