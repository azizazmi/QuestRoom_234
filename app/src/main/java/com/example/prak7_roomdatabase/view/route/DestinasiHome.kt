package com.example.prak7_roomdatabase.view.route

import com.example.prak7_roomdatabase.R

object DestinasiHome: DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"

}