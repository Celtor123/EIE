
package exercicios;


public class Exercicio5 extends Thread {
        
    private final int numero;
   
     public Exercicio5(int numero) {
         this.numero=numero;
         setName(""+numero);
    }
    
    
 @Override
    public void run(){
        try {
            Thread.sleep(500);
            System.out.println("Hola, son o fío número"+getName());
        } catch (InterruptedException ex) {
            System.out.println("Error: "+ex);
        }                     
    }
    
    public static void main(String[] args) {
        Exercicio5 a= new Exercicio5(1);
       Exercicio5 b= new Exercicio5(2);
       a.setPriority(MIN_PRIORITY);
       b.setPriority(MAX_PRIORITY);
        b.start();               
//        try {
//            b.join();
//        } catch (InterruptedException ex) {
//            System.out.println("Error"+ex);
//        }
       a.start();     
    }}

//Escribe unha clase que cree dous fíos e force que a escritura do segundo sexa sempre anterior á escritura por pantalla do primeiro.     
//Exemplo de ejecución:     
//Ola, son o fío número 2   
//Ola, son o fío número 1  
// 
//a) faino con join b )faino con prioridades 
 