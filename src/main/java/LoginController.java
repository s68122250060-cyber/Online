package com.example.online;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {

        String email = emailField.getText();
        String password = passwordField.getText();

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}