-- Erstelle die Datenbank, wenn sie noch nicht existiert
CREATE DATABASE IF NOT EXISTS db_webproject;

-- Verwende die erstellte Datenbank
USE db_webproject;

-- Erstelle die "Users" Tabelle
CREATE TABLE IF NOT EXISTS Users (
                                     id INT AUTO_INCREMENT PRIMARY KEY,
                                     email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
    );

-- Füge einen Datensatz in die "Users" Tabelle ein
INSERT INTO Users (email, password) VALUES ('test@test.at', '123');