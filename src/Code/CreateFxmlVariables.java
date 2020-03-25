package Code;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class CreateFxmlVariables{
   MediaPlayer xSound=new MediaPlayer(new Media(CreateFxmlVariables.class.getResource("ryse_menu_start_01.wav").toString()));
   MediaPlayer oSound=new MediaPlayer(new Media(CreateFxmlVariables.class.getResource("ryse_menu_move_03.wav").toString()));
   MediaPlayer winSound=new MediaPlayer(new Media(CreateFxmlVariables.class.getResource("win.wav").toString()));
   static String GameStatus = "Playing";
   static Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
   static RadioButton  getComputer,getOther,ON,OFF;
}
