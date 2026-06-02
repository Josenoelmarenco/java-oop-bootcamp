-- Ejercicio: SetupDB
-- Objetivo: levantar MariaDB en Docker y crear esquema base
-- Conceptos: SQL DDL, Docker

CREATE DATABASE IF NOT EXISTS bootcamp;
USE bootcamp;

CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL DEFAULT 0
);
