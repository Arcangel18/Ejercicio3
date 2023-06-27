import java.util.Scanner;


public class Codicionales{
      
    public static void main(String[] args) {

      
        int numero;
        Scanner s =new Scanner(System.in);

        System.out.println("Cual sera su numero a Procesar");
        numero=s.nextInt();
        if(numero>0){
            System.out.println("El numero es positivo");
        }
        else if(numero==0){
            System.out.println("El numero es igual a 0");
        }
        else if(numero<0){
            System.out.println("El numero es negativo");
        }


        int numeroWhile=0;
        while (numeroWhile<3) {
            System.out.println("El numero del ciclo while es ");
            System.out.println(numeroWhile);
            numeroWhile++;
            
        }

        int numeroWhile2=0;
        do {
            System.out.println("El numero del ciclo doWhile es ");
            System.out.println(numeroWhile2);
            numeroWhile2++;
        } while (numeroWhile2<1);


        int numeroFor=0;
        for (numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println("El numero del ciclo FOR es ");
            System.out.println(numeroFor);
                
            
        }

        int estacion;

        System.out.println("Introduzca un numero para saber la estacion:");
        estacion=s.nextInt();
        switch (estacion) {
            case 1:
                System.out.println("Primavera");
                
                break;
            case 2:
                System.out.println("Otoño");
                break;
            case 3:
                System.out.println("Invierno");
                break;
            case 4:
                System.out.println("Verano");
                break;
            
            default:
                System.out.println("Lo siento no hay estacion");
                break;
        }

    }
}