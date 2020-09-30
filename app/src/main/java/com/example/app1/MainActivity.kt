package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(MainActivity::class.java.name, "Es un log v") //Accede a la clase y mira su nombre en Java
        Log.d(MainActivity::class.java.name, "Es un log d de debugger") //Para programar una app y que cuando acabe se borren estos logs
        Log.i(MainActivity::class.java.name, "Es un log i information") //Parecido al w, se pueden alternar.
        Log.w(MainActivity::class.java.name, "Es un log w warning") //Importantes. Cuando algo no debería pasar pero pasa, y lo tenemos controlado.
        Log.e(MainActivity::class.java.name, "Es un log e error") //Importante. Al hacer try catch


        var hola = getString(R.string.hello)
    }
}