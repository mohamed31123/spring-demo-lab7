# 🎓 Spring Boot Student Management API

> TP 7 — Cours : Développement JakartaEE : Spring  
> API REST complète avec Spring Boot, JPA, MySQL et Swagger

---

## 📋 Description

Application Spring Boot de gestion des étudiants exposant une API REST documentée avec Swagger (springdoc-openapi). Elle permet de créer, lire, modifier et supprimer des étudiants, ainsi que de consulter des statistiques par année.

---

## 🏗️ Structure du projet

<img width="900" height="1100" alt="architecture" src="https://github.com/user-attachments/assets/e37f183d-ceff-4f5e-b45d-1a63a5ce4435" />





https://github.com/user-attachments/assets/5c9aa2a3-7775-4992-9ece-285ff9c33d28



## Video Demo : 



```

---

## ⚙️ Technologies utilisées

| Technologie | Version |
|---|---|
| Java | 17 |
| Spring Boot | 3.2.0 |
| Spring Data JPA | - |
| MySQL | - |
| Swagger (springdoc-openapi) | 2.3.0 |
| JUnit 5 | - |
| Mockito | - |

---

## 🚀 Lancer le projet

### Prérequis
- Java 17+
- Maven
- MySQL

### Configuration base de données

Dans `src/main/resources/application.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Démarrage

```bash
./mvnw spring-boot:run
```

---

## 📡 Endpoints API

Base URL : `http://localhost:8080/api`

| Méthode | URL | Description |
|---|---|---|
| `POST` | `/students/save` | Créer un étudiant |
| `GET` | `/students/getAll` | Récupérer tous les étudiants |
| `GET` | `/students/get/{id}` | Récupérer un étudiant par ID |
| `PUT` | `/students/update/{id}` | Modifier un étudiant |
| `DELETE` | `/students/delete/{id}` | Supprimer un étudiant |
| `GET` | `/students/count` | Compter les étudiants |
| `GET` | `/students/byYear` | Statistiques par année |

### Exemple de requête POST

```json
{
    "nom": "Alice Dupont",
    "email": "alice@example.com",
    "dateNaissance": "2004-09-28"
}
```

---

## 📖 Documentation Swagger

Une fois l'application lancée, accéder à :

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🧪 Tests unitaires

Les tests utilisent **JUnit 5** et **Mockito** pour tester le `StudentController` en isolation.

```bash
./mvnw test
```

### Tests couverts

- `testSaveStudent()` — création d'un étudiant
- `testDeleteStudent()` — suppression
- `testFindAllStudents()` — liste complète
- `testCountStudents()` — comptage
- `testFindByYear()` — statistiques par année

---

## 📝 Étapes du TP

1. Analyse du fichier `pom.xml`
2. Vue d'ensemble
3. Création du projet avec Spring Initializr
4. Configuration de la base de données MySQL
5. Création de l'entité et du Repository
6. Création des Services et Contrôleurs REST
7. Lancer et tester l'application
8. Tests unitaires avec JUnit 5 et Mockito
9. Intégration de Swagger

---

## 👨‍💻 Auteur :: EDDINARI MOHAMED 

Projet réalisé dans le cadre du cours **Développement JakartaEE : Spring** — FST
