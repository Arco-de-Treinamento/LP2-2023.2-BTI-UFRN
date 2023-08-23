public class Main {
    public static void main(String args[]){
        double a1 = Double.parseDouble(args[0]);
        double b1 = Double.parseDouble(args[1]);
        double a2 = Double.parseDouble(args[2]);
        double b2 = Double.parseDouble(args[3]);

        double distancia = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));

        System.out.println("Resultado: " + distancia); 
    }
}