package expo.turismo.takatuli.Modelo

import java.sql.Connection
import java.sql.DriverManager

class ClaseConexion {
    fun cadenaConexion(): Connection?{

        try {
            val url = "jdbc:oracle:thin:@10.10.0.151:1521:xe"
            val usuario = "TakatuliPTC"
            val contrasena = "Takatuli2A"

            val connection = DriverManager.getConnection(url,usuario,contrasena)
            return connection

        }

        catch (e: Exception){
            println("Este es el error: $e")
            return null
        }
    }
}