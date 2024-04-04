
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Quadrado implements FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    Scanner ler = new Scanner(System.in);
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
