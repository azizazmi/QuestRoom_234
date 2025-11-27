package com.example.prak7_roomdatabase.repository

import com.example.prak7_roomdatabase.room.Siswa
import com.example.prak7_roomdatabase.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun inserSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDao
): RepositoriSiswa {
    override fun getAllSiswaStream(): Flow<List<Siswa>> = siswaDao.getAllSiswa()
    override suspend fun inserSiswa(siswa: Siswa) = siswaDao.insert(siswa)
}