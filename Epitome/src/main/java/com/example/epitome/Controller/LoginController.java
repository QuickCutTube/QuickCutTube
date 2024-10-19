package com.example.epitome.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class LoginController {

    @FXML
    private Label welcomeText;

    @FXML
    private Button cancelButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    private final String validUsername = "admin";
    private final String validPassword = "12345";


    public void loginButtonOnAction(ActionEvent e) throws IOException {
        String enteredUsername = usernameTextField.getText();
        String enteredPassword = passwordPasswordField.getText();

        if (enteredUsername.isBlank() || enteredPassword.isBlank()) {
            loginMessageLabel.setText("Please enter username and password!");
        } else if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
            loginMessageLabel.setText("Login successful!");
            try {
                BorderPane B1 = FXMLLoader.load(getClass().getResource("homepage.fxml"));
                Scene scene = new Scene(B1);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("DASHBORD");
                stage.show();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }


        } else {
            loginMessageLabel.setText("Invalid username or password. Try again!");
        }
    }

    private void sss() throws IOException {
        BorderPane B1 = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        Scene scene = new Scene(B1);
        EventObject event = null;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("DASHBORD");
    }

    public void CancelButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome Epitome");
    }
}
