package uz.bakhromjon.javafxlogin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginSceneController {
    @FXML
    private TextField usernameField;

    @FXML
    private Label incorrectLabel;

    public void login(ActionEvent event) throws IOException {
        if (usernameField.getText().equalsIgnoreCase("xb")) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainScene.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            MainSceneController controller = fxmlLoader.getController();
            controller.displayUsername(usernameField.getText());
            stage.setScene(scene);
            stage.show();
        } else {
            incorrectLabel.setText("Bad credentials!");
        }
    }
}