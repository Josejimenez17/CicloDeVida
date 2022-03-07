package com.example.ejemplovidadeunaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var nombre= "Jose"
    val NOMBRE="nombre"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton= findViewById<Button>(R.id.boton)


//
        boton.setOnClickListener {
            nombre="Jose"
            Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        nombre=savedInstanceState?.getString(NOMBRE)!!
        Toast.makeText(this, nombre, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState?.putString(NOMBRE, nombre)
    }

    //OnPause
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "En transicion", Toast.LENGTH_SHORT).show()
    }
    //onStop
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Aplicativo oculto", Toast.LENGTH_SHORT).show()
    }
    //onresumE
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Aplicativo visible", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "App destruida", Toast.LENGTH_SHORT).show()
    }
}