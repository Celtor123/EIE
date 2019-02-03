package exercicios.exercicio6;

import javax.swing.JOptionPane;

public class Principal{ 
Clientes d;
Thread principal = new Thread();
 double caixa=50;
    public Principal() {
    }
       
   
    public void caixa(){
        System.out.println("Hay "+caixa+"€ na caixa");
    }
    public synchronized void poñer(){       
       double r=Double.parseDouble(JOptionPane.showInputDialog(null,"Poña os euros para ingresar"));
       caixa=caixa+r;
               }
    public synchronized void extraer(){
       double extracciones=Double.parseDouble(JOptionPane.showInputDialog(null,"Poña a inversión a prveedores"));
       caixa=caixa-extracciones;     
    }

      
    
    public static void main(String[] args) {
      Principal a= new Principal();
      Clientes h= new Clientes(a);
      Proveedor r= new Proveedor(a);
            Thread x=new Thread(h);
            Thread q= new Thread(r);
      x.start();
      r.start();
    
    }      
}

//Simular a caixa dunha empresa con dous fíos. 
//Un simulará o ingreso, ca compra de artigos por parte de clientes e 
//o outro a extracción de cartos da caixa co pago a proveedores. 
//A conta terá un capital inicial. Realizar 10 ingresos e 5 extraccións