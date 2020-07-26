package com.nabil.detikcomapp.NewsAdapter

import com.nabil.detikcomapp.R

data class news(var title: String, var desc: String, var detail: String, var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news("Berita 1",
            "Detikcom | 2 Dua jam yang lalu",
            "ini adalah detail",
            R.drawable.img_news1),

        news("Berita 2",
            "Detikcom | 2 Dua hari yang lalu",
            "ini adalah detail 2",
        R.drawable.img_news2),

        news("Berita 3",
            "Detikcom | 3 menit yang lalu",
            "ini adalah detail 3"
            ,R.drawable.img_news3),

        news("Berita 4",
            "Detikcom | 5 menit yang lalu",
            "ini adalah detai 3",
            R.drawable.img_news4)

    )
}