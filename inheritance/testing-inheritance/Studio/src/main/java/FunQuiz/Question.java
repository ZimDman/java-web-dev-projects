package FunQuiz;

public abstract class  Question {
    private int id;

    private static int nextID = 1;
    String question;

    int pointValue;

    public Question( String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
        nextID ++;
    }

    public int getId() {
        return id = nextID;
    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}
