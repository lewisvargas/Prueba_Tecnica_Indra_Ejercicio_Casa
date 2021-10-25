/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocasa;

import java.util.Scanner;

/**
 *
 * @author Lewis Vargas Flórez
 */
public class EjercicioCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int Filas = 1, Columnas = 8;
        int casa[][] = new int [Filas][Columnas];
        int i, j, k=0;
        int dias;
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los dias:");
        dias = lectura.nextInt();
        
        System.out.println("Ingrese los elementos de la matriz:");
        for(i=0; i < Filas; i++){
            for(j=0; j < Columnas; j++){
                System.out.print("Casa[" + i + "][" + j + "]=");
                casa[i][j] = lectura.nextInt();
            }
        }
        
        if(dias < 0){
            System.out.println("Error de los parametros");
        }
        else{
            for(i=0; i<dias; i++){
                if(i < dias){
                    int valorAnterior= 0;
                    int valorSiguiente= 0;
                    
                    System.out.println("Cantidad de dias:" + dias);
                    for(i=0; i<casa.length; i++){
                        for(j=0; j<casa[i].length; j++){
                            
                            //System.out.print(casa[i][j] + " ");
                            if(i < casa.length){
                                if(j < casa.length-1){
                                    valorSiguiente = i+1;
                                
                                    if(valorSiguiente == valorAnterior){
                                        System.out.print(casa[i][j] + " ");
                                    }
                                    else{
                                        System.out.print(casa[i][j] + " ");
                                    }
                                }
                                else{
                                    if(valorSiguiente == valorAnterior){
                                        System.out.print(casa[i][j] + " ");
                                    }
                                    else{
                                        System.out.print(casa[i][j] + " ");
                                    }
                                }
                            }
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("Error de los parametros");
                }
            }
        }
        // TODO code application logic here
    }
    
}
