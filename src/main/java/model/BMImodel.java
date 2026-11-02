/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class BMImodel {
    private double beratBadan;
    private double tinggiBadanCm;

     public BMImodel() {}

     public BMImodel(double beratBadan, double tinggiBadanCm) {
        this.beratBadan = beratBadan;
        this.tinggiBadanCm = tinggiBadanCm;
    }

    public double hitungSkor() {
        double tinggiMeter = this.tinggiBadanCm / 100.0;
         return this.beratBadan / (tinggiMeter * tinggiMeter);
    }

     public String getKategori(double skor) {
        if (skor < 18.5) {
            return "Kurus (Kekurangan berat badan)";
        } else if (skor >= 18.5 && skor < 25.0) {
            return "Normal (Ideal)";
        } else if (skor >= 25.0 && skor < 30.0) {
            return "Kelebihan berat badan";
        } else {
            return "Obesitas (Kelebihan berat badan tingkat berat)";
        }
    }

    public double getBeratBadan() { return beratBadan; }
    public void setBeratBadan(double beratBadan) { this.beratBadan = beratBadan; }

    public double getTinggiBadanCm() { return tinggiBadanCm; }
    public void setTinggiBadanCm(double tinggiBadanCm) { this.tinggiBadanCm = tinggiBadanCm; }
}
