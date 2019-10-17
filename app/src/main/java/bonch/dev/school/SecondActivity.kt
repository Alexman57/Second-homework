package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    var counter: Int = 0
    var text:String? = ""
    var buttonTapped: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initializeViews()
    }
    private fun initializeViews(){
        textView = findViewById(R.id.text_output)
        counter = intent.getIntExtra("counter", 0)
        text = intent.getStringExtra("textField")
        buttonTapped = intent.getBooleanExtra("buttonTapped", false)
        textView.text = "$text \n$counter \n$buttonTapped"
    }

//    private fun textButton(){
//        if(buttonTapped){
//            buttonText = "Кнопака была нажата"
//        } else{
//            buttonText = "Кнопка было не нажата"
//        } //   }

}
