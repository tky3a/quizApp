package ja.tutorial.quizapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

// View.OnClickListenerを追加するとクラス内のonClickメソッドでタップイベントを設定可能になる
class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null

    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgressText)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionThree = findViewById(R.id.tvOptionThree)
        tvOptionFour = findViewById(R.id.tvOptionFour)
        btnSubmit = findViewById(R.id.btnSubmit)

        // クリックアクションを設定　thisがView.OnClickListenerを読み込む
        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        // Constant Object からレスポンスを取得
        mQuestionsList = Constants.getQuestions()

        setQuestion()
        // defaultOptionsView()
    }

    private fun setQuestion() {

        val question: Question = mQuestionsList!![mCurrentPosition - 1] // NonNull nullではない強制
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
        ivImage?.setImageResource(question.images)

        if (mCurrentPosition == mQuestionsList!!.size) {
            btnSubmit?.text = "Finish"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionsView() {
        // 選択肢の４項目を配列にいれる為のインスタンスを生成
        val options = ArrayList<TextView>()
        // 選択肢をoptionsに追加
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3, it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT // Typefaceでフォントのスタイルを変更
            // backgroundにgetDrawableを設定する
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }

    }

    // 4つの選択肢を選択した時のアクション
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        // スタイルの初期化
        defaultOptionsView()

        // 現在の選択肢indexを保持
        mSelectedOptionPosition = selectedOptionNum
        // textViewの文字色を設定
        tv.setTextColor(Color.parseColor("#363A43"))
        // textのフォントスタイルを設定
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        // backgroundにgetDrawableを設定する
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }

    // クリックイベントをオーバーライド
    // overrideしないとView.OnClickListenerのクリックイベント認識されない
    override fun onClick(view: View?) {
        when (view?.id) {
            // 対象のidがタップされたら発火
            R.id.tvOptionOne -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }

            // 対象のidがタップされたら発火
            R.id.tvOptionTwo -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }

            // 対象のidがタップされたら発火
            R.id.tvOptionThree -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }
            }

            // 対象のidがタップされたら発火
            R.id.tvOptionFour -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }
            }

            // 対象のidがタップされたら発火
            R.id.btnSubmit -> {
                // TODO: btnSubmit処理
            }
        }
    }

}