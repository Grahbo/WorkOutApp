package com.bignerdranch.android.WorkOut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.WorkOut.data.ExerciseEntity
import com.bignerdranch.android.WorkOut.databinding.ListItemBinding

class NotesListAdapter(private val notesList: List<ExerciseEntity>,
    private val listener: ListItemListener) :

    RecyclerView.Adapter<NotesListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val binding = ListItemBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = notesList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = notesList[position]
        with(holder.binding) {
            noteText.text = note.place
            root.setOnClickListener{
                listener.onItemClick(note.id)
            }
        }
    }

    interface ListItemListener{
        fun onItemClick(noteId: Int)
    }
}