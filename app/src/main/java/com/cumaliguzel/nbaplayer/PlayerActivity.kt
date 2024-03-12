package com.cumaliguzel.nbaplayer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cumaliguzel.nbaplayer.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent=intent
        val selectedPlayer=Mysingleton.chossenNbaPlayer

        selectedPlayer?.let {
            binding.nameTxt.text=it.name
            binding.teamInfoTxtt.text=it.team
            binding.heightTxt.text=it.height
            binding.imageView.setImageResource(selectedPlayer.image)
        }



    }
}