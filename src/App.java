import fruitNinjaHelper.cs3331FruitNinjaFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {
        cs3331FruitNinjaFrame frame = new cs3331FruitNinjaFrame(primaryStage);
        
        // Your code goes here!!
        Game myGame = new Game();
        frame.addGame(myGame); // adding the game to the frame
        frame.setTop(Game.controller); // add score to game
        myGame.startGame(); // starting the game
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}