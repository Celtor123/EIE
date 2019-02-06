
package exercicios.exercicio7;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Buzon extends Thread {
    Exercicio7 r;
     String mensaje;
          ArrayList <String>Mensaje= new ArrayList<>();  
    private int variable;
    public Buzon(Exercicio7 r) {
        this.r = r;
    }
      public synchronized void escribir(){         
      
        
         
          if(Mensaje.isEmpty()){
                mensaje=JOptionPane.showInputDialog("Escriba");
                Mensaje.add(mensaje);
                     
            System.out.println("FIN de escritura");  
        correo();}else{
              error();
          }}
    public synchronized void correo(){
        Object[] Botones={"Enviar Mensaxe","Ler Mensaxe","Saír"};
     
        variable=JOptionPane.showOptionDialog(null, "Elixa","Centro de operacións", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, Botones, Botones[0]);
     
        
        if(variable==0){
            escribir();
          }  
        if(variable==1){   
        ler();
        }
        else{
            try {
              interrupt();
            } catch (Throwable ex) {
                Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        JOptionPane.showMessageDialog(null,"Ata logo"); 
    interrupt();}
   
    public synchronized void error(){            
            JOptionPane.showMessageDialog(null,"Error: Xa hai mensaxes");
        Object[] botonsdous={"eliminar o mensaxe","Voltar a menu principal","Saír"};
       int recu= JOptionPane.showOptionDialog( null,"Que quiere hacer?", "Centro de recuperarión", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,botonsdous,botonsdous[0]);
       switch(recu){
           case 0:  
               Mensaje.clear();interrupt();correo();
               break;
               case 1:correo();
               break;
               case 2:interrupt();
               break;
       }
    }
   
  
    public synchronized void ler(){
      
        
            if(Mensaje.size()<=1){
           
            for(int i=0;i<Mensaje.size();i++){
               JOptionPane.showMessageDialog(null,Mensaje.get(i));
            }
       correo();}else{
                error();
            }
        }
   
   
    
    @Override
    public void run(){
       JOptionPane.showMessageDialog(null,"Benvido ao teu correo\n ");
       correo();
          
          
    }
    
}
