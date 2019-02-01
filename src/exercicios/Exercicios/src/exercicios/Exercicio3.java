
package exercicios;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio3 implements Runnable{
Thread t;

    public Exercicio3(String nome) {
        t= new Thread(this,nome);
    }
    public static Exercicio3 fillo(String nome){
        Exercicio3 y= new Exercicio3(nome);
        y.t.start();
        return y;
    }
    

    
    public void run(){           
        
        System.out.println(t.getName()+"iniciando");
        
        for(int i=1;i<10;i++){
            System.out.println(i+t.getName());
        }try {
            Thread.sleep(450);
    } catch (InterruptedException ex) {
        System.out.println("error:"+ex);
    }
    }
    public static void main(String[] args) {
        Exercicio3 a=Exercicio3.fillo("eeee");
        Exercicio3 b=Exercicio3.fillo("ra");
        Exercicio3 c=Exercicio3.fillo("bon");
         for (int i = 0; i < 50; i++) {
             System.out.print(".");
             try {
                 Thread.sleep(100);
             } catch (InterruptedException exc) {
                 System.out.println("Hilo principal interrumpido.");
             }
         }
         System.out.println("Finalizado");
    }
    
}

//Realizar un programa que cree un fío, que a súa vez cree outro fío, e así consecutivamente, ata un total de cinco fíos. 
//Cada fío debe presentar o seu nome indicando que comenzou, crear o seu fío fillo e presentar o seu nome 10 veces indicando que se está procesando, 
//esperando un tempo aleatorio entre 100 e 600 milisegundos entre cada presentación. 
//Cada fío deberá esperar a que o seu fillo termine antes de presentar o seu último mensaxe indicando o seu nome e que rematou.