package cn.xrx.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/7/25 13:09
 */
@Slf4j
public class CountdownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        final int totalTread = 10;
        CountDownLatch countdownLatch  = new CountDownLatch(totalTread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalTread; i++) {
            executorService.execute(() -> {
                System.out.print("run...");
                countdownLatch.countDown();
            });
        }
        countdownLatch.await();
        // System.out.println("end");
       log.info("end");
        executorService.shutdown();
    }


}
