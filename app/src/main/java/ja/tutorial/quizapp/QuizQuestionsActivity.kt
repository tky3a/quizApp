package ja.tutorial.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        // Constant Object からレスポンスを取得
        val questionsList = Constants.getQuestions()
        Log.i("配列のサイズを確認", "${questionsList.size}")
    }
}