package Code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller_5X5
{
    private String sign="X";
    @FXML
    protected void onClick(ActionEvent actionEvent){
        Button button=(Button)actionEvent.getSource();
        if (button.getText().equals("")&&sign.equals("X")){
            button.setText(sign);
            sign="O";
        }
        if (button.getText().equals("")&&sign.equals("O")){
            button.setText(sign);
            sign="X";
        }
    }
    @FXML
    protected void newGameClick() throws IOException {
        Main.GameScreen =new Scene(FXMLLoader.load(getClass().getResource("GamePage(5X5).fxml")),368,408);
        Main.GameStage.setScene(Main.GameScreen);
    }
    @FXML
    protected void BackToMainMenu(){
        Main.GameStage.setScene(Main.scene1);
    }
}
