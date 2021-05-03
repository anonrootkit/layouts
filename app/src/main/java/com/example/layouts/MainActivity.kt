package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val tempList : ArrayList<String> = ArrayList<String>().apply {
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
        add("")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_view.apply {
            adapter = CAA()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val ourMenuInflater : MenuInflater = menuInflater
        ourMenuInflater.inflate(R.menu.new_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.open -> {
                Toast.makeText(this, "Open", Toast.LENGTH_SHORT).show()
            }
            R.id.delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
            R.id.share -> {
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show()
            }
            R.id.fade_away -> {
                Toast.makeText(this, "Fade_away", Toast.LENGTH_SHORT).show()
            }
            else -> {}
        }
        return true
    }

    inner class CAA() : ArrayAdapter<String>(this, 0, tempList){
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var view = convertView
            if (view == null){
                view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
            }

            return view!!
        }
    }

}