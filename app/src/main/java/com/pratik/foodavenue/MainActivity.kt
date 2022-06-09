package com.pratik.foodavenue

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById<WebView>(R.id.webview)

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://pratik4768.github.io/food-av/")

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

    }

    override fun onBackPressed() {
        if(webView.canGoBack())
            webView.goBack()
        else
        super.onBackPressed()
    }
}