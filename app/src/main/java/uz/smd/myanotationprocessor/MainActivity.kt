package uz.smd.myanotationprocessor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val adapter = PersonAdapter(listOf(
            Person("Big Bird", "123 Seasame Street"),
            Person("Kermit the Frog", "6801 Hollywood Blvd.")
        ))
        findViewById<RecyclerView>(R.id.recyclerView).adapter=adapter
    }
}