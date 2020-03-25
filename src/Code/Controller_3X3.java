package Code;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_3X3 extends CreateFxmlVariables implements Initializable {
    @FXML
    Button butt1;
    @FXML
    Button butt2;
    @FXML
    Button butt3;
    @FXML
    Button butt4;
    @FXML
    Button butt5;
    @FXML
    Button butt6;
    @FXML
    Button butt7;
    @FXML
    Button butt8;
    @FXML
    Button butt9;
    static String sign = "X";
    @FXML
    protected void onClick(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        if (getOther.isSelected()&&GameStatus.equals("Playing"))
        {
            if (button.getText().equals("") && sign.equals("X")) {
                button.setText(sign);
                sign = "O";
                if (ON.isSelected())new CreateFxmlVariables().xSound.play();
            }
            else if (button.getText().equals("") && sign.equals("O")) {
                button.setText(sign);
                sign = "X";
                if (ON.isSelected())new CreateFxmlVariables().oSound.play();
            }
            new GameWin().checkWin();
        }
        else {
            if (GameStatus.equals("Playing")) {
               if (ON.isSelected())new CreateFxmlVariables().xSound.play();
                if (button.getText().equals("")) {
                    Main.count++;
                    button.setText(sign);
                    new GameWin().checkWin();
                    new Brain().ComputerTurn(button);
                    new GameWin().checkWin();
                }
            }
        }
    }

    @FXML
    protected void newGameClick() throws IOException {
        Main.count = 0;
        GameStatus = "Playing";
        Main.GameScreen = new Scene(FXMLLoader.load(getClass().getResource("GamePage(3X3).fxml")), 368, 408);
        Main.GameStage.setScene(Main.GameScreen);
    }

    @FXML
    protected void BackToMainMenu() {
        Main.GameStage.setScene(Main.scene1);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button1 = butt1;
        button2 = butt2;
        button3 = butt3;
        button4 = butt4;
        button5 = butt5;
        button6 = butt6;
        button7 = butt7;
        button8 = butt8;
        button9 = butt9;
    }
}
