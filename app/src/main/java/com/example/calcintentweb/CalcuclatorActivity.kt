package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalcuclatorActivity : AppCompatActivity() {
    lateinit var Tv_answer:TextView
    lateinit var edt_firstnumber:EditText
    lateinit var edt_secondnumber:EditText
    lateinit var button_add:Button
    lateinit var button_subtract:Button
    lateinit var button_divide: Button
    lateinit var button_multiply: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcuclator)
        Tv_answer=findViewById(R.id.Txt_answer)
        edt_firstnumber=findViewById(R.id.editTextNumber)
        edt_secondnumber=findViewById(R.id.editTextNumber2)
        button_add=findViewById(R.id.Btn_add)
        button_divide=findViewById(R.id.Btn_divide)
        button_multiply=findViewById(R.id.Btn_multiply)
        button_subtract=findViewById(R.id.Btn_subtract)

        button_add.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="please fill in all inputs"
            }else{
                //lets calculate
                var answer=myfirstnumber.toDouble()+mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        button_subtract.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="please fill in all inputs"
            }else{
                //lets calculate
                var answer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }
        button_divide.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="please fill in all inputs"
            }else{
                //lets calculate
                var answer=myfirstnumber.toDouble()/mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }

        button_multiply.setOnClickListener {
            var myfirstnumber=edt_firstnumber.text.toString()
            var mysecondnumber=edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                Tv_answer.text="please fill in all inputs"
            }else{
                //lets calculate
                var answer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }


    }
}