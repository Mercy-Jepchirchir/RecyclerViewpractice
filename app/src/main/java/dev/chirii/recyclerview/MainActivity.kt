package dev.chirii.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.chirii.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNames()

    }
    fun displayNames(){
        var namesList = listOf("Kayitete","susan","Chirii","grace","mercy","lucy")
        var namesAdapter = NamesRecyclerViewAdapter(namesList)
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        binding.rvNames.adapter = namesAdapter
    }
}