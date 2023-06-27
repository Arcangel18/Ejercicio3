public class Car {
    static int puertas=0;
    public static void main(String[] args) throws Exception {
        
        Car miCoche = new Car();
        miCoche.sumarpuertas();
        System.out.println("las puertas que tienes son");
        System.out.println(puertas);

    }

    void sumarpuertas(){
        puertas++;
    } 
}

