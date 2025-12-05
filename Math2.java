// lesson on accumulation and increment, decrement
class ScoreBoard {

    int playerXP = 0;
    int playerLevel = 0;
    static String gameName = "PONG";
    int playerHealth = 0;
    String playerName = " ";

    ScoreBoard(String n){
        playerName = n;
    }

    void gainXP(int amount){
        playerXP = playerXP + amount;//accumulation, long way of doing it
        System.out.println(playerName + " gained " + amount + "XP");
    }

    void heal(){
        playerHealth += 50;
    }

    void damage(){
        playerHealth -= 50;
    }

    void levelUp(){
        playerLevel++;
    }

    void levelDown(){
        playerLevel--;
    }
}

public class Math2 {
    public static void main(String[] args) {

        ScoreBoard player1 = new ScoreBoard("Jack");
        ScoreBoard player2 = new ScoreBoard("Jane");

        player1.gainXP(1);
        player1.gainXP(2);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        player2.gainXP(3);
        player2.gainXP(4);
        player2.heal();
        player2.damage();
        player2.levelUp();
        player2.levelUp();
        player2.levelDown();

        System.out.println("Player XP:" + player1.playerXP);
        System.out.println("Player Health:" + player1.playerHealth);
        System.out.println("Player Level:" + player1.playerLevel);
        System.out.println("Game Name:" + player1.gameName);

        System.out.println("Player XP:" + player2.playerXP);
        System.out.println("Player Health:" + player2.playerHealth);
        System.out.println("Player Level:" + player2.playerLevel);
        System.out.println("Game Name:" + player2.gameName);
    
        
    }

}
