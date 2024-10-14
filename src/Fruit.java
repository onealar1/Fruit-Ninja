import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs3331Fruit;

public class Fruit extends cs3331Fruit implements Choppable{

    private String url;

    public Fruit(String url){
        this.url = url;
        this.setImage(url);
        this.ripen();
        this.wash();
    }

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

    @Override
    public void move() {
        this.moveFruit();
    }

    @Override
    public void chop() {
        this.chopGraphically();
        this.splash();
    }

}
