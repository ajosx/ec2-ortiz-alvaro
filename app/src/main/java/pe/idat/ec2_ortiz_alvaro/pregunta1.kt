package pe.idat.ec2_ortiz_alvaro


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun titulo(){
    Text(text = "CUESTIONARIO")
}

@Composable
fun platosfavoritos(nombre: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Text(text = "1. Marque sus platos favoritos.")
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Arroz con pollo", onClick = { onItemSelected("Arroz con pollo") })
            Text(text = "Arroz con pollo", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Lomo Saltado", onClick = { onItemSelected("Lomo Saltado") })
            Text(text = "Lomo Saltado", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Aji de gallina", onClick = { onItemSelected("Aji de gallina") })
            Text(text = "Aji de gallina", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Tallarines", onClick = { onItemSelected("Tallarines") })
            Text(text = "Tallarines", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Arroz Chaufa", onClick = { onItemSelected("Arroz Chaufa") })
            Text(text = "Arroz Chaufa", Modifier.padding(top = 10.dp))
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            RadioButton(selected = nombre == "Otro", onClick = { onItemSelected("Otro") })
            Text(text = "Otro", Modifier.padding(top = 10.dp))
        }
    }

}


@Composable
fun preguntas(){}

@Composable
fun EjemploDivider() {
    Divider(
        Modifier
            .fillMaxWidth()
            .padding(top = 12.dp),
        color = Color.Blue
    )
}


