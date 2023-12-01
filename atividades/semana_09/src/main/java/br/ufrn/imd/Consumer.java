package br.ufrn.imd;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Integer> queue;
    private int totalCapacity = 0;

    public Consumer(BlockingQueue<Integer> queue, int totalCapacity){
        this.queue = queue;
        this.totalCapacity = totalCapacity;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalCapacity; i++) {
            try {
                Integer value = queue.take();
                System.out.println("Produzido: " + value + " | Dobro: " + (value * 2));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
