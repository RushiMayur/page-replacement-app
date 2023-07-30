package com.rm.lru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var btnSend:Button
    lateinit var etGet: EditText
    lateinit var s1:TextView
    lateinit var s2:TextView
    lateinit var s3:TextView
    lateinit var s4:TextView
    lateinit var info:TextView
    lateinit var btnClear:Button
    lateinit var we:TextView
    lateinit var btnFin:Button
    lateinit var fin:TextView
    lateinit var btnNext:FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSend=findViewById(R.id.btnSend)
        etGet=findViewById(R.id.etGet)
        s1=findViewById(R.id.s1)
        s2=findViewById(R.id.s2)
        s3=findViewById(R.id.s3)
        s4=findViewById(R.id.s4)
        info=findViewById(R.id.info)
        btnClear=findViewById(R.id.btnClear)
        we=findViewById(R.id.we)
        fin=findViewById(R.id.fin)
        btnFin=findViewById(R.id.btnFin)
        btnNext=findViewById(R.id.btnNext)

        supportActionBar?.title = "Least Recently Used Algorithm"

      //  val get=etGet.text.toString()
        //val milli = Date().time.toString()

        var m1 = Date().time.toString()
        var m2 = Date().time.toString()
        var m3 = Date().time.toString()
        var m4 = Date().time.toString()
       // var m5 = Date().time.toString()
        info.text=""
        var hit:Int=0
        var fault:Int=0

        btnSend.setOnClickListener {

            val get=etGet.text.toString()
            fin.text=""





            if (etGet.text.toString().trim { it <= ' ' }.isEmpty()){
                Toast.makeText(this, "Enter value first", Toast.LENGTH_SHORT).show()
            }
            else{
                if(s1.text=="-"){
                    s1.text=get
                     m1 = Date().time.toString()
                    info.text="Page Fault"
                    fault++

                    etGet.text.clear()




                }else{
                    if(s2.text=="-"){
                        if(s1.text==get){
                            s1.text=get
                             m1 = Date().time.toString()
                            info.text="Page Hit"
                            hit++
                        }
                        else{
                            s2.text=get
                            m2 = Date().time.toString()
                            info.text="Page Fault"
                            fault++

                        }

                        etGet.text.clear()



                    }else{
                        if(s3.text=="-"){
                            if(s1.text==get){
                                s1.text=get
                                m1 = Date().time.toString()
                                info.text="Page Hit"
                                hit++
                            }
                            else if(s2.text==get){
                                s2.text=get
                                m2 = Date().time.toString()
                                info.text="Page Hit"
                                hit++
                            }
                            else{
                                s3.text=get
                                m3 = Date().time.toString()
                                info.text="Page Fault"
                                fault++
                            }

                            etGet.text.clear()

                            etGet.text.clear()


                        }else{
                            if(s4.text=="-"){
                                if(s1.text==get){
                                    s1.text=get
                                    info.text="Page Hit"
                                    m1 = Date().time.toString()
                                    hit++
                                }
                                else if(s2.text==get){
                                    s2.text=get
                                    info.text="Page Hit"
                                    m2 = Date().time.toString()
                                    hit++
                                }
                                else if(s3.text==get){
                                    s3.text=get
                                    info.text="Page Hit"
                                    hit++
                                    m3 = Date().time.toString()
                                }
                                else {
                                    s4.text = get
                                    m4 = Date().time.toString()
                                    info.text="Page Fault"
                                    fault++
                                }

                                etGet.text.clear()


                            }else{

                                if(s1.text==get){
                                    s1.text=get
                                    m1 = Date().time.toString()
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                }
                                else if(s2.text==get){
                                    s2.text=get
                                    m2 = Date().time.toString()
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                }
                                else if(s3.text==get){
                                    s3.text=get
                                    m3 = Date().time.toString()
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                }
                                else if(s4.text==get){
                                    s4.text = get
                                    m4 = Date().time.toString()
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                }


                                else{
                                    m1.toLong()
                                    m2.toLong()
                                    m3.toLong()
                                    m4.toLong()

                                    if(m1<m2 && m1<m3 && m1<m4){
                                        info.text="Page Fault.\nReplaced ${s1.text} to $get ."
                                        s1.text=get
                                        m1 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++

                                    }
                                    else if(m2<m1 && m2<m3 && m2<m4){
                                        info.text="Page Fault.\nReplaced ${s2.text} to $get ."
                                        s2.text=get
                                        m2 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++
                                    }
                                    else if(m3<m1 && m3<m2 && m3<m4){
                                        info.text="Page Fault.\nReplaced ${s3.text} to $get ."
                                        s3.text=get
                                        m3 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++
                                    }
                                    else if(m4<m1 && m4<m2 && m4<m3){
                                        info.text="Page Fault.\nReplaced ${s4.text} to $get ."
                                        s4.text=get
                                        m4 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++
                                    }
                                    etGet.text.clear()

                                  /*  if(m1<m2){
                                        if(m1<m3){
                                            if(m1<m4){
                                                s1.text=get
                                                m1 = Date().time.toString()
                                            }else{
                                                s4.text=get
                                                m4 = Date().time.toString()
                                            }
                                        }
                                    }
                                    else if(m2<m3){

                                        if(m2<m4){
                                            s2.text=get
                                            m2 = Date().time.toString()

                                        }
                                        else{
                                            s4.text=get
                                            m4 = Date().time.toString()
                                        }

                                    }
                                    else if(m3<m4){
                                        s3.text=get
                                        m3 = Date().time.toString()
                                    }
                                    else{
                                        s4.text=get
                                        m4 = Date().time.toString()
                                    }*/

                                }

                            }
                        }

                    }
                }


            }



        }
        btnClear.setOnClickListener {
            if(s1.text=="-"){
                Toast.makeText(this, "Already Clear!", Toast.LENGTH_SHORT).show()
            }
            else {
                s1.text = "-"
                s2.text = "-"
                s3.text = "-"
                s4.text = "-"
                etGet.text.clear()
                info.text = ""
                fin.text=""
                m1="0"
                m2="0"
                m3="0"
                m4="0"
                fault=0
                hit=0
                Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()
            }
        }
     /*   we.setOnClickListener {
            val alterDialog = AlertDialog.Builder(this)
            alterDialog.setTitle("Developers Info")
            alterDialog.setMessage("App made by Rushi Mayur and Nandan Kumar HR for OS EL, submitted to Dr.Azra Nasreen mam.")
            alterDialog.setPositiveButton("OK") { _, _ ->


            }

            alterDialog.create()
            alterDialog.show()
        }*/

        btnFin.setOnClickListener {

            if(fault==0 && hit==0){
                Toast.makeText(this, "Enter values to the frame to get result", Toast.LENGTH_SHORT).show()
                fin.text="Number of Page faults: $fault\nNumber of Page hits: $hit"
            }
            else {

                fin.text = "Number of Page faults: $fault\nNumber of Page hits: $hit"
            }
        }
        var a=1
        btnNext.setOnClickListener {


                val intent = Intent(this, Second::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                a=0

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)


        }


    }
    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        startActivity(intent)
    }
}