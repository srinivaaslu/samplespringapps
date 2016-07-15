package com.test;

import java.util.concurrent.TimeUnit;

/**
 * Created by 205025 on 6/26/2016.
 */
public class ThreadStopExample {
private static volatile boolean stopRequest;
    private static synchronized void stopRequest(){
        stopRequest=true;
    }
    private static synchronized boolean getStopRequest(){
        return stopRequest;
    }
    public static void main(String []args) throws InterruptedException {

        Thread threadStopExample = new Thread(new Runnable() {
            @Override
            public void run() {
                int i =1;
              while(!getStopRequest()){

                  System.out.println("value increased--"+i++);
              }
            }
        });
        threadStopExample.start();
        TimeUnit.NANOSECONDS.sleep(1);
        stopRequest();
    }

}
