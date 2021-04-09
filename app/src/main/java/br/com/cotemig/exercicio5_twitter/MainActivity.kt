package br.com.cotemig.exercicio5_twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.item_feed.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var feed = ArrayList<Post>()
        feed.add(
            Post(
                R.drawable.tobias_profile_pic,
                "Tobias van Schneider",
                "@vanschneider",
                "20m",
                "My girlfriend is not even gone for more than 24h (traveling) and I managed to make the apartment look like this:",
                R.drawable.tobias_tweet_image
            )
        )

        feed.add(
            Post(
                R.drawable.oykun_profile_pic,
                "Oykun",
                "@oykun",
                "1m",
                "New addiction: Suits! #amazonprime",
                0
            )
        )

        feed.add(
            Post(
                R.drawable.azizfirat_profile_pic,
                "Aziz Firat",
                "@azizfirat",
                "2m",
                "Late night designing or playing Fifa?",
                0
            )
        )

        feed.add(
            Post(
                R.drawable.jonatan_profile_pic,
                "Jonatan Castro",
                "@jonatan",
                "2m",
                "Designer’s worst nightmare: designing its own portfolio.",
                0
            )
        )

        
    }
}