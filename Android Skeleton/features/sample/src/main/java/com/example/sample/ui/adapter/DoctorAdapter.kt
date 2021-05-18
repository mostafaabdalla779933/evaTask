package com.example.sample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.R
import com.example.sample.databinding.DoctorRowBinding
import com.example.sample.model.Doctor


class DoctorAdapter (var list: List<Doctor?>?) :RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder>(){

  inner class DoctorViewHolder(private val binding: DoctorRowBinding) :RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Doctor) {

            binding.circleImageView.setImageResource(R.drawable.person)
            binding.name.text= item.doctorName
            binding.spec.text = item.specialist
            binding.avaliable.text = item.availableFrom?.split("from ")?.get(1) ?: ""
            binding.follow.text = "follow-up " + item.followup.toString() +" EGP"
            binding.fees.text = "fees " + item.fees.toString() +" EGP"
        }
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {

        return DoctorViewHolder(
            DoctorRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        list?.get(position)?.let { holder.bind(it) }


    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }


}



