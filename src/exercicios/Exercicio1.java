
package exercicios;

public class Exercicio1 extends Thread{
   

    public Exercicio1(String p) {
      super(p);
       
    }
 
    public void run(){
        for(int i=0;i<10;i++){
          
        System.out.println(i+getName());
    }  
        }
    
 
 
    public static void main(String[] args) {        
    new Exercicio1("h").start();
      new Exercicio1("i").start();   
    }
    
}
