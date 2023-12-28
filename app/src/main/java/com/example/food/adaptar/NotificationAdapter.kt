package com.example.food.adaptar

import android.app.Notification
import android.media.Image
import android.media.MediaSession2Service.MediaNotification
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.food.databinding.NotificationItemBinding


class NotificationAdapter(private val notification: ArrayList<String>, private  val notificationImage :ArrayList<Int>): RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
       val binding = NotificationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NotificationViewHolder(binding)
    }



    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
       holder.bind(position)
        
    }
    override fun getItemCount(): Int = notification.size
    inner class NotificationViewHolder(private val bingding: NotificationItemBinding) :RecyclerView.ViewHolder(bingding.root) {
        fun bind(position: Int) {
            bingding.apply {
                NotificationtextView.text = notification[position]
                NotificationimageView.setImageResource(notificationImage[position])
            }

        }

    }
}