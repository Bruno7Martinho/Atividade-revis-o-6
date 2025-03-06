/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6exer6;

import java.util.Scanner;

/**
 *
 * @author 7
 */
public class Atividade6exer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      Aluno aluno = new Aluno();
      System.out.println("Informe o nome:");
      aluno.setNome(ler.next());
      System.out.println("Informe a nota 1:");
      aluno.setNota1(ler.nextDouble());
      System.out.println("Informe a nota 2:");
      aluno.setNota2(ler.nextDouble());
      aluno.mostrarDados();
    }
    
}
