package com.example.template;

import org.slf4j.MDC;

public class MDCTest extends Thread {
    private int i;

    public MDCTest() {
    }

    public MDCTest(int i) {
        this.i = i;
    }

    public void run() {
        System.out.println(++i);
        MDC.put("username", i +"");

        for (int j = 0; j < 100; j++) {
            System.out.println("aaa" + i);
            if (j == 10) {
                try {
                    this.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("run: " + i + "     " + MDC.get("username"));
    }

    public static void main(String args[]) throws InterruptedException {
        MDCTest t1 = new MDCTest(1);
        t1.start();
        MDCTest t2 = new MDCTest(2);
        t2.start();
    }
}
