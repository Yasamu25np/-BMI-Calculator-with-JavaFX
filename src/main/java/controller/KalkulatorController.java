package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BMImodel;  

public class KalkulatorController {

    @FXML
    private TextField inputBerat;

    @FXML
    private TextField inputTinggi;

    @FXML
    private Label labelHasil;
    @FXML
    protected void hitungBMI() { 
        try {
 
            double berat = Double.parseDouble(inputBerat.getText());
            double tinggiCm = Double.parseDouble(inputTinggi.getText());

 
            BMImodel bmi = new BMImodel(berat, tinggiCm);

            double skor = bmi.hitungSkor();
            String kategori = bmi.getKategori(skor);

 
labelHasil.setText(String.format("Skor BMI Anda: %.2f\nKategori: %s", skor, kategori));

        } catch (NumberFormatException e) {
       
            labelHasil.setText("Error: Harap masukkan angka berat dan tinggi yang valid!");
        }
    }

 
}
