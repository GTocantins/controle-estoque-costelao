
package com.example.controleestoque

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val produtos = listOf(
            "Coca Cola 290ml - 94 unidades",
            "Guarana 350ml - 69 unidades",
            "Água 510ml - 117 unidades"
        )

        val listView: ListView = findViewById(R.id.listView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, produtos)
        listView.adapter = adapter
    }
}
