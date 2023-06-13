package com.example.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyelerview: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyelerview.layoutManager = LinearLayoutManager(this)
        recyelerview.adapter = adapter
    }

    private fun init(){
        recyelerview = findViewById(R.id.recycler_view)

        var data = ArrayList<SocialMedia>()
        data.add(SocialMedia(R.drawable.facebook, "facebook", "facebook icon"))
        data.add(SocialMedia(R.drawable.instagram, "instagram", "instagram icon"))
        data.add(SocialMedia(R.drawable.whatsapp, "whatsapp", "whatsapp icon"))
        data.add(SocialMedia(R.drawable.telegram, "telegram", "telegram icon"))
        data.add(SocialMedia(R.drawable.twitter, "twitter", "twitter icon"))
        data.add(SocialMedia(R.drawable.discord, "discord", "discord icon"))
        data.add(SocialMedia(R.drawable.youtube, "youtube", "youtube icon"))
        data.add(SocialMedia(R.drawable.linkedin, "linkedin", "linkedin icon"))
        data.add(SocialMedia(R.drawable.github, "github", "github icon"))


        adapter = MyAdapter(data)

    }

}