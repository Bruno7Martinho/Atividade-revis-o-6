/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade6exer6;

/**
 *
 * @author 7
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }
     public boolean verificarAprovacao(){
        return calcularMedia() >= 7.0;
        }
    
     public void mostrarDados(){
         System.out.println("Nome: "+nome);
        
         System.out.println("Média: " + calcularMedia());
        if (verificarAprovacao()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
}
}