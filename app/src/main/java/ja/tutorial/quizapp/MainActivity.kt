package ja.tutorial.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ja.tutorial.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val btnStart: Button = binding.btnStart
        val etName: EditText = binding.etName

        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "入力してください", Toast.LENGTH_LONG).show()
            } else {
                // intentを生成
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                // 入力値を次の画面に渡す
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                // 画面遷移
                startActivity(intent)
                // 現在画面のスタックを削除
                finish()
            }
        }
    }

    // ボタンの操作を無効にする
    override fun onBackPressed() {}
}