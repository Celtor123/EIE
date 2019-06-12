
package exercicios;

/**
 *
 * @author Celso
 */
public class Exercicio8 extends Thread{
    
    String animal;
    public Exercicio8(String animal) {
        this.animal=animal;
        this.start();
    }
    
    @Override
    public void run(){
        int casiña = 1;
        String g = null;
         boolean f;
         while(casiña<70){
             int valorentero = (int) Math.floor(Math.random()*(100-1+1)+1);
        if("Lebre".equals(animal)){
            g="l";
        if(valorentero<20){//dorme
            System.out.println("dorme");
        }
        if(valorentero>=20 && valorentero<40){//gran salto
            casiña=casiña+9;
        }
        if(valorentero>=40&&valorentero<50){//esvaron
            casiña=casiña-12;
        }
        if(valorentero>=50&&valorentero<80){//pequeno salto
            casiña=casiña+1;
        }
        if(valorentero>=80){ // esvarón pequeno
            casiña=casiña-2;
        }
        
        }
        if("Tartaruga".equals(animal)){
            g="t";
        if(valorentero<50){
            casiña=casiña+3;
        }
        if(valorentero>=50&&valorentero<70){
            casiña=casiña-6;
        }
        if(valorentero<70&&valorentero<=100){
            casiña=casiña+1;
        }}
        if(casiña<1){
            casiña=1;
        }
             System.out.println(casiña+g); 
         }
             switch(g){
                
             case "l":
                  if(f=true){
             System.out.println("Ganadora a lebre");
             f=false;
                  }else{System.out.println("Perde a lebre");}
             break;
             case "t":
             if(f=true){
                 System.out.println("Ganadora a Tartaruga"); 
                 f=false;
                  }else{System.out.println("Perde a tartaruga");             
                  }
                     break; 
         }
    }
    public static void main(String[] args) {   
        Exercicio8 a= new Exercicio8("Lebre");
        Exercicio8 b= new Exercicio8("Tartaruga");
}}

//Implementa unha simulación da fabula que conta a carreira entre a lebre e a tartaruga. 
//Para facelo máis interesante a carreira será costa arriba por unha pista esvaradía, de modo 
//que ás veces poderán escorregar e retroceder algunhas posicións. Haberá un thread que 
//implementará a tartaruga e outro a lebre. Cada un suspenderase durante un segundo e 
//logo avaliará o que pasou segundo unhas probabilidades: 




//Calcule a probabilidade con random, de 1 a 100 e determine co devandito número que fixo 
// cada animal. Considere que hai 70 casiñas, da 1 á 70, a 1 de saída e a 70 de chegada. 
//Se escorrega ao principio volve á 1, nunca por baixo. Tras cada segundo e 
//despois de calcular a súa nova posición imprima unha liña por cada animal, ca posición e logo 
//unha letra T para a tartaruga e unha L para a lebre. Imprima ao 
//comeza da carreira unha mensaxe. Despois de imprimir as liñas determine se algún chegou 
// a meta e gañou, imprimindo unha mensaxe. Se ambos chegan á vez declare un 
//empate.