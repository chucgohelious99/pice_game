import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        InviPlayerCreator inviPlayerCreator= new InviPlayerCreator();
        Judger judger= new Judger();

        try {
            System.out.println("Please enter the number of player: ");
            int numberOfPlayer = sc.nextInt();
            // Create player
            List<Player> listOfPlayer = new ArrayList<Player>();
            String playerName ;

            for (int i = 0; i < numberOfPlayer; i++) {
                System.out.println("Enter name of player " + i);
                playerName=sc.nextLine();
//                System.out.println(numberOfPlayer);
                System.out.println("name of player "+ i +" is "+ playerName);
                Player player = new Player(playerName);
                listOfPlayer.add(player);

            }
            if (numberOfPlayer < 4) {
                for (int i = numberOfPlayer; i < 4; i++) {
                    InviPlayer inviPlayer = inviPlayerCreator.createInviPlayer();
                    listOfPlayer.add(inviPlayer);
                }
            }
            while (true) {
                int indexPlayer = judger.getNextPlayer();
                System.out.println("\nnow is turn of player "+ indexPlayer);
                Player player = listOfPlayer.get(indexPlayer);
                int resultTurn = player.play();
                System.out.println("player "+ indexPlayer +" get " + resultTurn+" score");
                if (!judger.calculateScore(player, resultTurn)) {
                    System.out.println("Game over");
                    break;
                }
                //judger.calculateScore(player,resultTurn);
                System.out.println("result now is:");
                System.out.println("Player \t name \t score");
                for(int i=0; i<4; i++){
                    System.out.println(i+"\t"+listOfPlayer.get(i).getName()+ "\t" +listOfPlayer.get(i).getScore() );
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
