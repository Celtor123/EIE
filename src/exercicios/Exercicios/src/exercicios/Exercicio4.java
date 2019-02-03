
package exercicios;

public class Exercicio4 extends Thread {  
int cual =1;
public Exercicio4() {   
super();
}  
public void x(){
    int impares=0;
     for(cual=1;cual<1000;cual=cual+2){
         impares++;
   }cual=2;
    System.out.println("impares. "+impares);
}
public void y(){
    int pares=0;
    for(cual=2;cual<=1000;cual=cual+2){
        pares++;
    }cual=0;
    System.out.println("pares: "+pares);
}
public void z(){
    int dostres=0;
   while(cual<=1000){
       if(cual%10==2){
           dostres++;
       }
       else if(cual%10==3){
           dostres++;
       }cual++;
   }System.out.println("Cantidad de números acabdos en 2 y 3: "+dostres);
   cual=1;
}
@Override
public void run() { 
     if(cual==1){
  x();
    }
     if(cual==2){
  y();
    }
     if (cual==0){
        z();
     }
}
public static void main(String[] args) {
    Exercicio4 a= new Exercicio4();
    a.start();
   
}

}
 

    
    
    


// Realiza un programa en java que execute tres fíos de forma concurrente. 
//Un de eles debe sumar os números pares del 1 ao 1000, outro os impares, e outro, os que terminen en dous ou en tres. 
 
 