package jp.techacademy.naoto.ichihashi.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎",10,"ゲーム")
        human1.say()
        human1.think()

        val human2 = Human("花子",11,"ショッピング")
        human2.say()
        human2.think()
    }
}
