package com.lazday.kotlinanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /** w/ Anko Layout */
        MainLayout().setContentView(this)

        /** w/ XML Layout */
//        setContentView(R.layout.activity_main)
//        withXML()

    }

    fun withXML(){

        btnToast.setOnClickListener {
            toast("Uwaw !!")
        }

        btnSnack.setOnClickListener{
            btnSnack.snackbar("Message")
        }

        btnAlert.setOnClickListener{
            alert("Message", "Title").show()
        }

        btnAlertDialog.setOnClickListener{
            alert("Message", "Title"){
                yesButton {  }
                noButton {  }
            }.show()
        }
    }
}
