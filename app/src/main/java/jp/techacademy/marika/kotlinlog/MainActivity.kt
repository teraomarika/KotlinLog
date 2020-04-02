package jp.techacademy.marika.kotlinlog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marichan = Human("茉理加" ,23,"コトリン")

        marichan.say()
        marichan.think()

        val yoshikun=Human("圭史",23,"ご飯")

        yoshikun.say()
        yoshikun.think()






    }


}









