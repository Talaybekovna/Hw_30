package kg.tutorialapp.hw30

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat


class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    lateinit var tvInfo : TextView
    lateinit var tvGesture : TextView
    lateinit var detector: GestureDetectorCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInfo = findViewById(R.id.tvInfo)
        tvGesture = findViewById(R.id.tvGesture)

        detector = GestureDetectorCompat(this, this)
        detector.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.detector.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(event: MotionEvent?): Boolean {
        tvGesture.text = "onDown"
        tvInfo.setText(event.toString())
        return false
    }

    override fun onShowPress(event: MotionEvent?) {
        tvGesture.text = "onShowPress"
        tvInfo.setText(event.toString())
    }

    override fun onSingleTapUp(event: MotionEvent?): Boolean {
        tvGesture.text = "onSingleTapUp"
        tvInfo.setText(event.toString())
        return true
    }

    override fun onDoubleTap(event: MotionEvent?): Boolean {
        tvGesture.text = "onDoubleTap"
        tvInfo.setText(event.toString())
        return true
    }

    override fun onScroll(event1: MotionEvent?, event2: MotionEvent?, distanceX: Float, distanceY: Float): Boolean {
        tvGesture.text = "onScroll"
        tvInfo.setText(event1.toString()+event2.toString())
        return true
    }

    override fun onLongPress(event: MotionEvent?) {
        tvGesture.text = "onLongPress"
        tvInfo.setText(event.toString())
    }

    override fun onDoubleTapEvent(event: MotionEvent?): Boolean {
        tvGesture.text = "onSinglonDoubleTapEventeTapUp"
        tvInfo.setText(event.toString())
        return true
    }

    override fun onSingleTapConfirmed(event: MotionEvent?): Boolean {
        tvGesture.text = "onSingleTapConfirmed"
        tvInfo.setText(event.toString())
        return true
    }

    override fun onFling(event1: MotionEvent?, event2: MotionEvent?, velocityX: Float, velocityY: Float): Boolean {
        tvGesture.text = "onFling"
        tvInfo.setText(event1.toString()+event2.toString())
        return true
    }
}