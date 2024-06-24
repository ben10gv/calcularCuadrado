/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculaareaperimetrorectangulo;

import java.util.Scanner;

/**
 *
 * @author ben10
 */
public class CalculaAreaPerimetroRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaracion de variable*/
        int alto = 0;
        int ancho = 0;
        Scanner valores = new Scanner(System.in);
        
        //Preguntar Alto
        System.out.println("Proporcionar el alto:");
        alto = valores.nextInt();
        
        //Preguntar Ancho
        System.out.println("Proporcionar el ancho:");
        ancho = valores.nextInt();
        
        //Calcular y mostrar resultados
        int area = alto * ancho;
        System.out.println("area = " + area);
        
        int perimetro = (alto + ancho) * 2;
        System.out.println("perimetro = " + perimetro);
    }
    
}
