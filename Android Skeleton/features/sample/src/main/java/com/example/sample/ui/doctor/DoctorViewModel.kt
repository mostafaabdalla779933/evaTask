package com.example.sample.ui.doctor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.evaph.core.base.BaseViewModel
import com.example.sample.model.response.DoctorResponse
import com.example.sample.repo.DoctorRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DoctorViewModel@Inject constructor(private val doctorRepo: DoctorRepo): BaseViewModel() {


    fun getDoctors(): LiveData<DoctorResponse> {
        val mutableLiveData = MutableLiveData<DoctorResponse>()
        viewModelScope.launchCatching(
            block = {
                val response = doctorRepo.getDoctors()
                mutableLiveData.value = response
            }, onError = ::handleError
        )

        return mutableLiveData;
    }

}