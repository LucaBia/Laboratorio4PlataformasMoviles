package com.example.gianlucariverabiagioni.lab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class Lab2Activity : AppCompatActivity() {

    //var mywebview: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1)

        //Declaracion del WebView
        val myWebView: WebView = this.findViewById(R.id.WebView1)
        //Se pasa el link que se desea observar en el webview
        myWebView.loadUrl("https://github.com/LucaBia/ProgramacionPlataformasM-vilesUVG/tree/master/Lab3Contactos")

    }
}