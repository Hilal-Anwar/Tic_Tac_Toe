package Code;

import javafx.scene.control.Button;

public class GameWin extends CreateFxmlVariables {
    void checkWin()
    {
        if (button1.getText().equals("X") || button1.getText().equals("O")) {
            if (button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()))
                applyWin(button1, button2, button3);
            if (button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText()))
                applyWin(button1, button4, button7);
            if (button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText()))
                applyWin(button1, button5, button9);
        }
        if (button2.getText().equals("X") || button2.getText().equals("O")) {
            if (button2.getText().equals(button1.getText()) && button2.getText().equals(button3.getText()))
                applyWin(button2, button1, button3);
            if (button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText()))
                applyWin(button2, button5, button8);
        }
        if (button3.getText().equals("X") || button3.getText().equals("O")) {
            if (button3.getText().equals(button2.getText()) && button3.getText().equals(button1.getText()))
                applyWin(button3, button1, button2);
            if (button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText()))
                applyWin(button3, button6, button9);
            if (button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText()))
                applyWin(button3, button5, button7);
        }
        if (button4.getText().equals("X") || button4.getText().equals("O")) {
            if (button4.getText().equals(button1.getText()) && button4.getText().equals(button7.getText()))
                applyWin(button4, button1, button7);
            if (button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText()))
                applyWin(button4, button5, button6);
        }
        if (button5.getText().equals("X") || button5.getText().equals("O")) {
            if (button5.getText().equals(button1.getText()) && button5.getText().equals(button9.getText()))
                applyWin(button5, button1, button9);
            if (button5.getText().equals(button3.getText()) && button5.getText().equals(button7.getText()))
                applyWin(button5, button7, button3);
        }
        if (button6.getText().equals("X") || button6.getText().equals("O")) {
            if (button6.getText().equals(button3.getText()) && button6.getText().equals(button9.getText()))
                applyWin(button6, button1, button9);
            if (button6.getText().equals(button5.getText()) && button6.getText().equals(button4.getText()))
                applyWin(button6, button5, button4);
        }
        if (button7.getText().equals("X") || button7.getText().equals("O")) {
            if (button7.getText().equals(button4.getText()) && button7.getText().equals(button1.getText()))
                applyWin(button7, button4, button1);
            if (button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText()))
                applyWin(button7, button8, button9);
            if (button7.getText().equals(button5.getText()) && button7.getText().equals(button3.getText()))
                applyWin(button7, button5, button3);
        }
        if (button8.getText().equals("X") || button8.getText().equals("O")) {
            if (button8.getText().equals(button7.getText()) && button8.getText().equals(button9.getText()))
                applyWin(button8, button7, button9);
            if (button8.getText().equals(button5.getText()) && button8.getText().equals(button2.getText()))
                applyWin(button8, button5, button2);
        }
        if (button9.getText().equals("X") || button9.getText().equals("O")) {
            if (button9.getText().equals(button6.getText()) && button9.getText().equals(button3.getText()))
                applyWin(button9, button6, button3);
            if (button9.getText().equals(button5.getText()) && button9.getText().equals(button1.getText()))
                applyWin(button1, button5, button9);
            if (button9.getText().equals(button8.getText()) && button9.getText().equals(button7.getText()))
                applyWin(button9, button8, button7);
        }

    }

    void applyWin(Button b1, Button b2, Button b3) {
        if (GameStatus.equals("Playing")) {
            b1.setStyle("-fx-text-fill:red;-fx-background-color:transparent");
            b2.setStyle("-fx-text-fill:red;-fx-background-color:transparent");
            b3.setStyle("-fx-text-fill:red;-fx-background-color:transparent");
            if (ON.isSelected())new CreateFxmlVariables().winSound.play();
            GameStatus = "Won";
        }
    }
}
