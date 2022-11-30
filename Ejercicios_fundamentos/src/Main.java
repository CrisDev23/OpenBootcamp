public class Main {
    public static void main(String[] args) {
        System.out.println(suma(2,6,9));
        Coche cocheSedan = new Coche();
        System.out.println(cocheSedan.incrementador(1));
    }

    public static int suma(int a, int b, int c){
        int total = a + b + c;
        return  total;
    }


}