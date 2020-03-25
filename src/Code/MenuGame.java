package Code;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuGame extends CreateFxmlVariables implements Initializable
{
    @FXML
    protected void Click() {
            Main.GameStage.setScene(Main.GameScreen);
            if (getComputer.isSelected()){
                System.out.println("Computer has to make a move");
            }
    }
    @FXML
    protected void onSetting(){
        Main.GameStage.setScene(Main.scene3);
    }
    @FXML
    protected void onAbout(){
        Main.GameStage.setScene(Main.scene4);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
