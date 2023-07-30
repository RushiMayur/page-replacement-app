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

class Second : AppCompatActivity() {

    lateinit var btnSend: Button
    lateinit var etGet: EditText
    lateinit var s1: TextView
    lateinit var s2: TextView
    lateinit var s3: TextView
    lateinit var s4: TextView
    lateinit var info: TextView
    lateinit var btnClear: Button
    lateinit var we: TextView
    lateinit var btnFin: Button
    lateinit var fin: TextView
    lateinit var btnNext: FloatingActionButton
    lateinit var k1: TextView
    lateinit var k2: TextView
    lateinit var k3: TextView
    lateinit var k4: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

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
        k1=findViewById(R.id.k1)
        k2=findViewById(R.id.k2)
        k3=findViewById(R.id.k3)
        k4=findViewById(R.id.k4)

        supportActionBar?.title = "Second Chance Algorithm"



      //  var m1 = Date().time.toString()
       // var m2 = Date().time.toString()
      //  var m3 = Date().time.toString()
      //  var m4 = Date().time.toString()

      //  var r1="0"
      //  var r2="0"
      //  var r3="0"
     //   var r4="0"
        // var m5 = Date().time.toString()
        info.text=""
        var hit:Int=0
        var fault:Int=0

       /* btnSend.setOnClickListener {

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
                            //m1 = Date().time.toString()
                            r1="1"
                            info.text="Page Hit"
                            hit++
                            k1.text="(1)"
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
                                r1="1"
                               // m1 = Date().time.toString()
                                info.text="Page Hit"
                                hit++
                                k1.text="(1)"
                            }
                            else if(s2.text==get){
                                s2.text=get
                              //  m2 = Date().time.toString()
                                r2="1"
                                info.text="Page Hit"
                                hit++
                                k2.text="(1)"
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
                                    r1="1"
                                   // m1 = Date().time.toString()
                                    hit++
                                    k1.text="(1)"
                                }
                                else if(s2.text==get){
                                    s2.text=get
                                    info.text="Page Hit"
                                    r2="1"
                                   // m2 = Date().time.toString()
                                    hit++
                                    k2.text="(1)"
                                }
                                else if(s3.text==get){
                                    s3.text=get
                                    info.text="Page Hit"
                                    hit++
                                    r3="1"
                                   // m3 = Date().time.toString()
                                    k3.text="(1)"
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
                                   // m1 = Date().time.toString()//
                                    r1="1"
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                    k1.text="(1)"
                                }
                                else if(s2.text==get){
                                    s2.text=get
                                    r2="1"
                                   // m2 = Date().time.toString()//
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                    k2.text="(1)"
                                }
                                else if(s3.text==get){
                                    s3.text=get
                                    r3="1"
                                   // m3 = Date().time.toString()//
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                    k3.text="(1)"
                                }
                                else if(s4.text==get){
                                    s4.text = get
                                   // m4 = Date().time.toString()//
                                    r4="1"
                                    info.text="Page Hit"
                                    etGet.text.clear()
                                    hit++
                                    k4.text="(1)"
                                }


                                else{
                                    m1.toLong()
                                    m2.toLong()
                                    m3.toLong()
                                    m4.toLong()



                                    if(m1<m2 && m1<m3 && m1<m4){
                                        if(r1=="0") {
                                            info.text = "Page Fault.\nReplaced ${s1.text} to $get ."
                                            s1.text = get
                                            m1 = Date().time.toString()
                                            etGet.text.clear()
                                            fault++
                                        }
                                        else{
                                            r1="0"
                                            k1.text="(0)"
                                           // m1 = Date().time.toString()
                                           if(m2<m3 && m2<m4){
                                               if(r2=="0"){
                                                   info.text = "Page Fault.\nReplaced ${s2.text} to $get ."
                                                   s2.text = get
                                                   m2 = Date().time.toString()
                                                   etGet.text.clear()
                                                   fault++
                                               }
                                               else{
                                                   r2="0"
                                                   k2.text="(0)"
                                                 //  m2 = Date().time.toString()
                                                   if(m3<m4) {
                                                       if (r3 == "0") {
                                                           info.text =
                                                               "Page Fault.\nReplaced ${s3.text} to $get ."
                                                           s3.text = get
                                                           m3 = Date().time.toString()
                                                           etGet.text.clear()
                                                           fault++
                                                       } else {
                                                           r3 = "0"
                                                           k3.text = "(0)"
                                                          // m3 = Date().time.toString()
                                                           if (r4 == "0") {
                                                               info.text =
                                                                   "Page Fault.\nReplaced ${s4.text} to $get ."
                                                               s4.text = get
                                                               m4 = Date().time.toString()
                                                               etGet.text.clear()
                                                               fault++
                                                           } else {
                                                               r4 = "0"
                                                               k4.text = "(0)"
                                                             //  m4 = Date().time.toString()
                                                               info.text =
                                                                   "Page Fault.\nReplaced ${s1.text} to $get ."
                                                               s1.text = get
                                                               m1 = Date().time.toString()
                                                               etGet.text.clear()
                                                               fault++
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                        }

                                    }
                                    else if(m2<m1 && m2<m3 && m2<m4){
                                        if(r2=="0") {
                                            info.text = "Page Fault.\nReplaced ${s2.text} to $get ."
                                            s2.text = get
                                            m2 = Date().time.toString()
                                            etGet.text.clear()
                                            fault++
                                        }
                                        else{
                                            r2="0"
                                            k2.text="(0)"
                                            //m2 = Date().time.toString()
                                            if(m3<m1 && m3<m4){
                                                if(r3=="0"){
                                                    info.text = "Page Fault.\nReplaced ${s3.text} to $get ."
                                                    s3.text = get
                                                    m3 = Date().time.toString()
                                                    etGet.text.clear()
                                                    fault++
                                                }
                                                else{
                                                    r3="0"
                                                    k3.text="(0)"
                                                   // m3 = Date().time.toString()
                                                    if(m4<m1){
                                                        if(r4=="0"){
                                                            info.text = "Page Fault.\nReplaced ${s4.text} to $get ."
                                                            s4.text = get
                                                            m4 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }

                                                    else{
                                                        r4="0"
                                                        k4.text="(0)"
                                                         //   m4 = Date().time.toString()
                                                        if(r1=="0"){
                                                            info.text = "Page Fault.\nReplaced ${s1.text} to $get ."
                                                            s1.text = get
                                                            m1 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }
                                                        else{
                                                            r1="0"
                                                            k1.text="(0)"
                                                           // m1 = Date().time.toString()
                                                            info.text = "Page Fault.\nReplaced ${s2.text} to $get ."
                                                            s2.text = get
                                                            m2 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }
                                                    }
                                                    }
                                                }
                                            }
                                        }

                                    }

                                    else if(m3<m1 && m3<m2 && m3<m4){
                                        if(r3=="0") {
                                            info.text = "Page Fault.\nReplaced ${s3.text} to $get ."
                                            s3.text = get
                                            m3 = Date().time.toString()
                                            etGet.text.clear()
                                            fault++
                                        }
                                        else{
                                            r3="0"
                                            k3.text="(0)"
                                          //  m3 = Date().time.toString()
                                            if(m4<m1 && m4<m2){
                                                if(r4=="0"){
                                                    info.text = "Page Fault.\nReplaced ${s4.text} to $get ."
                                                    s4.text = get
                                                    m4 = Date().time.toString()
                                                    etGet.text.clear()
                                                    fault++
                                                }
                                                else{
                                                    r4="0"
                                                    k4.text="(0)"
                                                    //m4 = Date().time.toString()
                                                    if(m1<m2){
                                                        if(r1=="0"){
                                                            info.text = "Page Fault.\nReplaced ${s1.text} to $get ."
                                                            s1.text = get
                                                            m1 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }

                                                    else{
                                                        r1="0"
                                                        k1.text="(0)"
                                                          //  m1 = Date().time.toString()
                                                        if(r2=="0"){
                                                            info.text = "Page Fault.\nReplaced ${s2.text} to $get ."
                                                            s2.text = get
                                                            m2 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }
                                                        else{
                                                            r2="0"
                                                            k2.text="(0)"
                                                            //m2 = Date().time.toString()
                                                            info.text = "Page Fault.\nReplaced ${s3.text} to $get ."
                                                            s3.text = get
                                                            m3 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }
                                                    }
                                                    }
                                                }
                                            }
                                        }

                                    }
                                    else if(m4<m1 && m4<m2 && m4<m3){
                                        if(r4=="0") {
                                            info.text = "Page Fault.\nReplaced ${s4.text} to $get ."
                                            s4.text = get
                                            m4 = Date().time.toString()
                                            etGet.text.clear()
                                            fault++
                                        }
                                        else{
                                            r4="0"
                                            k4.text="(0)"
                                           // m4 = Date().time.toString()
                                            if(m1<m3 && m1<m2){
                                                if(r1=="0"){
                                                    info.text = "Page Fault.\nReplaced ${s1.text} to $get ."
                                                    s1.text = get
                                                    m1 = Date().time.toString()
                                                    etGet.text.clear()
                                                    fault++
                                                }
                                                else{
                                                    r1="0"
                                                    k1.text="(0)"
                                                   // m1 = Date().time.toString()
                                                    if(m2<m3){
                                                        if(r2=="0"){
                                                            info.text = "Page Fault.\nReplaced ${s2.text} to $get ."
                                                            s2.text = get
                                                            m2 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }

                                                    else{
                                                        r3="0"
                                                        k3.text="(0)"
                                                         //   m3 = Date().time.toString()
                                                        if(r3=="0"){
                                                            info.text = "Page Fault.\nReplaced ${s3.text} to $get ."
                                                            s3.text = get
                                                            m3 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }
                                                        else{
                                                            r3="0"
                                                            k3.text="(0)"
                                                          //  m3 = Date().time.toString()
                                                            info.text = "Page Fault.\nReplaced ${s1.text} to $get ."
                                                            s1.text = get
                                                            m1 = Date().time.toString()
                                                            etGet.text.clear()
                                                            fault++
                                                        }
                                                    }
                                                    }
                                                }
                                            }
                                        }

                                    }
                                   /* else if(m2<m1 && m2<m3 && m2<m4){
                                        info.text="Page Fault.\nReplaced ${s2.text} to $get ."
                                        s2.text=get
                                        m2 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++
                                    }*/
                                   /* else if(m3<m1 && m3<m2 && m3<m4){
                                        info.text="Page Fault.\nReplaced ${s3.text} to $get ."
                                        s3.text=get
                                        m3 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++
                                    }*/
                                  /*  else if(m4<m1 && m4<m2 && m4<m3){
                                        info.text="Page Fault.\nReplaced ${s4.text} to $get ."
                                        s4.text=get
                                        m4 = Date().time.toString()
                                        etGet.text.clear()
                                        fault++
                                    }*/
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




        }*/

        var k="1"

        btnSend.setOnClickListener {
            val get = etGet.text.toString()
            fin.text = ""
            var n = 12

            if (etGet.text.trimEnd().trimStart().isEmpty()) {
                Toast.makeText(this, "Enter a value first", Toast.LENGTH_SHORT).show()
            }
            else{
            while (n > 0) {


                if (s1.text.toString() == get || s2.text.toString() == get || s3.text.toString() == get || s4.text.toString() == get) {
                    if (s1.text.toString() == get) {
                        s1.text = get
                        k1.text = "(1)"
                        hit++
                        n = 0
                    }
                    if (s2.text.toString() == get) {
                        s2.text = get
                        k2.text = "(1)"
                        hit++
                        n = 0
                    }
                    if (s3.text.toString() == get) {
                        s3.text = get
                        k3.text = "(1)"
                        hit++
                        n = 0
                    }
                    if (s4.text.toString() == get) {
                        s4.text = get
                        k4.text = "(1)"
                        hit++
                        n = 0
                    }
                    etGet.text.clear()
                } else {

                    if (k == "1") {

                        if (k1.text == "(1)") {
                            k = "2"
                            k1.text = "(0)"
                        } else {
                            s1.text = get
                            k = "2"
                            fault++
                            n = 0


                        }
                    } else if (k == "2") {

                        if (k2.text == "(1)") {
                            k = "3"
                            k2.text = "(0)"
                        } else {
                            s2.text = get
                            k = "3"
                            fault++
                            n = 0

                        }
                    } else if (k == "3") {

                        if (k3.text == "(1)") {
                            k = "4"
                            k3.text = "(0)"
                        } else {
                            s3.text = get
                            k = "4"
                            fault++
                            n = 0

                        }
                    } else if (k == "4") {

                        if (k4.text == "(1)") {
                            k = "1"
                            k4.text = "(0)"
                        } else {
                            s4.text = get
                            k = "1"
                            fault++
                            n = 0

                        }
                    }
                    etGet.text.clear()
                }


                n--
            }
        }
        }











        btnClear.setOnClickListener {
            if(s1.text=="-"){
                Toast.makeText(this, "Already Clear!", Toast.LENGTH_SHORT).show()
            }
            else {
                k="1"
                s1.text = "-"
                s2.text = "-"
                s3.text = "-"
                s4.text = "-"
                k1.text = "(0)"
                k2.text = "(0)"
                k3.text = "(0)"
                k4.text = "(0)"
          ///      m1=Date().time.toString()
           ///     m2=Date().time.toString()
          ///      m3=Date().time.toString()
            ///    m4=Date().time.toString()
                etGet.text.clear()
                info.text = ""
                fin.text=""
                fault=0
                hit=0
                Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show()
            }
        }
      /*  we.setOnClickListener {
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

        btnNext.setOnClickListener {
            onBackPressed()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }



    }


    /* */
}