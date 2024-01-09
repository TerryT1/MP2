import java.util.Scanner;

public class Player {
  private String name;
  private int position;
  
  public Player(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public int getPosition() {
    return position;
  }
  
  public void move() {
    position++;
  }
  
  public void answerQuestion(Question question, Scanner scanner) {
    System.out.print(name + ": " + question.getExpression() + " = ");
    long startTime = System.currentTimeMillis();
    int answer = scanner.nextInt();
    long endTime = System.currentTimeMillis();
    question.setAnswerTime(endTime - startTime);
    // Consume the newline character
    scanner.nextLine();
  }
  
  public boolean isFasterThan(Player otherPlayer) {
    return this.getPosition() == otherPlayer.getPosition() && this.getAnswerTime() < otherPlayer.getAnswerTime();
  }
  
  
  public long getAnswerTime() {
    // Dummy method; for demonstration purposes
    return 21;
  }
}
