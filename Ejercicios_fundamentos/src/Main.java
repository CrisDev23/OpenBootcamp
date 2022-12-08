public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        int numero = -3;
        if (numero > 0) {
            System.out.println("Es Positivo");
        } else {
            System.out.println("Es Negativo");
        };
        System.out.println("----");
        // Ejercicio 2

        int contador = 3;
        while (numero < contador) {
            System.out.println(numero);
            numero++;
        };
        // Ejercicio 3

        int num = 2;
        int cont1 = 3;

        do {
            System.out.println("----");
            System.out.println(num);
            num++;
        } while (num > cont1);

        System.out.println("----");

        // Ejercicio 4
        int numeroFor = 0;
        for(int i = 0; i <= 3; i++){
            numeroFor += 1;
            System.out.println(numeroFor);

        };
        System.out.println("---");



        // Ejercicio 5

        String estacion = "verano";

        switch(estacion){

            case "primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "verano":
                System.out.println("Estamos en Verano");
                break;
            case "otoño" :
                System.out.println("Estamos en Otoño");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("no existe " + estacion);
        };
    }

}