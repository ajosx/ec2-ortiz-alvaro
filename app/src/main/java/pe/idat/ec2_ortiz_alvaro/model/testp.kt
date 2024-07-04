package pe.idat.ec2_ortiz_alvaro.model

import androidx.annotation.DrawableRes

data class test(
    var titulo: String,
    var descripcion: String,
    var fecha: String,
    @DrawableRes var imagen: Int
)