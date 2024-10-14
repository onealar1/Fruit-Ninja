import fruitNinjaHelper.cs3331Blade;
import fruitNinjaHelper.cs3331FruitNinjaGame;
import fruitNinjaHelper.cs3331ScoreController;

public class Game extends cs3331FruitNinjaGame{

    private static cs3331ScoreController controller;
    private static cs3331Blade blade = new cs3331Blade("Alyssa");

    // You may need to add constructor
    public Game(){
        super.addBlade(blade);
        controller = new cs3331ScoreController();
    }

    
    public void updateChoppable(Object object) {

        
    }

    @Override
    public Object launchItem() {

        // YOUR code goes here
        return null;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}