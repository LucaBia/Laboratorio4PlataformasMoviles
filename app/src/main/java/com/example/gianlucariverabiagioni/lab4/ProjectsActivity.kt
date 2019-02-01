package com.example.gianlucariverabiagioni.lab4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button


class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        val boton = findViewById<Button>(R.id.btnLab1)
        boton.setOnClickListener{val intent = Intent(this,Lab1Activity::class.java)
            startActivity(intent)}

        val boton2 = findViewById<Button>(R.id.btnLab2)
        boton2.setOnClickListener{val intent2 = Intent(this,Lab2Activity::class.java)
            startActivity(intent2)}
    }

    /*fun abrirlaboratorio2(view: View){
        val myWebView: WebView = findViewById(R.id.WV)
        myWebView.loadUrl("https://github.com/18250MariaInes/Aplicaciones-moviles/tree/master/Laboratorio2")

    }*/
}
