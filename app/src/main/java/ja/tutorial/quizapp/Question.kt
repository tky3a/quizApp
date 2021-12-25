package ja.tutorial.quizapp

// クエスチョンモデル（データクラス）
data class Question(
    val id: Int,
    val question: String,
    val images: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
