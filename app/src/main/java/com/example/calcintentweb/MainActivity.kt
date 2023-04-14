package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Buttoncalc:Button
    lateinit var Buttonweb:Button
    lateinit var Buttonintent:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.Btn_calc)
        Buttonweb=findViewById(R.id.Btn_web)
        Buttonintent=findViewById(R.id.Btn_intent)
        Buttoncalc.setOnClickListener {
            val intent=Intent(this,CalcuclatorActivity::class.java)
            startActivity(intent)
        }
        Buttonweb.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
        Buttonintent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }


    }
}