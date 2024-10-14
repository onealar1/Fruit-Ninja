import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements Choppable{

    // when a bomb is created, it should set the image
    public Bomb(){
        this.setImage();
    }

    // Choppable method for moving the bomb accross the screen
    @Override
    public void move() {
        this.moveBomb();
    }

    // Choppable method for when a bomb is chopped - it should explode
    @Override
    public void chopped() {
        this.explode();
    }
}
