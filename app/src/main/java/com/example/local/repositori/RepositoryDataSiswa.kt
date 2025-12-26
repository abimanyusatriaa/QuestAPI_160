package com.example.local.repositori

import com.example.local.apiservice.ServiceApiSiswa
import com.example.local.modeldata.DataSiswa


interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
    //edit: tambahkan fungsi getSatuSiswa
    suspend fun getSatuSiswa(id: Int): DataSiswa


}
class jaringanRepositoryDataSiswa (
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2
    .Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)

}