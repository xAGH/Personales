package com.example.tallernotas.models

data class Estudiante (
    private var documento: Int,
    private var nombre: String,
    private var edad: Int,
    private var telefono: String,
    private var direccion: String,
    private var nota1: Double,
    private var nota2: Double,
    private var nota3: Double,
    private var nota4: Double,
    private var nota5: Double,
    private var promedio: Double
    ) {}