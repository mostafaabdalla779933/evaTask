package com.example.sample.ui.doctor

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.evaph.core.base.BaseActivity
import com.example.sample.databinding.ActivityDoctorBinding
import com.example.sample.ui.adapter.DoctorAdapter
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DoctorActivity : BaseActivity<ActivityDoctorBinding, DoctorViewModel>() {


    val TAG = "main"
    lateinit var myAdapter : DoctorAdapter
    override fun initBinding(): ActivityDoctorBinding {
        return ActivityDoctorBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(this)[DoctorViewModel::class.java]
    }

    override fun onActivityCreated() {
        myAdapter = DoctorAdapter(listOf())
        binding.recy.apply {
            layoutManager= LinearLayoutManager(applicationContext)
            adapter=myAdapter
        }
        showLoading()
        viewModel.getDoctors().observe(this, {

            myAdapter.list = it.data?.doctorList
            myAdapter.notifyDataSetChanged()
            hideLoading()
        })
    }

}