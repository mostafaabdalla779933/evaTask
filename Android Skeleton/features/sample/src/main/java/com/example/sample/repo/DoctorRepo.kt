package com.example.sample.repo

import com.evaph.core.base.BaseRepo
import com.example.sample.model.response.DoctorResponse
import com.example.sample.model.response.EmployeeResponse
import com.example.sample.network.Endpoints
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DoctorRepo @Inject constructor() : BaseRepo()  {

    suspend fun getDoctors() = withContext(Dispatchers.IO){
        networkManager.getRequest(
            api = Endpoints.DOCTORS,
            parseClass = DoctorResponse::class.java
        )
    }
}