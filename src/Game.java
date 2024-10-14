import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs3331Blade;
import fruitNinjaHelper.cs3331FruitNinjaGame;
import fruitNinjaHelper.cs3331ScoreController;

public class Game extends cs3331FruitNinjaGame{

    // creating the static controller and blade objects
    static cs3331ScoreController controller;
    private static cs3331Blade blade = new cs3331Blade("Alyssa");

    // When the game starts, a blade is added and a controller is created
    public Game(){
        this.addBlade(blade);
        controller = new cs3331ScoreController();
    }

    // method used for updating the objects on the screen - the choppable objects should move, and
    // if the blade cuts the object, it should call the right methods for the type of chopppable object
    public void updateChoppable(Choppable object) {

        object.move();

        if (blade.checkIntersection(object)) {
            object.chopped();   
        }
    }

    // method for launching an individual choppable object
    @Override
    public Choppable launchItem() {

        // random number created every time the method is called
        int objNum = (int)(Math.random()*5);

        // switch statement for creating the object at the random index the objNum creates
        switch (objNum) {
            case 0:
                Choppable bomb = new Bomb(); // creates the choppable object if it's case matches the objNum
                return bomb; // returns the choppable object
            case 1:
                Choppable apple = new Fruit(Constants.APPLE_PATH);
                return apple;
            case 2:
                Choppable lemon = new Fruit(Constants.LEMON_PATH);
                return lemon;
            case 3:
                Choppable pear = new Fruit(Constants.PEAR_PATH);
                return pear;
            default:
                Choppable peach = new Fruit(Constants.PEACH_PATH);
                return peach;
        }
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}