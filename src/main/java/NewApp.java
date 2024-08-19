public class NewApp {

    public static void main(String[] args) {

        Player computer = new ComputerPlayer("Computer");
        Player human = new HumanPlayer("Thomas");

        GameLogic logic = new RPSGameLogic(computer, human);
        logic.playGame();
        logic.returnWinner();

    }

}
