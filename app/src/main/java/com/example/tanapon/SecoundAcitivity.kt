package com.example.tanapon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.week3_012.R
import kotlinx.android.synthetic.main.activity_second.*

class SecoundAcitivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setTitle("Receive DATA")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var nname = intent.extras?.getString(MainActivity().TAG_NNAME)
        var study = intent.extras?.getString(MainActivity().TAG_STUDY)
        var number = intent.extras?.getString(MainActivity().TAG_NUMBER)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_nname.setText(nname)
        tv_res_study.setText(study)
        tv_res_number.setText(number)

        btn_back.setOnClickListener {

            finish()

        }

    }
}