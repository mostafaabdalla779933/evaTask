package com.example.sample.ui.employee

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import com.evaph.core.base.BaseActivity
import com.example.sample.ui.doctor.DoctorActivity
import com.example.sample.databinding.ActivityEmployeeListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EmployeeListActivity : BaseActivity<ActivityEmployeeListBinding, EmployeeViewModel>() {

    override fun initBinding(): ActivityEmployeeListBinding {
        return ActivityEmployeeListBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(this)[EmployeeViewModel::class.java]
    }

    override fun onActivityCreated() {

       startActivity(Intent(this, DoctorActivity::class.java))
       // startActivity(Intent("com.example.sample.sample.ui.main.open").setPackage(this.packageName))

       /* binding.btnCallApi.setOnClickListener {
            showLoading()
            viewModel.getEmployee().observe(this, {
                binding.rvEmployee.adapter = EmployeeAdapter(it.data)
                hideLoading()
            }
            )
        }*/
    }


}