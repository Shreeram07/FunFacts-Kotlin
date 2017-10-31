package com.eyeworx.factkotlin

import android.graphics.Color
import java.util.*

/**
 * Created by Shreerama on 10/31/2017.
 */

class ColorWheel {

        // Member variable (properties about the object)
        var mColors = arrayOf(  "#39add1", "#3079ab",
                                "#c25975", "#e15258",
                                "#f9845b", "#838cc7",
                                "#7d669e", "#53bbb4",
                                "#51b46d", "#e0ab18",
                                "#637a91", "#f092b0",
                                "#b7c0c7")

        // Method (abilities: things the object can do)
        // Randomly select a fact
        // Construct a new Random number generator
        fun getColor(): Int{
                val randomNumber = Random().nextInt(mColors.size)
                val color = mColors[randomNumber]
                return Color.parseColor(color)
            }
    }
