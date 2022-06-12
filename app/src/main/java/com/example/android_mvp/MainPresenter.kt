package com.example.android_mvp

class MainPresenter (private val mainView : MainView) {

    fun hitungLuasPersegiPanjang(panjang : Float, lebar : Float){
        if(panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return }
        if(lebar == 0F){
            mainView.showError("Lebar tidak boleh 0")
            return }
        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPanjang(panjang : Float, lebar : Float){
        if(panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return }
        if(lebar == 0F){
            mainView.showError("Lebar tidak boleh 0")
            return }
        val keliling = 2 * (panjang * lebar)
        mainView.updateKeliling(keliling)
    }

    fun hitungLuasPersegi(sisi : Float){
        if(sisi == 0F){
            mainView.showError("Sisi tidak boleh 0")
            return }
        val pluas = sisi * sisi
        mainView.updateLuasP(pluas)
    }

    fun hitungKelilingPersegi(sisi : Float){
        if(sisi == 0F){
            mainView.showError("Sisi tidak boleh 0")
            return }
        val pkeliling = 4 * sisi
        mainView.updateKelilingP(pkeliling)
    }
}