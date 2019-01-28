package com.sritech.www.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onRead()

    }
    fun onRead(){
        var path="/storage/sdcard0/"
        var f=File(path)
        if (!f.exists()){
            path="/storage/emulated0/"
            f= File(path)
        }
        var files=f.list()
        var maAdapter=ArrayAdapter<String>(this@MainActivity,android.R.layout.select_dialog_singlechoice,files)

        listview.adapter=maAdapter
    }
}
