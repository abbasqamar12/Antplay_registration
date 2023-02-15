package com.antplay.antplayApp.listeners;

public interface QuizAnswerListener {
    void answerUpdated(boolean isAnswerCorrect);
    void selectedAnswer(String optionSelected, int position);
    void submitAnswer(boolean isReady);
}
