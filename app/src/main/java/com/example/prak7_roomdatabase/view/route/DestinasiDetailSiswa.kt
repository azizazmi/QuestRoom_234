package com.example.prak7_roomdatabase.view.route

import com.example.prak7_roomdatabase.R

object DestinasiDetailSiswa: DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
