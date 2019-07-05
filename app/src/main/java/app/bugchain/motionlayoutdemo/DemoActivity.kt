package app.bugchain.motionlayoutdemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DemoActivity : AppCompatActivity() {

    companion object{

        fun newIntent(context: Context, layoutId: Int): Intent{
            val intent = Intent(context,DemoActivity::class.java)
            intent.putExtra("layout_id",layoutId)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutId = intent.getIntExtra("layout_id", R.layout.activity_multi_state)
        setContentView(layoutId)
    }

}