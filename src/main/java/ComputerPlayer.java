import java.util.Scanner;

public class ComputerPlayer extends Player{

    //Include a constructor
    //p.s. if you don't define a constructor, Java gives you an empty one for free
    //Set the name via the constructor, but why does the computer have a name anyway?!
    public ComputerPlayer(String name){
        super(name);
    }

    @Override
    public Move returnMove(){
        //pick a random move and return a string
        return Move.ROCK;
    }

}
