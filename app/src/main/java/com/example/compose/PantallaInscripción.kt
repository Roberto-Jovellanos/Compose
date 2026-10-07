package com.example.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.ui.Alignment


@Composable
    fun PantallaInscripcion(modifier : Modifier = Modifier) {

        var nombre by remember {
            mutableStateOf("")
        }

        var email by remember {
            mutableStateOf("")
        }

        var recordatorio by remember {
            mutableStateOf(false)
        }

        var turno by remember {
            mutableStateOf("Mañana")
        }

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Text("Inscripción")

            var nombre = ""
            CampoNombre(
                nombre = nombre,
                onNombreChange = { nuevoNombre ->
                    nombre = nuevoNombre
                }
            )

            var email = ""
            CampoEmail(
                email = email,
                onEmailChange = { nuevoEmail ->
                    email = nuevoEmail
                }
            )

            Text("Elige un turno")

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = turno == "Mañana",
                    onClick = {
                        turno = "Mañana"
                    }
                )

                Text("Mañana")
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = recordatorio,
                    onCheckedChange = { nuevoValor ->
                        recordatorio = nuevoValor
                    }
                )

                Text("Quiero recibir un recordatorio")
            }

            Button(
                onClick = {
                    println("Nombre: $nombre" + "\nEmail: $email")
                }
            ) {
                Text("Continuar")
            }
        }
    }
