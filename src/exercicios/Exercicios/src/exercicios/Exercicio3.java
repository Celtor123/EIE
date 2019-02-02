
package exercicios;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class Exercicio3 extends Thread{   

    public Exercicio3() {
         
    }
    
    public void run(){  
       Scanner a= new Scanner(System.in);
       String h=a.next();
       setName(h);
        System.out.println(getName()+" iniciando");
          
        for(int i=1;i<10;i++){
            System.out.println(i+""+getName());
        }        
    }
   

    
    public static void main(String[] args) {
        try {
            Exercicio3 h= new Exercicio3();
            Exercicio3 p=new Exercicio3();
            Exercicio3 q=new Exercicio3();
            h.join();
            h.start();            
            p.join();
            p.start();           
            q.join();
            q.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Exercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      }
    }


//Realizar un programa que cree un fío, que a súa vez cree outro fío, e así consecutivamente, ata un total de cinco fíos. 
//Cada fío debe presentar o seu nome indicando que comenzou, crear o seu fío fillo e presentar o seu nome 10 veces indicando que se está procesando, 
//esperando un tempo aleatorio entre 100 e 600 milisegundos entre cada presentación. 
//Cada fío deberá esperar a que o seu fillo termine antes de presentar o seu último mensaxe indicando o seu nome e que rematou.