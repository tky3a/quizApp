package ja.tutorial.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ja.tutorial.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}