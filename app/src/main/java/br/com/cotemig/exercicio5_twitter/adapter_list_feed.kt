package br.com.cotemig.exercicio5_twitter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class adapter_list_feed(var context: Context, var feed: List<Post>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.item_feed, null)

        if (feed[position].profile_picture != 0) {
            var profile_picture = view.findViewById<ImageView>(R.id.profile_picture) // ID do meu XML Item_Lista
            profile_picture.setImageDrawable(context.getDrawable(feed[position].profile_picture)) // nome da variável na classe POST
        }

        var name_user = view.findViewById<TextView>(R.id.name_user) // ID do meu XML
        name_user.text = feed[position].name_user // nome da variável da classe POST

        var arroba_user = view.findViewById<TextView>(R.id.arroba_user)
        arroba_user.text = feed[position].arroba_user

        var time_post = view.findViewById<TextView>(R.id.time_post)
        time_post.text = feed[position].time_post

        var tweet_text = view.findViewById<TextView>(R.id.tweet_text)
        tweet_text.text = feed[position].tweet_text

        var tweet_image = view.findViewById<ImageView>(R.id.tweet_image)
        if (feed[position].tweet_image == 0) {
            tweet_image.visibility = ImageView.GONE
        }else{
            tweet_image.setImageDrawable(context.getDrawable(feed[position].tweet_image))
        }
        return view
    }

    override fun getItem(position: Int): Any {
        return ""
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return feed.size
    }

}