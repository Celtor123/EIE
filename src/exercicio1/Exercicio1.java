
package exercicio1;

public class Exercicio1 extends Thread{
   Thread r;

    public Exercicio1(String p) {
      super(p);
       
    }
 
    public void run(){
        for(int i=0;i<10;i++){
          
        System.out.println(i+getName());
    }  
        }
    
 
 
    public static void main(String[] args) {
        
    new Exercicio1("hilo1").start();
      new Exercicio1("hilo2").start();   
    }
    
}
