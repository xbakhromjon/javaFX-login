package uz.bakhromjon.javafxlogin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 08/11/22, Tue, 15:41
 **/
public class MainSceneController {
    @FXML
    private Label helloLabel;

    public void displayUsername(String username) {
        helloLabel.setText("Hello " + username);
    }

}
