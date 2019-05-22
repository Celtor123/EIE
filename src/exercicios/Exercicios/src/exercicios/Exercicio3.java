
package exercicios;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Exercicio3 extends Thread{   
    static int contador=0;
    Exercicio3 exercicio;
    public Exercicio3() {
         contador++;
         this.start();
         if (contador<5){
             exercicio=new Exercicio3();
         }
    }
    
    public void run(){  
   
        
          
        for(int i=1;i<10;i++){
            System.out.println(i+""+this.getName());
        }      
        if(this.getName().equals("Thread-4")){
            System.out.println("fin");
        }else{
            try {
                exercicio.join();
            } catch (InterruptedException ex) {
                System.out.println("Excepciom: "+ex);
            }
        }
    }
   

    
    public static void main(String[] args) {
        Exercicio3 exercicio3 = new Exercicio3();
         
      }
    }


//Realizar un programa que cree un fío, que a súa vez cree outro fío, e así consecutivamente, ata un total de cinco fíos. 
//Cada fío debe presentar o seu nome indicando que comenzou, crear o seu fío fillo e presentar o seu nome 10 veces indicando que se está procesando, 
//esperando un tempo aleatorio entre 100 e 600 milisegundos entre cada presentación. 
//Cada fío deberá esperar a que o seu fillo termine antes de presentar o seu último mensaxe indicando o seu nome e que rematou.