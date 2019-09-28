package com.lwj.java1;




import org.junit.Test;

import java.util.Comparator;
import java.util.concurrent.*;

public class LambdaTest {

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                5,
                1L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        try {
            for (int i = 0; i < 10; i++) {
                //    threadPoolExecutor.execute(()-> System.out.println("11111111111111"));
                threadPoolExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName()+"执行");
                    }
                });
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            threadPoolExecutor.shutdown();
        }


        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test01(){
   /*     Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱");
            }
        };

        runnable.run();
        System.out.println("------------------------------------");

        Runnable runnable1 = ()-> System.out.println("我爱嘿嘿嘿") ;
        runnable1.run();

        Comparator<Integer> comparator = (o1,o2) -> Integer.compare(o1,o2) ;*/

       // Executors.newCachedThreadPool()




    }




}
