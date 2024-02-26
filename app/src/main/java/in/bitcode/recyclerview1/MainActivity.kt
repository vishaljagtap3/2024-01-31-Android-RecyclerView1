package `in`.bitcode.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerCities : RecyclerView
    private val cities = ArrayList<String>()
    private lateinit var citiesAdapter: CitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerCities = findViewById(R.id.recyclerCities)

        for(i in 0..200) {
            cities.add("Pune-$i")
            cities.add("Mum-$i")
            cities.add("Ngp-$i")
        }

        citiesAdapter = CitiesAdapter(cities)
        recyclerCities.adapter = citiesAdapter

        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        recyclerCities.layoutManager = linearLayoutManager
    }
}