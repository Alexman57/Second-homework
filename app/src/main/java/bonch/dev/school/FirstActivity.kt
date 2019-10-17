package bonch.dev.school

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_first.*
import java.lang.reflect.Field

class FirstActivity : AppCompatActivity() {


    private lateinit var indicator_Button: Button
    private lateinit var counter_Button: Button
    private lateinit var nextActivityButton: Button
    private lateinit var text: EditText
    private lateinit var numbers: TextView

    var counter: Int = 0
    var buttonIsTapped: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initializeViews()
        setListener()
    }
    private fun initializeViews(){
        indicator_Button=findViewById(R.id.indicator_button)
        counter_Button=findViewById(R.id.counter_button)
        nextActivityButton=findViewById(R.id.next_activity_button)
        text=findViewById(R.id.text_field)
        numbers = findViewById(R.id.numbers)

    }
    private fun setListener(){
        indicator_Button.setOnClickListener{
            indicator_Button.isEnabled = false
            buttonIsTapped = true
       }

        counter_Button.setOnClickListener{
            counter++
            numbers.text = counter.toString()
        }
        nextActivityButton.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("counter", counter)
            intent.putExtra("buttonTapped", buttonIsTapped)
            intent.putExtra("textField", text.text.toString())
            startActivity(intent)
        }
    }
}
