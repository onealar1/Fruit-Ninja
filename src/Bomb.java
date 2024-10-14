import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements Choppable{

    public Bomb(){
        this.setImage();
    }

    @Override
    public void move() {
        this.moveBomb();
    }

    @Override
    public void chop() {
        this.explode();
    }
}
