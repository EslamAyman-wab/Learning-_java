public class App {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 50000;
        int levelCompleted = 50000;
        int bonus = 100;

        if (score > levelCompleted) {
            System.out.println("You score was more than levelCompleted");
        }
        else if (score < levelCompleted){
            System.out.println("You score was less than levelCompleted");
        }
        else {
            System.out.println("You are hear");
        }

    }
}
