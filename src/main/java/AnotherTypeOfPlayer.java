public class AnotherTypeOfPlayer extends Player{

    public AnotherTypeOfPlayer(String name) {
        super(name);
    }

    @Override
    public Move returnMove() {
        return null;
    }

    @Override
    public String returnName() {
        return null;
    }
}
