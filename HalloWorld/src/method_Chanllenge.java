public class method_Chanllenge {
    public static void main(String[] args) {

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("Eslam",1);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position/ " + highScorePosition + " / on the high score list "); ;

    }
    public static int calculateHighScorePosition(int playersScore) {
        if (playersScore >= 1000) {
//            System.out.println("Score greater than or equal to 1000");
            return 1;
        } else if (playersScore >= 500) {
//            System.out.println("Score greater than or equal to 500 but less than 1000");
            return 2;
        } else if (playersScore >= 100) {
//            System.out.println("Score greater than or equal to 100 but less than 500");
            return 3;
        }else {
//            System.out.println("All other scores");
            return 4;
        }

    }
}


