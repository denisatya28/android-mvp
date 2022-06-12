package com.example.android_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityMVP : AppCompatActivity(), MainView {
    private lateinit var etPanjang : EditText
    private lateinit var etLebar : EditText
    private lateinit var btnHitungLuas : Button
    private lateinit var btnHitungKeliling : Button
    private lateinit var tvHasil : TextView
    private lateinit var mainPresenter : MainPresenter

    private lateinit var etSisi : EditText
    private lateinit var btnLuasPersegi : Button
    private lateinit var btnKelilingPersegi : Button
    private lateinit var tvHasilPersegi : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mvp)

        mainPresenter = MainPresenter (this)
        etPanjang = findViewById(R.id.etpanjang)
        etLebar = findViewById(R.id.etlebar)
        btnHitungLuas = findViewById(R.id.btnLuas)
        btnHitungKeliling = findViewById(R.id.btnKeliling)
        tvHasil = findViewById(R.id.tvhasil)

        etSisi = findViewById(R.id.etsisi)
        btnLuasPersegi = findViewById(R.id.btnLuasP)
        btnKelilingPersegi = findViewById(R.id.btnKelilingP)
        tvHasilPersegi = findViewById(R.id.tvhasilP)


        btnHitungLuas.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPanjang(panjang, lebar)
        }

        btnHitungKeliling.setOnClickListener{
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPanjang(panjang, lebar)
        }

        btnLuasPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }

        btnKelilingPersegi.setOnClickListener{
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }

    }
    override fun updateLuas(luas:Float){
        tvHasil.text = luas.toString()
    }

    override fun updateKeliling(keliling:Float){
        tvHasil.text = keliling.toString()
    }

    override fun updateLuasP (pluas : Float){
        tvHasilPersegi.text = pluas.toString()
    }

    override fun updateKelilingP (pkeliling : Float){
        tvHasilPersegi.text = pkeliling.toString()
    }

    override fun showError(errorMsg : String){
        tvHasil.text = errorMsg
        tvHasilPersegi.text = errorMsg
    }
}