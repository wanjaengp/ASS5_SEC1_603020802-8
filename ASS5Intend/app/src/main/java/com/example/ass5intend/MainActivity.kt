package com.example.ass5intend
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radio_button_click(view: View) {
        // Get the clicked radio button instance
        val radio: RadioButton = findViewById(group.checkedRadioButtonId)
        Toast.makeText(applicationContext, "On click : ${radio.text}", Toast.LENGTH_SHORT)
            .show()
    }

    fun onClickShowDetail(view: View) {
        val intent = Intent (this, SecondActivity::class.java)
        val radio: RadioButton = findViewById(group.checkedRadioButtonId)
        intent.putExtra("empData", Employee(edit_name.text.toString(), radio.text.toString(), edit_email.text.toString(),
            edit_salary.text.toString().toInt()))
        startActivity(intent)
    }

    fun reset(v: View) {
        edit_name.text.clear()
        group.clearCheck()
        edit_email.text.clear()
        edit_salary.text.clear()

    }
}
