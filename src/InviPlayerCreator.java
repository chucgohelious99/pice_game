public class InviPlayerCreator {
    static int number=1;
    private String playerName= "InviPlayer "+ number;

    public InviPlayer createInviPlayer(){
        InviPlayer inviPlayer= new InviPlayer(playerName);
        number++;
        return inviPlayer;
    }
}
