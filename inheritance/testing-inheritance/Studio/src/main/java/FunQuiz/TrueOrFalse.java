package FunQuiz;

public class TrueOrFalse extends Question{

    private boolean TrueOrFalseAnswer;

    public TrueOrFalse(int id, String question, int pointValue, boolean trueOrFalseAnswer) {
        super(id, question, pointValue);
        TrueOrFalseAnswer = trueOrFalseAnswer;
    }

    public boolean isTrueOrFalseAnswer() {
        return TrueOrFalseAnswer;
    }

    public void setTrueOrFalseAnswer(boolean trueOrFalseAnswer) {
        TrueOrFalseAnswer = trueOrFalseAnswer;
    }
}
