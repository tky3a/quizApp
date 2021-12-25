package ja.tutorial.quizapp

// 生成方法 New/Kotlin Class/File　からobjectで生成
object Constants {

    // 
    fun getQuestions(): ArrayList<Question> {
        // ArrayListインスタンスを作成
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            id = 1,
            question = "この旗はどの国に属していますか？",
            images = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina",
            optionTwo = "Australia",
            optionThree = "Armenia",
            optionFour = "Austria",
            correctAnswer = 1
        )
        questionsList.add(que1)


        // 2
        val que2 = Question(
            id = 2,
            question = "この旗はどの国に属していますか？",
            images = R.drawable.ic_flag_of_australia,
            optionOne = "Angola",
            optionTwo = "Austria",
            optionThree = "Australia",
            optionFour = "Armenia",
            correctAnswer = 3
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "この旗はどの国に属していますか？",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)


        return questionsList
    }
}