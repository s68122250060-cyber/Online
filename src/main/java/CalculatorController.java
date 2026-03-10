package com.example.online;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField result;

    @FXML
    private void add() {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        result.setText(String.valueOf(a + b));
    }

    @FXML
    private void subtract() {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        result.setText(String.valueOf(a - b));
    }

    @FXML
    private void multiply() {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        result.setText(String.valueOf(a * b));
    }

    @FXML
    private void divide() {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        result.setText(String.valueOf(a / b));
    }
}