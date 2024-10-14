import fruitNinjaHelper.cs3331FruitNinjaGame;

public class Game extends cs3331FruitNinjaGame{

    // You may need to add constructor

    
    public void updateChoppable(Object object) {
        
        // Your code goes here
        
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