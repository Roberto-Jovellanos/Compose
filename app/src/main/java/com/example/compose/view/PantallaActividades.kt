package com.example.compose.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compose.model.actividadesEjemplo
import com.example.compose.view.components.ActividadItems


@Composable
fun PantallaActividades(
        modifier : Modifier = Modifier,
        onVerDetalle: (Int) -> Unit) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(actividadesEjemplo) { actividad ->
                ActividadItems(
                    actividad = actividad,
                    onVerDetalle = {
                        onVerDetalle(actividad.id)
                    }
                )
            } //recorre una lista y da el valor
        }
    }
