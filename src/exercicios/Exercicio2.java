
package exercicios;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Exercicio2 implements Runnable{
private String nome;
    public Exercicio2(String nome) {
        this.nome=nome;
    }

    @Override
    public void run() {
       for(int i=1;i<=5;i++){
           System.out.println(i + nome);
      
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               System.out.println("Error. "+ex);
           }
                            
           }          
    }
     public static void main(String[] args) {        
     Exercicio2 a = new Exercicio2(" primeiro");
     Exercicio2 b = new Exercicio2(" segundo");
      Exercicio2 c = new Exercicio2(" terceiro");
       Exercicio2 d = new Exercicio2(" cuarto");
     new Thread(a).start();
     new Thread(b).start();
     new Thread(c).start();
     new Thread(d).start();
     
}}
//
//Programa que crea 4 
//fíos, os executa e espera a que estes terminen. 
//Os fíos escriben 5 veces o 
//número de iteración do bucle
//e o seu nome. En cada iteración, despois de escribir
//o seu nome, bloquéanse
//durante un segundo e volven a estar dispoñbles 
//para a súa execución