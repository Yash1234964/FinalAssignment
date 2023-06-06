package pr.project.Main;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 10;

        Thread producerThread = new Thread(new Producer(queue, maxSize));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize) {
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int number = random.nextInt(100);
                queue.add(number);
                System.out.println("Produced: " + number);

                queue.notifyAll();
            }
        }
    }
}

class Consumer implements Runnable {
    private Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int sum = 0;
                while (!queue.isEmpty()) {
                    int number = queue.poll();
                    sum += number;
                }

                System.out.println("Consumed: Sum = " + sum);

                queue.notifyAll();
            }
        }
    }
}


