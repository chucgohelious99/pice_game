import java.util.Random;

public class Judger {
    private static Random random = new Random();
    public int getNextPlayer(){
        return random.nextInt(4);
    }
    public boolean calculateScore(Player player, int score){
        int new_score= player.getScore() + score;
        if (new_score >21){
             new_score=0;
        }
        player.setScore(new_score);
        return new_score != 21;
    }

    public static void main(String[] args) {

    }
}
