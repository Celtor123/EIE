package exercicios.exercicio9;

public class Edificio {
    int posicion;

    public Edificio(int posicion) {
        this.posicion=posicion;
    }
    public synchronized void e(){
        
    }
 
    public static void main(String[] args) {      
        Edificio Ana= new Edificio(-10);
        Edificio Jorge = new Edificio(4);
        Ascensor t= new Ascensor(Ana);
        Ascensor y= new Ascensor(Jorge);
        Thread hilo= new Thread(t);
        Thread hilo2= new Thread(y);
        hilo.start();
        hilo2.start();
    }
    
}

//Desenvolve un programa empregando fíos que simule o comportamento dun ascensor nun 
//edificio de 20 plantas. Cando alguén chama o ascensor desde un piso, irá a ese piso cando 
//poda (se está parado, vai nese intre, se está en marcha, só poderá ir cando teña rematado o 
//seu percorrido, xa sexa de subida ou de baixada). Para poder controlar este movemento, 
//precisamos coñecer cal é o piso no que se atopa o ascensor. 