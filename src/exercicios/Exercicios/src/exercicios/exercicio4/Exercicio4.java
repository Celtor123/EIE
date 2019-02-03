
package exercicios.exercicio4;

public class Exercicio4 extends Thread {  
int cual =1;
public Exercicio4() {   
super();
}  
public void x(){
     for(cual=1;cual<1000;cual=cual+2){
       System.out.println(cual);
   }cual=2;
}
public void y(){
    for(cual=2;cual<=1000;cual=cual+2){
        System.out.println(cual);
    }cual=0;
}
public void z(){
    int dos=0;
   while(cual<=1000){
       if(cual%10==2){
           System.out.println(cual);
           dos++;
       }
       else if(cual%10==3){
           System.out.println(cual);
           dos++;
       }cual++;
   }System.out.println(dos);
   cual=1;
}
@Override
public void run() { 
    if(cual==1){
  x();
   System.out.println(cual);
    }
     if(cual==2){
  y();
   System.out.println(cual);
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
 
 