package com.example.calcintentweb

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi


class WebActivity : AppCompatActivity() {
    lateinit var mywebView:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        mywebView=findViewById(R.id.webView)
        webview()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webview(){
        mywebView.webViewClient= WebViewClient()
        mywebView.apply{
            loadUrl("https://www.instagram.com/")
            settings.javaScriptEnabled=true
//            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if(mywebView.canGoBack())mywebView.goBack()else
        super.onBackPressed()
    }
}