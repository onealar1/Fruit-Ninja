import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs3331Fruit;

public class Fruit extends cs3331Fruit implements Choppable{

    // the image url for each fruit
    private String url;

    // when a fruit is made, an image should be set, and it should be washed and ripened
    public Fruit(String url){
        this.url = url;
        this.setImage(url);
        this.ripen();
        this.wash();
    }

    // method for getting the points for each fruit
    public int getPoints(String url) {
        if(url == Constants.APPLE_PATH || url == Constants.LEMON_PATH){
            return 2;
        }
        else if (url == Constants.PEAR_PATH) {
            return 3;
        }
        else {
            return 5;
        }
    }

    // Chopppable method that will move the fruits accross the screen
    @Override
    public void move() {
        this.moveFruit();
    }

    // Choppable method for when a fruit is choppped - it should be chopped in half, splash, and the points for that fruit should appear on the screen
    @Override
    public void chopped() {
        this.chopGraphically();
        this.splash();
        int points = this.getPoints(url);
        Game.controller.addToScore(points);
    }

}
