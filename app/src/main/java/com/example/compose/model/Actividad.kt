package com.example.compose.model

import com.example.compose.R

/* var es variable y val es que no cambiara */

data class Actividad(
    val id: Int,
    val nombre: String,
    val categoria: String,
    val descripcion: String,
    val imagen: Int,
    val modalidad: String = "Presencial"
)

val taller = Actividad(
    id = 1,
    nombre = "Taller de Android",
    categoria = "Tecnología",
    descripcion = "Construye tu primera aplicación con Compose.",
    imagen = R.drawable.baseline_360_24
)

val actividadesEjemplo = listOf(
    Actividad(
        id = 1,
        nombre = "Taller de Android",
        categoria = "Tecnología",
        descripcion = "Construye tu primera aplicación con Compose.",
        imagen = R.drawable.baseline_360_24
    ),
    Actividad(
        id = 2,
        nombre = "Ruta de senderismo",
        categoria = "Deporte",
        descripcion = "Recorre una ruta sencilla en grupo.",
        imagen = R.drawable.baseline_360_24
    ),
    Actividad(
        id = 3,
        nombre = "Fotografía con el móvil",
        categoria = "Arte",
        descripcion = "Practica encuadres y composición.",
        imagen = R.drawable.baseline_360_24
    )
)