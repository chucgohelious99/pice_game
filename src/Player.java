import java.util.Random;

public class Player {
     private String name;
     private int score;
//    public Player(){
//    }
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int play(){
        int add_point;
        double lucky_rate= Math.random();
        if (lucky_rate <0.16){
            add_point=1;
        }else if(lucky_rate <0.32){
            add_point=2;
        }else if(lucky_rate <0.48){
            add_point=3;
        }else if(lucky_rate <0.64){
            add_point=4;
        }else if(lucky_rate <0.8){
            add_point=5;
        }else{
            add_point=6;
        }
        return add_point;
    }
    public void comment(){
        System.out.println("Try one more game bros !");
    }
}
