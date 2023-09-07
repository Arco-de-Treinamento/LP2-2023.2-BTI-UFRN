public class Primos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Você deve passar um parâmetro.");
            System.exit(0);
        }

        int qnt = Integer.parseInt(args[0]); //Converte para número a entrada

        if (qnt <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            System.exit(0);
        }

        int[] primos = new int[qnt];
        primos[0] = 2;

        int count = 1;
        int num = 3;

        while (count < qnt) {
            boolean isPrimo = true;

            for (int j = 0; j < count; j++) {
                if (num % primos[j] == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        for (int primo : primos) {
            System.out.println(primo);
        }

    }

}
