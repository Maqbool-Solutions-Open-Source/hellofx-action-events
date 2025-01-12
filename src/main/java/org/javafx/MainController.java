package org.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController implements Initializable {

    @FXML
    private Button button;

    @FXML
    private Label lblListening;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Preferred method: Fire the button action
        button.fire();

        // Alternative method: Manually create and pass an ActionEvent
        ActionEvent event = new ActionEvent(button, null);
        buttonOnAction(event);
    }

    @FXML
    void buttonOnAction(ActionEvent event) {
        if (event == null || event.getSource() == null) {
            System.out.println("ActionEvent or its source is null!");
            return;
        }

        String getButtonText = ((Button) event.getSource()).getText();
        lblListening.setText(getButtonText);
    }

}
