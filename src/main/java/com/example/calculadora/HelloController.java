 package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


 public class HelloController {

    @FXML
    private TextArea tAMensaje;
    @FXML
    private Button Boton8;
    @FXML
    private Button Boton9;
    @FXML
    private Button Boton6;
    @FXML
    private Button Boton7;
    @FXML
    private Button BotonSuma;
    @FXML
    private Button BotonDivi;
    @FXML
    private Button BotonMulti;
    @FXML
    private Button Boton0;
    @FXML
    private Button BotonResta;
    @FXML
    private Button Boton1;
    @FXML
    private Button BotonResultado;
    @FXML
    private Button Boton4;
    @FXML
    private Button Boton5;
    @FXML
    private Button Boton2;
    @FXML
    private Button Boton3;
     @FXML
     private Button BotonPunto;
     @FXML
     private Button BotonC;
     @FXML
     private Button BotonMasMenos;
     @FXML
     private Button BotonPorcentaje;

     @FXML
    public void onButton1Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("1");
    }

     @FXML
     public void onButton8Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("8");
     }

     @FXML
     public void onButton7Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("7");
     }

     @FXML
     public void onButton9Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("9");
     }

     @FXML
     public void onButtonMultiPulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("*");
     }

     @FXML
     public void onButtonRestaPulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("-");
     }

     @FXML
     public void onButton4Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("4");
     }

     @FXML
     public void onButton5Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("5");
     }

     @FXML
     public void onButtonSumaPulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("+");
     }

     @FXML
     public void onButtonDiviPulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("/");
     }

     @FXML
     public void onButton6Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("6");
     }

     @FXML
     public void onButton3Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("3");
     }

     @FXML
     public void onButton2Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("2");
     }

     @FXML
     public void onButton0Pulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("0");
     }

     @FXML
     public void onButtonResultadoPulsado(ActionEvent actionEvent) {
        tAMensaje.appendText("=");
     }

     @FXML
     public void onBotonPuntoPulsado(ActionEvent actionEvent) {
         tAMensaje.appendText(".");

     }

     @FXML
     public void onButtonMasMenosPulsado(ActionEvent actionEvent) {
         tAMensaje.appendText("+/-");

     }

     @FXML
     public void onButtonCPulsado(ActionEvent actionEvent) {
         tAMensaje.clear();
     }

     @FXML
     public void onButtonPorcentajePulsado(ActionEvent actionEvent) {
         tAMensaje.appendText("%");
     }
 }