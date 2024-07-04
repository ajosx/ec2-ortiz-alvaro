package pe.idat.ec2_ortiz_alvaro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.idat.ec2_ortiz_alvaro.ui.theme.Ec2ortizalvaroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ec2ortizalvaroTheme {
                Column(
                    Modifier
                        .padding(top = 28.dp)
                        .fillMaxSize()
                ) {
                    var nombre by rememberSaveable {
                        mutableStateOf("")
                    }
                    titulo()
                    EjemploDivider()
                    platosfavoritos(nombre) { nombre = it }
                    EjemploDivider()
                    pregunta2(nombre) {nombre = it}
                    EjemploDivider()
                    pregunta3(nombre) {nombre = it}
                    EjemploDivider()
                    pregunta4(nombre) {nombre = it}
                    EjemploDivider()
                    pregunta5(nombre) {nombre = it}
                    EjemploDivider()
                    button()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ec2ortizalvaroTheme {

    }
}