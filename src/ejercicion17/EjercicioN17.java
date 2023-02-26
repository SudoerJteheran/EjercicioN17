/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion17;
import java.util.Scanner;

/**
 *
 * @author kkmie
 */
public class EjercicioN17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double  area_perimetro[];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo:");
        radio = entrada.nextDouble();
        area_perimetro = area_y_perimetro(radio);
        
        System.out.println("El area del cículo es: " + area_perimetro[0]);
        System.out.println("El perimetro del cículo es:" + area_perimetro[1]+"\n");
    }
    
    static double[] area_y_perimetro(double radio){
        double area, perimetro;
        double area_perimetro[] = new double[2];
        
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        area_perimetro[0] = area;
        area_perimetro[1] = perimetro;
        
        return area_perimetro;
    }
    
}
