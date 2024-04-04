/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
    FormaGeometrica circulo1 = new Circulo(3);
    FormaGeometrica quadrado1 = new Quadrado(3);
    System.out.println("área do circulo: " + circulo1.calcularArea());
    System.out.println("área do quadrado: " + quadrado1.calcularArea());         
    }
    
    
}
