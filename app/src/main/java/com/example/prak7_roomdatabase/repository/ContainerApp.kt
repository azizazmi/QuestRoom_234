package com.example.prak7_roomdatabase.repository

import android.app.Application
import android.content.Context
import com.example.prak7_roomdatabase.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
    ContainerApp {
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

}

