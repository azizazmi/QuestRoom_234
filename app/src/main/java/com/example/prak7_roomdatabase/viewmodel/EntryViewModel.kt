package com.example.prak7_roomdatabase.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.prak7_roomdatabase.repository.RepositoriSiswa

class EntryViewModel (private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private fun validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa): Boolean {
        return with(uiState) {
            nama.isNotBlank() && alamat.isNotBlank() && telpon.isNotBlank()
        }
    }
}