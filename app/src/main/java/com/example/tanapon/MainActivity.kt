package com.example.tanapon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week3_012.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_FNAME = "FNAME"
    public  final var TAG_LNAME = "LNAME"
    public  final var TAG_NNAME = "NNAME"
    public  final var TAG_STUDY = "STUDY"
    public  final var TAG_NUMBER = "NUMBER"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Send DATA")

        btn_sender.setOnClickListener {
            // ดึงค่าจาก edittext
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var nname = et_nname.text.toString()
            var study = et_study.text.toString()
            var number = et_number.text.toString()


            //เรียกใช้ method senderFun เพื่อ ฝาก และ ส่งค่าไปยังหน้าที่ 2
            senderFun(fname,lname,nname,study,number)

        }

        btn_clear.setOnClickListener {

            // ล้างข้อมูล
            et_fname.setText("")
            et_lname.setText("")
            et_nname.setText("")
            et_study.setText("")
            et_number.setText("")

        }

        btn_close.setOnClickListener {

            //ปิด app
            finish()

        }
    }

    fun senderFun(str1 : String ,str2 : String , str3 : String , str4 : String , str5 : String){
        //กำหนดค่าเริ่มต้น (ตัวมันเอง,class ปลายทาง)
        var goPageSecond = Intent(this, SecoundAcitivity::class.java)

        //กำหนดข้อมูลและส่งข้อมูล (ชื่อของข้อมูล,ข้อมูล)
        goPageSecond.putExtra(TAG_FNAME,str1)
        goPageSecond.putExtra(TAG_LNAME,str2)
        goPageSecond.putExtra(TAG_NNAME,str3)
        goPageSecond.putExtra(TAG_STUDY,str4)
        goPageSecond.putExtra(TAG_NUMBER,str5)

        //เริ่มต้นเข้าสู่ activity second
        startActivity(goPageSecond)

    }
}
