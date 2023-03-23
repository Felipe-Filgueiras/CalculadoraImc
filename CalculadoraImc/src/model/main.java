/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author felip
 */
import control.CalculadoraImc;

public class main {
    public static void main(String[] args) {
        CalculadoraImc calc = new CalculadoraImc();
        System.out.println(calc.calcularImc(1.70, 115.6, 25, "masculino"));
    }
    
}
