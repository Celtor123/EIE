package exercicios.exercicio6;

public class Proveedor extends Thread{
    Principal e;
 public Proveedor(Principal e) {
        this.e = e;  
    }
    
    @Override
    public void run(){
        e.caixa();
        for(int bucle=0;bucle<5;bucle++){  
       e.extraer();
    }e.caixa();
    }

   
}
