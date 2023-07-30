package com.rm.lru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Splash : AppCompatActivity() {
    lateinit var topAnim: Animation
    lateinit var txtFoodLander: TextView
    lateinit var imgAppIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)

        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)

        //set animation for logo
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        txtFoodLander = findViewById(R.id.txtFoodLander)
        imgAppIcon = findViewById(R.id.imgAppIcon)

        txtFoodLander.animation = topAnim
        imgAppIcon.animation = topAnim


        Handler().postDelayed({
            val mainIntent =
                Intent(this@Splash, MainActivity::class.java)
            finish()
            startActivity(mainIntent)
        }, 2000)
    }
}
