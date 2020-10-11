package com.nanxinqin.ikeep

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "What is the minimum distance for social / physical distancing?",
            R.drawable.q_1,
            "A. 4 feet",
            "B. 5 feet",
            "C. 6 feet",
            "D. 7 feet",
            3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2,
            "What should I do if I have minor symptoms like cough, headaches, or mild fever?",
            R.drawable.q_2,
            "A. Stay home for 2 days",
            "B. Stay home until recovery",
            "C. Continue going to work or school",
            "D. Go out for groceries",
            2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3,
            "What should I do to protect myself and others in the current time?",
            R.drawable.q_3,
            "A. Sanitize hands often with alcohol-based hand sanitizer",
            "B. Wash hands with soap and water",
            "C. Social distancing",
            "D. All of the above",
            4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4,
            "How long should I scrub my hands with soaps?",
            R.drawable.q_4,
            "A. At least 20 seconds",
            "B. At least 30 seconds",
            "C. At least 40 seconds",
            "D. At least 50 seconds",
            1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5,
            "What should I do to stay safe in workspaces?",
            R.drawable.q_5,
            "A. All of the below",
            "B. Surfaces and objects wiped regularly",
            "C. Ask employees to stay home if feeling unwell",
            "D. Put up hand sanitizing dispensers around the workspace",
            1
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6,
            "How should we greet each other right now?",
            R.drawable.q_6,
            "A. Kissing",
            "B. Handshake",
            "C. Wave while maintaining social distancing",
            "D. Touching noses",
            3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7,
            "What kind of eating is most recommended?",
            R.drawable.q_7,
            "A. Raw",
            "B. Cooked",
            "C. Carefully washed fruits",
            "D. Both B & C",
            4
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8,
            "How can we maintain a good mental health?",
            R.drawable.q_8,
            "A. Workout",
            "B. All of the listed",
            "C. Keep contact with family and friend",
            "D. Listen to music",
            2
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9,
            "How can we protect ourselves in a dense area?" ,
            R.drawable.q_9,
            "A. Wear a face covering",
            "B. Into open air",
            "C. Cover with hand",
            "D. Cover with elbow or armpit",
            1
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10,
            "How can we protect ourselves in a dense area?",
            R.drawable.q_10,
            "A. Face shield",
            "B. Mask",
            "C. Scarf",
            "D. All of the above",
            4
        )

        questionsList.add(que10)

        return questionsList
    }
}