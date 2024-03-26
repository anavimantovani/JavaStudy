//Author: Ana Victoria Gomes Mantovani
//Date: 05/03/2023
//Project: Synchronize threads
//Description: Launch 1000 threads and display the sum without synchronization

import java.util.ArrayList;
import java.util.List;

public class WithoutSynchronization {

	    public static void main(String[] args) throws InterruptedException {
	        final int numThreads = 1000;
	        final IntegerWrapper sum = new IntegerWrapper(0);
	        List<Thread> threads = new ArrayList<>();

	        //Create 1000 threads that increment the shared variable sum
	        for (int i = 0; i < numThreads; i++) {
	            Thread thread = new Thread(() -> {
	                sum.increment();
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

	        //Constructor that initializes the value of the shared variable
	        public IntegerWrapper(int value) {
	            this.value = value;
	        }

	        //Getter method to access the value of the shared variable
	        public int getValue() {
	            return value;
	        }

	        //Setter method to set the value of the shared variable
	        public void setValue(int value) {
	            this.value = value;
	        }

	        //Method that increments the value of the shared variable
	        public void increment() {
	            value++;
	        }
	    }
	}
