package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {

    public TextArea unos;
    public TextArea ispis;

    public void izlaz(ActionEvent actionEvent) {
        String s = unos.getText();
        String [] s1 = s.split(" ");
        String rijec = (Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
        for(int i = 0; i < s1.length; i++){
            if(s1[i].equals(rijec))
                s1[i] = s1[i].toUpperCase();
        }
        String novi = "";
        for(int i = 0; i < s1.length; i++){
            novi += s1[i] + " ";
        }
        ispis.setText(novi);
    }
}
