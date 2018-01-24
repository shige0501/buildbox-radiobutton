package net.buildbox.sample.buildbox_radiobutton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorGroup: RadioGroup = findViewById(R.id.color_group)
        colorGroup.setOnCheckedChangeListener { _, checkedId: Int ->
            when (checkedId) {
                R.id.red_button -> Toast.makeText(this, "赤色が選ばれています", Toast.LENGTH_SHORT).show()
                R.id.yellow_button -> Toast.makeText(this, "黄色が選ばれています", Toast.LENGTH_SHORT).show()
                R.id.blue_button -> Toast.makeText(this, "青色が選ばれています", Toast.LENGTH_SHORT).show()
                else -> throw IllegalArgumentException("not supported")
            }
        }
    }
}
