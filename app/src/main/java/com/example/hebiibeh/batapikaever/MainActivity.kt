package com.example.hebiibeh.batapikaever

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBtn()

    }

    private fun initBtn(){
        startBtn.setOnClickListener{
            val intent = Intent(this, TorchOnService::class.java)
            startService(intent)
        }
        stopBtn.setOnClickListener{
            val intent = Intent(this, TorchOnService::class.java)
            stopService(intent)
        }
    }
}
