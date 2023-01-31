/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainheranca;
import java.util.Scanner;

/**
 *
 * @author Konorat
 */
public class Gerente extends Funcionario{
    

    public Gerente() {
    }

    public Gerente(String name, double wage) {
        super(name, wage);
    }
    
    @Override
    public void updateWage(double i) {
        setWage(getWage() + (getWage() * i));
    }
    
        @Override
    public String toString() {
        return "Gerente - Nome: " + getName() + " Salário: " + getWage() + " Total Funcionários: " + getEmployes();
    }
    
}
