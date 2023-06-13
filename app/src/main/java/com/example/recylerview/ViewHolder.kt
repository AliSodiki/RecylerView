package com.example.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):RecyclerView.ViewHolder(inflater.inflate(R.layout.recyelerview_templet, parent, false)) {

    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtsubTitle: TextView? =null

    init {
        imgView = itemView.findViewById(R.id.img_view)
        txtTitle = itemView.findViewById(R.id.txt_title)
        txtsubTitle= itemView.findViewById(R.id.txt_sub_title)
    }

    fun bind(data: SocialMedia){
        imgView?.setImageResource(data.imageView)
        txtTitle?.text = data.txtTitle
        txtsubTitle?.text = data.txtSubTitle
        

    }
}