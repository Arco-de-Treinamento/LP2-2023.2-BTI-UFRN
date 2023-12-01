package br.ufrn.imd;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;
    private int totalCapacity = 0;

    public Producer(BlockingQueue<Integer> queue, int totalCapacity){
        this.queue = queue;
        this.totalCapacity = totalCapacity;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalCapacity; i++) {
            try {
                Random randomInterger = new Random();
                queue.put(randomInterger.nextInt(1000));

                Random randomInterval = new Random();
                Thread.sleep(randomInterval.nextInt(200, 801));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
