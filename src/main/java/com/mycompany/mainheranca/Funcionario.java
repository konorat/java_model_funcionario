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
public abstract class Funcionario {
    private String name;
    private double wage;
    private static int employes = 0;

    public Funcionario() {
        this.employes++;
    }

    public Funcionario(String name, double wage) {
        this.name = name;
        this.wage = wage;
        this.employes++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public static void setEmployes(int employes) {
        Funcionario.employes = employes;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    public static int getEmployes() {
        return employes;
    }
    
    public void updateWage(double i){
        wage += wage*i;
    }
    
    
    
}
