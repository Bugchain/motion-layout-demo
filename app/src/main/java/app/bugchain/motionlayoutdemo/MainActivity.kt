package app.bugchain.motionlayoutdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sun)

//        btnKeyFrame.setOnClickListener {
//            startActivity(Intent(DemoActivity.newIntent(this,R.layout.activity_sun)))
//        }
//
//        btnMultiState.setOnClickListener {
//            startActivity(Intent(DemoActivity.newIntent(this,R.layout.activity_multi_state)))
//        }

    }
}
