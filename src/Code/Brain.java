package Code;

import javafx.scene.control.Button;

public class Brain extends CreateFxmlVariables {
    String[][][] DefenderString = {{{"#b2", "#b3"}, {"#b7", "#b4"}, {"#b5", "#b9"}},
            {{"#b3", "#b1"}, {"#b5", "#b8"}},
            {{"#b2", "#b1"}, {"#b6", "#b9"}, {"#b5", "#b7"}},
            {{"#b1", "#b7"}, {"#b5", "#b6"}},
            {{"#b1", "#b9"}, {"#b3", "#b7"}, {"#b2", "#b8"}, {"#b4", "#b6"}},
            {{"#b5", "#b4"}, {"#b3", "#b9"}},
            {{"#b1", "#b4"}, {"#b9", "#b8"}, {"#b5", "#b3"}},
            {{"#b9", "#b7"}, {"#b2", "#b5"}},
            {{"#b6", "#b3"}, {"#b7", "#b8"}, {"#b1", "#b5"}}};
    String[][] WinString = {{"#b1", "#b2", "#b3"}, {"#b1", "#b4", "#b7"}, {"#b1", "#b5", "#b9"},
            {"#b2", "#b1", "#b3"}, {"#b2", "#b3", "#b1"}, {"#b3", "#b2", "#b1"},
            {"#b3", "#b6", "#b9"}, {"#b3", "#b9", "#b6"}, {"#b4", "#b1", "#b7"}, {"#b4", "#b5", "#b6"},
            {"#b5", "#b1", "#b9"}, {"#b5", "#b3", "#b7"}, {"#b5", "#b2", "#b8"}, {"#b5", "#b4", "#b6"},
            {"#b6", "#b3", "#b9"}, {"#b6", "#b5", "#b4"}, {"#b7", "#b4", "#b1"}, {"#b7", "#b5", "#b3"},
            {"#b7", "#b8", "#b9"}, {"#b8", "#b5", "#b2"}, {"#b8", "#b7", "#b9"}, {"#b9", "#b5", "#b1"},
            {"#b9", "#b8", "#b7"}, {"#b9", "#b6", "#b3"}};

    void ComputerTurn(Button userClickedButton) {
        int x = 0;
        boolean condition = checkWinO();
        if (!condition) {
            x = Defence(userClickedButton);
            if (x == 0) {
                Main.count++;
            }
        }
        if (x == 1 && Main.count < 8)
            action(userClickedButton);
    }

    private int Defence(Button bt)
    {
        if (bt.getId().equals("b1")) {
            return computeAction(0, 3);
        }
        if (bt.getId().equals("b2")) {
            return computeAction(1, 2);
        }
        if (bt.getId().equals("b3")) {
            return computeAction(2, 3);
        }
        if (bt.getId().equals("b4")) {
            return computeAction(3, 2);
        }
        if (bt.getId().equals("b5")) {
            return computeAction(4, 4);
        }
        if (bt.getId().equals("b6")) {
            return computeAction(5, 2);
        }
        if (bt.getId().equals("b7")) {
            return computeAction(6, 3);
        }
        if (bt.getId().equals("b8")) {
            return computeAction(7, 2);
        }
        if (bt.getId().equals("b9")) {
            return computeAction(8, 3);
        }
        return 1;
    }

    boolean checkWinO() {
        for (int k = 0; k < 24; k++) {
            if (((Button) (Main.GameScreen.lookup(WinString[k][0]))).getText().equals("O") && ((Button) (Main.GameScreen.lookup(WinString[k][1]))).getText().equals("O")) {
                if (((Button) (Main.GameScreen.lookup(WinString[k][2]))).getText().equals("")) {
                    ((Button) (Main.GameScreen.lookup(WinString[k][2]))).setText("O");
                    return true;
                }
            }
        }
        return false;
    }

    private void action(Button bn) {
        Main.count++;
        int q;
        String[] a = {"#b1", "#b2", "#b3", "#b4", "#b5", "#b6", "#b7", "#b8", "#b9"};
        String[] b = {"#b2", "#b4", "#b6", "#b8"};
        String[] c = {"#b1", "#b3", "#b7", "#b9"};
        if (bn.getId().equals("b1") && button5.getText().equals("")) {
            button5.setText("O");
        } else if (bn.getId().equals("b3") && button5.getText().equals("")) {
            button5.setText("O");
        } else if (bn.getId().equals("b7") && button5.getText().equals("")) {
            button5.setText("O");
        } else if (bn.getId().equals("b9") && button5.getText().equals("")) {
            button5.setText("O");
        } else if (bn.getId().equals("b5")) {
            while (true) {
                q = (int) (Math.random() * 4);
                Button button = (Button) (Main.GameScreen.lookup(c[q]));
                if (button.getText().equals("")) {
                    button.setText("O");
                    break;
                }
            }
        } else if (button2.getText().equals("") || button4.getText().equals("") || button6.getText().equals("") || button8.getText().equals("")) {
            while (true) {
                q = (int) (Math.random() * 4);
                Button button = (Button) (Main.GameScreen.lookup(b[q]));
                if (button.getText().equals("")) {
                    button.setText("O");
                    break;
                }
            }
        } else {
            while (true) {
                q = (int) (Math.random() * 9);
                Button button = (Button) (Main.GameScreen.lookup(a[q]));
                if (button.getText().equals("")) {
                    button.setText("O");
                    break;
                }
            }
        }
    }

    int computeAction(int i, int size) {
        for (int j = 0; j < size; j++) {
            if (((Button) (Main.GameScreen.lookup(DefenderString[i][j][0]))).getText().equals("X")) {
                if (((Button) (Main.GameScreen.lookup(DefenderString[i][j][1]))).getText().equals("")) {
                    ((Button) (Main.GameScreen.lookup(DefenderString[i][j][1]))).setText("O");
                    return 0;
                }
            }
            if (((Button) (Main.GameScreen.lookup(DefenderString[i][j][1]))).getText().equals("X")) {
                if (((Button) (Main.GameScreen.lookup(DefenderString[i][j][0]))).getText().equals("")) {
                    ((Button) (Main.GameScreen.lookup(DefenderString[i][j][0]))).setText("O");
                    return 0;
                }
            }
        }
        return 1;
    }
}