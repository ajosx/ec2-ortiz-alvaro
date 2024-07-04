package pe.idat.ec2_ortiz_alvaro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import pe.idat.ec2_ortiz_alvaro.model.test

@Composable
fun EjemploSimpleRecycler() {
    val lista = listOf("Luis", "Marcos", "Milagros", "Pablo", "German")
    LazyColumn {
        item { Text(text = "Primer item") }
        item { Text(text = "Primer item") }
        item { Text(text = "Primer item") }
        item { Text(text = "Primer item") }
        items(7) { contador ->
            Text(text = "Item $contador")
        }
        items(lista) { nombre ->
            Text(text = "Hola $nombre")
        }
    }
}

@Composable
fun EjemploRecyclerCard() {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(listartest()) { test ->
            ItemRecycler(test = test)
        }
    }
}

@Composable
fun ItemRecycler(test: test) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = test.imagen), contentDescription = "img",
                modifier = Modifier.width(200.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = test.titulo, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(15.dp))
                Text(text = test.descripcion)
            }
        }
    }
}

fun listartest(): List<test> {
    return listOf(
        test(
            "Test de Rorschach", "Uso de manchas para apsctos de la personalidad", "",
            R.drawable.ic_launcher_background
        ),
        test(
            "MMPI", "Cuestionario de autoevaluación", "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Test de Inteligencia de Wechsler",
            "Pruebas de medición de inteligencia y capacidad en adutltos",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Inventario de depresión de Beck", "Autoevaluación para medir grado de depresión",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Test de Apercepción", "Presentación de imagenes ambiguas y que el sujeto de evaluaci´pon cuente una historia",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Cuestionario de Personalidad de Eyesenck", "Evaluacipon de las dimensiones de la personalidad",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Escala de ansiedad de Hamilton", "Cuestionario clínico para medir la ansiedad",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Inventario de ansiedad Estado-Rasgo", "Evaluación de la ansiedad como un estado temporal y parte de la personalidad",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Test de Stroop", "Evalua la atención selectiva",
            "",
            R.drawable.ic_launcher_background
        ),
        test(
            "Test de dender Gestalt", "Evaluación del desarrollo preceptivo motor",
            "",
            R.drawable.ic_launcher_background
        ),
    )
}