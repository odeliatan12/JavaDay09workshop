package Multithreadingtemplate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading implements Runnable {
  private String name;

  public Multithreading(String name) {
    this.name = name;
  }

  public void run() {
    // task code goes here
    System.out.println("Running task " + name);
  }

  public static void main(String[] args) {
    // create a fixed-size thread pool with 3 threads
    ExecutorService executor = Executors.newFixedThreadPool(3);

    // submit 10 tasks for execution
    for (int i = 0; i < 10; i++) {
      executor.submit(new Multithreading("Task" + i));
    }

    // shut down the executor
    executor.shutdown();
  }
}

