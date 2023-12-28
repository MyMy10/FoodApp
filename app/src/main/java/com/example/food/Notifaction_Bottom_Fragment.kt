package com.example.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.food.adaptar.NotificationAdapter
import com.example.food.databinding.FragmentNotifactionBottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class Notifaction_Bottom_Fragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNotifactionBottomBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentNotifactionBottomBinding.inflate(layoutInflater,container,false)
        val notification = listOf("Đơn hàng của bạn đã được hủy thành công","Đơn hàng của bạn đang được giao", "Đơn hàng đã giao thành công")
        val notificationImage = listOf(R.drawable.sademoji,R.drawable.truck, R.drawable.congrats)
        val adapter = NotificationAdapter(
            ArrayList(notification),
            ArrayList(notificationImage)
        )
binding.notificationRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.notificationRecyclerView.adapter =adapter
        return  binding.root

    }

    companion object {

    }
}