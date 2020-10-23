package com.example.madlevel4example

import android.view.LayoutInflater
import kotlinx.android.synthetic.main.item_reminder.view.*


import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ReminderAdapter(private val reminders: List<Reminder>) : RecyclerView.Adapter<ReminderAdapter.ViewHolder>(){


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        //val binding = ItemReminderBinding.bind(itemView)

        fun databind(reminder: Reminder) {
            itemView.tvReminder.text = reminder.reminderText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_reminder, parent, false)
            )
        }

    override fun getItemCount(): Int {
        return reminders.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(reminders[position])
    }


}