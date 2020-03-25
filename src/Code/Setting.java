package Code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Setting extends CreateFxmlVariables implements Initializable{
    @FXML
    RadioButton radio_3X3,radio_4X4,radio_5X5,on,off,other,computer;
    @FXML
    protected void BackToMainMenu(){
        Main.GameStage.setScene(Main.scene1);
    }
    @FXML
    protected void selectLevel(ActionEvent actionEvent)throws IOException {
        RadioButton radioButton=(RadioButton)actionEvent.getSource();
        if (radioButton.getText().equals("(3 x 3)"))
        {
            getComputer.setSelected(true);
            getOther.setSelected(false);
            getComputer.setDisable(false);
            radioButton.setSelected(true);
            radio_4X4.setSelected(false);
            radio_5X5.setSelected(false);
            Main.GameScreen =new Scene(FXMLLoader.load(getClass().getResource("GamePage(3X3).fxml")),368,408);
        }
        if (radioButton.getText().equals("(4 x 4)")){
            radioButton.setSelected(true);
            getComputer.setSelected(false);
            getOther.setSelected(true);
            getComputer.setDisable(true);
            radio_3X3.setSelected(false);
            radio_5X5.setSelected(false);
            Main.GameScreen =new Scene(FXMLLoader.load(getClass().getResource("GamePage(4X4).fxml")),368,408);
        }
        if (radioButton.getText().equals("(5 x 5)")){
            getComputer.setSelected(false);
            getOther.setSelected(true);
            getComputer.setDisable(true);
            radioButton.setSelected(true);
            radio_4X4.setSelected(false);
            radio_3X3.setSelected(false);
            Main.GameScreen =new Scene(FXMLLoader.load(getClass().getResource("GamePage(5X5).fxml")),368,408);
        }
    }
    @FXML
    protected void soundController(ActionEvent actionEvent){
        RadioButton radioButton=(RadioButton)actionEvent.getSource();
        if (radioButton.getText().equals("ON")){
            radioButton.setSelected(true);
            off.setSelected(false);
        }
        if (radioButton.getText().equals("OFF")){
            radioButton.setSelected(true);
            on.setSelected(false);
        }
    }
    @FXML
    protected void chooseOpponent(ActionEvent actionEvent){
        System.out.println("I am hear");
        RadioButton radioButton=(RadioButton)actionEvent.getSource();
        if (radioButton.getId().equals("computer")){
            getComputer.setSelected(true);
            getOther.setSelected(false);
        }
        else
        {
            getOther.setSelected(true);
            getComputer.setSelected(false);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getComputer=computer;
        getOther=other;
        ON=on;
        OFF=off;
    }
}
