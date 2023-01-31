/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainheranca;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Konorat
 */
public class MainHeranca {

    
    public static void main(String[] args) {
        

        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        
        int op;
        do{
        System.out.println("");
        System.out.println("|========Funcionários=======|");
        System.out.println("| 1 - Cadastrar Funcionário |");
        System.out.println("| 2 - Listar Funcionários   |");
        System.out.println("| 3 - Reajustar Salários    |");
        System.out.println("| 4 - Fechar Sistema        |");
        System.out.println("|===========================|");
        
        Scanner in = new Scanner(System.in);
        System.out.print("Opção: ");
        op = in.nextInt();
        System.out.println("  ");
        
            switch(op){
                case 1:
                    System.out.println("");
                    System.out.println("|===Cadastrar Funcionários==|");
                    System.out.println("| 1 - Cadastrar Técnico     |");
                    System.out.println("| 2 - Cadastrar Gerente     |");
                    System.out.println("| 3 - Cadastrar Secretárix  |");
                    System.out.println("|===========================|");

                    Funcionario f;

                    System.out.print("Opção: ");
                    int o = in.nextInt();
                    in.nextLine();
                    System.out.println("Nome: ");
                    String name = in.nextLine();
                    System.out.println("Salário: ");
                    double wage = in.nextDouble();
                    //INSTANCIANDO OS OBJETOS E ADICIONANDO NO ARRAYLIST CONFORME INPUTS DO USUARIO
                    switch(o){
                        case 1:
                            funcs.add(new Tecnico(name, wage));
                            break;
                        case 2:
                            funcs.add(new Gerente(name, wage));
                            break;
                        case 3:
                            funcs.add(new Secretario(name, wage));
                            break;
                        default:
                            System.out.println("Opção Incorreta");
                    }
                    break;
                    //LISTANDO FUNCIONARIOS DO ARRAYLIST
                case 2:
                    System.out.println("Lista funcionarios");
                    for (Funcionario funcionario : funcs){
                        System.out.println(funcionario.toString());
                    }
                    break;
                case 3:
                    //ABAIXO RECEBO O NUMERO QUE REPRESENTA QUAL FUNCIONARIO DEVE SER REAJUSTADO O SALÁRIO E 
                    // PERCORRO O ARRAYLIST ATUALIZANDO APENAS OS SALÁRIOS DA SUBCLASSE ESCOLHIDA, COMPARANDO A CLASSE DO OBJETO NO ARRAYLIST COM A CLASSE DESEJADA 
                    System.out.println("");
                    System.out.println("|=====Reajustar Salário=====|");
                    System.out.println("| 1 - Reajustar Técnico     |");
                    System.out.println("| 2 - Reajustar Gerente     |");
                    System.out.println("| 3 - Reajustar Secretárix  |");
                    System.out.println("|===========================|");
                    System.out.println("Opção: ");
                    int i = in.nextInt();
                    System.out.println("Indice do reajuste (0.01 a 0.99): ");
                    double reaj = in.nextDouble();
                    
                    switch(i){
                        case 1:
                            for (Funcionario funcionario : funcs){
                                if(funcionario.getClass() == Tecnico.class){
                                    funcionario.updateWage(reaj);
                                }
                            }
                            break;
                        case 2:
                            for (Funcionario funcionario : funcs){
                                if(funcionario.getClass() == Gerente.class){
                                    funcionario.updateWage(reaj);
                                }
                            }
                            break;
                        case 3:
                            for (Funcionario funcionario : funcs){
                                if(funcionario.getClass() == Secretario.class){
                                    funcionario.updateWage(reaj);
                                }
                            }
                            break;
                    }                
                    break;  
            }
        }while(op != 4);
}
}
