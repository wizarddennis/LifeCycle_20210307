package kr.co.tjoeun.lifecycle_20210307

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "onCreate실행됨")

        moveToOtherBtn.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }      
        
    }

    override fun onResume() {
        super.onResume()
        
        Log.d("메인화면", "onResume실행됨")
    }

    override fun onPause() {
        super.onPause()
        
        Log.d("메인화면", "onPause 실행됨")
    }
}