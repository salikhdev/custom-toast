package uz.salikh.toast.lib

import android.app.Activity
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import uz.salikh.toast.lib.R


object CostumeToast {

    fun doneToast(msg: String, context: Activity) {

        val layout: View = context.layoutInflater.inflate(
            R.layout.toast_done,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )

        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = msg


        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()

    }

    fun doneToast(context: Activity) {

        val layout: View = context.layoutInflater.inflate(
            R.layout.toast_done,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )


        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()

    }

    fun errorToast(msg: String, context: Activity) {

        val layout: View = context.layoutInflater.inflate(
            R.layout.toast_error,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )

        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = msg


        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()

    }

    fun errorToast(context: Activity) {

        val layout: View = context.layoutInflater.inflate(
            R.layout.toast_error,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )


        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()

    }

    fun warningToast(msg: String, context: Activity) {

        val layout: View = context.layoutInflater.inflate(
            R.layout.toast_warining,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )

        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = msg


        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()

    }

    fun warningToast(context: Activity) {

        val layout: View = context.layoutInflater.inflate(
            R.layout.toast_warining,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )


        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()

    }

    fun costumeToast(msg: String, icon: Int, backgroundColor: Int, context: Activity) {

        val inflater: LayoutInflater = context.layoutInflater
        val layout: View = inflater.inflate(
            R.layout.toast_costume,
            context.findViewById(R.id.toastRoot) as ViewGroup?
        )

        val image = layout.findViewById<View>(R.id.image) as ImageView
        image.setImageResource(icon)
        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = msg
        val background = layout.findViewById<View>(R.id.toastRoot) as CardView
        background.setCardBackgroundColor(backgroundColor)

        val toast = Toast(context.applicationContext)
        toast.setGravity(Gravity.BOTTOM, 0, 140)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = layout
        toast.show()
    }


}