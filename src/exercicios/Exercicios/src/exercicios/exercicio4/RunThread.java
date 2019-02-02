/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.exercicio4;

import exercicios.exercicio4.Exercicio4;

/**
 *
 * @author Juan
 */
public class RunThread {
    public static void main(String args[]) {   
        Exercicio4 thread1= new Exercicio4("thread1");   
        thread1.setPriority(10);   
        Exercicio4 thread2= new Exercicio4("thread2");   
        thread2.setPriority(10);   
        thread2.start();   
        thread1.start();  
    
} 
}
