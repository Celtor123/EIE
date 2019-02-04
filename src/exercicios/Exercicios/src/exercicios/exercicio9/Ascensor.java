package exercicios.exercicio9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ascensor extends Thread{
   
    Edificio e;    
    int movemento=0;
 boolean estado=false;
    public Ascensor(Edificio e) {
        this.e = e;
    }
    public synchronized void movemento() {             
          estado=false;
            System.out.println("hola");
            if(movemento<e.posicion){
                while(movemento<e.posicion){
                    try {
                        System.out.println(movemento);
                        movemento++;
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ascensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }System.out.println(movemento);}
            if(movemento>e.posicion){
                while(movemento>e.posicion){
                    try {
                        System.out.println(movemento);
                        movemento--;
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ascensor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }System.out.println(movemento);}
           
        } 
   
     
    
    
    @Override
    public void run(){
        //activar metodo de movemento  
        
       if(estado=true){
           movemento(); 
       }
       else{
        System.out.println("nada");
    }
      
        
       
    }
}
