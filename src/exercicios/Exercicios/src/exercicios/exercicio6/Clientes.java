
package exercicios.exercicio6;

public class Clientes extends Thread{
    Principal e;

    public Clientes(Principal e) {
        this.e = e;
    }

    @Override
    public void run(){
        e.caixa();
        for(int i=0;i<10;i++){
        e.poñer();
        }
        e.caixa();
    }
} 

