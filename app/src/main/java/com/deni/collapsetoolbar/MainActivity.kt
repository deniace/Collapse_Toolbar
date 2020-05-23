package com.deni.collapsetoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.deni.collapsetoolbar.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Deni Supriyatna (deni ace) on 23 - 05 - 2020.
 * Email : denisupriyatna01@gmail.com
 */

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activity = this
        binding.toolbarLayout.title = "Deni Ace"
        setSupportActionBar(toolbar)
    }

    public fun fabOnclick(view: View) {
        Toast.makeText(applicationContext, "ini fab", Toast.LENGTH_LONG).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_detail, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_more -> {
            // jika menu more di tekan
            val toast = Toast.makeText(applicationContext, "Ini menu more", Toast.LENGTH_SHORT)
            toast.show()
            true
        }
        R.id.action_logout -> {
            // jika menu logout di tekan
            val toast = Toast.makeText(applicationContext, "ini dari logout", Toast.LENGTH_SHORT)
            toast.show()
            true
        }
        else -> {
            // masukan dari user tidak dapat dikenali
            // memanggil super class untuk menghandle ini
//            Toast.makeText(applicationContext, "tidak di kenali", Toast.LENGTH_SHORT).show()
            super.onOptionsItemSelected(item)
        }
    }
}
