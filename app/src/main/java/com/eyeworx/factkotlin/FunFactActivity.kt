package com.eyeworx.factkotlin

/**
 * Created by Shreerama on 10/31/2017.
 */
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.R


class FunFactsActivity : AppCompatActivity() {

    private val mFactBook = FactBook()
    private val mColorWheel = ColorWheel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare our View variables and assign the the Views from the layout file
        val factLabel = findViewById<TextView>(R.id.factTextView)
        val showFactButton = findViewById<Button>(R.id.showFactButton)
        val constrainLayout= findViewById<RelativeLayout>(R.id.relativeLayout)

        val listener = View.OnClickListener {
            val fact = mFactBook.getFact()
            // Update the label with our dynamic fact
            factLabel.setText(fact)

            val color = mColorWheel.getColor()
            constrainLayout.setBackgroundColor(color)
            showFactButton.setTextColor(color)
        }
        showFactButton.setOnClickListener(listener)

        //Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method!")
    }

    companion object {

        val TAG = FunFactsActivity::class.java.simpleName
    }
}

