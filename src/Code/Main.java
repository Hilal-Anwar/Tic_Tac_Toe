package Code;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class Main extends Application {
    static Stage GameStage=new Stage();
    static int count =0;
    static Scene scene1,GameScreen,scene3,scene4;
    @Override
    public void start(Stage primaryStage) throws Exception{
        scene1=new Scene(FXMLLoader.load(getClass().getResource("MainPage.fxml")),368,408);
        GameScreen =new Scene(FXMLLoader.load(getClass().getResource("GamePage(3X3).fxml")),368,408);
        scene3=new Scene(FXMLLoader.load(getClass().getResource("SettingPage.fxml")),368,408);
        scene4=new Scene(FXMLLoader.load(getClass().getResource("About.fxml")),368,408);
        GameStage.setTitle("TicTacToe");
        GameStage.getIcons().add(new Image(Main.class.getResource("Tic-Tac-Toe-Game-red.png").toString()));
        GameStage.setResizable(false);
        GameStage.setScene(scene1);
        GameStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
