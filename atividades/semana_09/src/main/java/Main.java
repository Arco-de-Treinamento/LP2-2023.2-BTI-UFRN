import br.ufrn.imd.Consumer;
import br.ufrn.imd.Producer;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Informe o numero de Treads");
            return;
        }

        int threads = Integer.parseInt(args[0]);
        int totalCapacity = 100;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(totalCapacity);

        ExecutorService executorService = Executors.newFixedThreadPool(threads * 2);

        for (int i = 0; i < threads; i++) {
            executorService.submit(new Producer(queue, totalCapacity));
            executorService.submit(new Consumer(queue, totalCapacity));
        }

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
