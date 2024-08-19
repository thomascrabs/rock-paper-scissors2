public interface GameLogic {

    //All methods are public and abstract by default
    //Would be weird to see "public abstract" even though it's valid
    String returnWinner();

    void playGame();

}
