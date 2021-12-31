package ja.tutorial.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tvUserName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.btnFinish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        // getIntExtraは第一引数にkey 第二引数に値が無い場合に返す数値
        tvScore.text =
            "正解スコア：${intent.getIntExtra(Constants.CORRECT_ANSWER, 0)} / ${
                intent.getIntExtra(
                    Constants.TOTAL_QUESTIONS,
                    0
                )
            }"

        btnFinish.setOnClickListener {
            goFirstScreen()
        }
    }

    private fun goFirstScreen() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}