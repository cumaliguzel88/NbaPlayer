package com.cumaliguzel.nbaplayer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.cumaliguzel.nbaplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //crate arry
    private lateinit var nbaPlayerList : ArrayList<Player>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //array
        nbaPlayerList=ArrayList<Player>()
        binding.reyclerView.layoutManager=LinearLayoutManager(this)//verilerin linar gösterilişi
        val nbaAdapter = NbaAdapter(nbaPlayerList)//baglama
        binding.reyclerView.adapter=nbaAdapter//adaptor ve recyle rbağlama
        //object data player****************************************************************************************
        val adwers = Player("Anthony Edwards","Minosata Timberwolfs","1.93 m ", R.drawable.adwres_png)
        val alperen = Player("Alperen Sengun","Houstan Rockets","2.11 m",R.drawable.alperen_png)
        val ante =  Player("Giannis Antetokounmpo","Millwaukee Bucks","2.11 m",R.drawable.ante_png)
        val cater = Player("Vice Carter","Toronto","1.98 m ",R.drawable.cater)
        val cedi = Player("Cedi Osman","San Antoio Spurs","2.05 m",R.drawable.cedi_png)
        val cj = Player("Cj Maccolum","Pelicans","1.90 m ",R.drawable.cj_png)
        val curry = Player("Stephen Curry","Golden State","1.89 m  ",R.drawable.curry_png)
        val davis = Player("Anthony Davis","Los Angles Lakers","2.11 m ",R.drawable.davis_png)
        val durant = Player("Kevin Durant","Phonix","2.08 m  ",R.drawable.durant_png)
        val furki = Player("Furkan Korkmaz","Sixers","2.03 m  ",R.drawable.furki_png)
        val harden = Player("James Harden","Clippers","1.93 m",R.drawable.herden_png)
        val hido = Player("Hidayet Turkoglu","Magic","2.06 m ",R.drawable.hido_png)
        val leanardo = Player("Kawhi Leonard","Clippers","2.01 m ",R.drawable.leanordo)
        val lebron = Player("Lebron James","Los Angles Lakers","2.06 m ",R.drawable.lebron_png)
        val lillard = Player("Damian Lillard","Millwaukee Bucks","1.89 m ",R.drawable.lillard_png)
        val omerAsik = Player("Omer Asık","Bulls","2.16 m ",R.drawable.omer_png)
        val omerYurtseven = Player("Omer Yurtseven","Utah Jazz","2.10 m ",R.drawable.omerv2_png)
        val oneal = Player("Shaquille O'Nea","Los Angles Lakers","2.16 m ",R.drawable.oneal)
        val paul = Player("Paul George","Clippers","2.03 m ",R.drawable.paul)
        val rose = Player("Dereck Rose","Bulls","1.90 m ",R.drawable.rose)
        val tmac = Player("Tracy McGrady","Toronto","2.03 m ",R.drawable.tmac)
        val wesborrk = Player("Ruseel Wesbrook","Clipprs","1.90 m ",R.drawable.wesbrook)
        //add array data***************************************************************************************************
        nbaPlayerList.add(adwers)
        nbaPlayerList.add(alperen)
        nbaPlayerList.add(ante)
        nbaPlayerList.add(cater)
        nbaPlayerList.add(cedi)
        nbaPlayerList.add(cj)
        nbaPlayerList.add(curry)
        nbaPlayerList.add(davis)
        nbaPlayerList.add( durant)
        nbaPlayerList.add(furki)
        nbaPlayerList.add(harden)
        nbaPlayerList.add(hido)
        nbaPlayerList.add(leanardo)
        nbaPlayerList.add(lebron)
        nbaPlayerList.add(lillard)
        nbaPlayerList.add(omerAsik)
        nbaPlayerList.add(omerYurtseven)
        nbaPlayerList.add(oneal)
        nbaPlayerList.add(paul)
        nbaPlayerList.add(rose)
        nbaPlayerList.add(tmac)
        nbaPlayerList.add(wesborrk)













    }
}