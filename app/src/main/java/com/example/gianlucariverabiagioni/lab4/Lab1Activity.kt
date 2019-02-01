package com.example.gianlucariverabiagioni.lab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView


class Lab1Activity : AppCompatActivity() {

    //var mywebview: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1)

        val myWebView: WebView = this.findViewById(R.id.WebView1)
        myWebView.loadUrl("https://github.com/LucaBia/ProgramacionPlataformasM-vilesUVG/tree/master/Lab2")

    }
}
