package com.projekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hitung2.*

class HitungActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung2)

        buttonHitung.setOnClickListener {
            var isEmptyField=false

            val stringPanjang = editPanjang.text.toString().trim()
            val stringLebar = editLebar.text.toString().trim()
            val stringTinggi = editTinggi.text.toString().trim()

            if(stringPanjang.equals("")){
                isEmptyField= true
                editPanjang.error = "Data Kosong"
            }
            if(stringLebar.isEmpty()){
                isEmptyField= true
                editLebar.error = "Data Kosong"

            }
            if(stringTinggi ==""){
                isEmptyField= true
                editTinggi.error = "Data Kosong"

            }

            if(!isEmptyField) {

                val panjang = stringPanjang.toFloat()
                val lebar = stringLebar.toFloat()
                val tinggi = stringTinggi.toFloat()

                textHasil.text = (panjang * lebar * tinggi).toString()

            }
        }
    }
}

