//Author: Ana Victoria Gomes Mantovani
//Date: 05/03/2023
//Project: Synchronize threads
//Description: Launch 1000 threads and display the sum with synchronization

import java.util.ArrayList;
import java.util.List;

public class WithSynchronization {
	public static void main(String[] args) throws InterruptedException {
        final int numThreads = 1000;
        final IntegerWrapper sum = new IntegerWrapper(0);
        List<Thread> threads = new ArrayList<>();

        //Create 1000 threads that increment the shared variable sum
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> {
                // Synchronize access to sum to ensure atomic updates
                synchronized (sum) {
                    sum.increment();
                }
            });
            threads.add(thread);
        }

        //Start all the threads
        for (Thread thread : threads) {
            thread.start();
        }

        //Wait for all the threads to finish before printing the final sum
        for (Thread thread : threads) {
            thread.join();
        }

        //Print the final value of sum
        System.out.println("Final value of sum: " + sum.getValue());
    }

    static class IntegerWrapper {
        private int value;

        public IntegerWrapper(int value) {
            this.value = value;
        }

        //Synchronized getter method to ensure thread-safe access to the value of the shared variable
        public synchronized int getValue() {
            return value;
        }

        //Synchronized setter method to ensure thread-safe updates to the value of the shared variable
        public synchronized void setValue(int value) {
            this.value = value;
        }

        //Synchronized increment method to ensure thread-safe updates to the value of the shared variable
        public synchronized void increment() {
            value++;
        }
    }
}
