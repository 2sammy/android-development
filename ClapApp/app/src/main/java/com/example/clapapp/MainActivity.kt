package com.example.clapapp

import android.media.AsyncPlayer
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    // we start by creating an object for the media player
 //we use lateinit because we will initiate it late
// use safe call operator to handle null operators
    private var mediaPlayer: MediaPlayer? = null// this is the object type of the variable
    private lateinit var runnable: Runnable
    private lateinit var handler: Handler
    private lateinit var seekBar: SeekBar // here seekBar is defined in mainActivity class
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mediaPlayer = MediaPlayer.create(this,R.raw.applauding)
        seekBar = findViewById<SeekBar>(R.id.sbClapping)// here seekBa is initializer
        handler = Handler(Looper.getMainLooper())
        val playButton = findViewById<FloatingActionButton>(R.id.fabPlay)
        //val playButton = findViewById<floatingAction>()
        playButton.setOnClickListener {
            if (mediaPlayer==null){
                // object and instances means same thing
                mediaPlayer = MediaPlayer.create(this,R.raw.applauding)
                 initializeSeekBar()
            }
            mediaPlayer?.start()
        }

        val pauseButton = findViewById<FloatingActionButton>(R.id.fabPause)
        pauseButton.setOnClickListener {
        mediaPlayer?.pause()
        }


        val stopButton = findViewById<FloatingActionButton>(R.id.fabStop)
        stopButton.setOnClickListener {

            mediaPlayer?.stop()
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer = null
            handler.removeCallbacks(runnable)
            seekBar.progress = 0
        }
    }
    private fun initializeSeekBar(){
        // private is the visibility modifier meaning this function is only visibible to the components of the class
        // internal means only components inside the class can access
        // protected-means all components inside the class and subclass can access
        //public - all components of the class are accessible
        // fun defines a function
        // then initializeSeekBar is the name of the function( camel notation)
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) mediaPlayer?.seekTo(progress)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }


        })
        val tvPlayed = findViewById<TextView>(R.id.tvPlayed)
        //tvPlayed.setOnClickListener{

        //}
        val tvDue = findViewById<TextView>(R.id.tvDue)
        //tvDue.setOnClickListener{

        //}
        seekBar.max = mediaPlayer!!.duration // !! is called not null assertion operator
        runnable = Runnable {
            seekBar.progress = mediaPlayer!!.currentPosition
            val playedTime = mediaPlayer!!.currentPosition/1000
            tvPlayed.text="$playedTime sec"
            val duration = mediaPlayer!!.duration/100
            val dueTime= duration-playedTime
            tvDue.text = "$dueTime"



            handler.postDelayed(runnable,1000)
        }
        handler.postDelayed(runnable,1000)
        }
    }

