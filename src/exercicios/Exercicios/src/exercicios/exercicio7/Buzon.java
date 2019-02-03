
package exercicios.exercicio7;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Buzon extends Thread {
    Exercicio7 r;
    ArrayList <String>Mensaje= new ArrayList<>();
    public String mensaje;

    public Buzon(Exercicio7 r) {
        this.r = r;
    }
    public synchronized void escribir(){       
        try {
            wait();
            do{
                mensaje=JOptionPane.showInputDialog("Escriba \n escriba exit para salir");
                Mensaje.add(mensaje);
            }while(!mensaje.equals("exit"));
            System.out.println("FIN de escritura");
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    public synchronized void ler(){
        try {
             wait();
            System.out.println("Mensaxe: ");
            for(int i=0;i<Mensaje.size();i++){
                System.out.println(Mensaje.get(i));
            }
           
        } catch (InterruptedException ex) {
            Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    @Override
    public void run(){
        synchronized(Mensaje){
            if(!Mensaje.isEmpty()){
                try {
                    wait();
                    Mensaje.clear();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                notifyAll();
            }
        }
          
          
    }
    
}
