public class Question {
    private int num1;
    private int num2;
    private long answerTime;

    public Question() {
        this.num1 = (int) (Math.random() * 10) + 1;
        this.num2 = (int) (Math.random() * 10) + 1;
    }

    public String getExpression() {
        return num1 + " + " + num2;
    }

    public void setAnswerTime(long answerTime) {
        this.answerTime = answerTime;
    }
}
