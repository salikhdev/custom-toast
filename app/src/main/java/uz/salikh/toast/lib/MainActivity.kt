package uz.salikh.toast.lib

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val doneBtn = findViewById<AppCompatButton>(R.id.done_button)
        val errorBtn = findViewById<AppCompatButton>(R.id.error_button)
        val costumeBtn = findViewById<AppCompatButton>(R.id.costume_button)
        val warningBtn = findViewById<AppCompatButton>(R.id.warning_button)



        doneBtn.setOnClickListener {
            CostumeToast.doneToast(this)

        }

        errorBtn.setOnClickListener {
            CostumeToast.errorToast(this)
        }

        warningBtn.setOnClickListener {
            CostumeToast.warningToast(this)
        }

        costumeBtn.setOnClickListener {

            CostumeToast.costumeToast(
                "salikhdev",
                R.drawable.insta_icon,
                Color.parseColor("#FFF9AFFF"),
                this
            )

        }

    }
}