
package exercicios;

public class Exercicio1 extends Thread{
   

    public Exercicio1(String p) {
      super(p);
       
    }

    public void run(){
        for(int i=1;i<10;i++){
          
        System.out.println(i+" : "+getName());
            long g= (long) (Math.random()*2000);
           
              try {
                Thread.sleep(g);
                
            } catch (InterruptedException ex) {
                System.out.println("ERROR: "+ex);
            }
    }  
        }
    
 
 
    public static void main(String[] args) {        
    new Exercicio1("h1").start();
      new Exercicio1("h2").start();   
    }
    
}
