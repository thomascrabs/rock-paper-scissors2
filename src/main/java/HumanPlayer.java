public class HumanPlayer extends Player {

    public HumanPlayer(String name){
        super(name);
    }

    @Override
    public Move returnMove(){
        return Move.PAPER;
    }

}
