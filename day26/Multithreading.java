import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public void singleTask() {
        //scheduler with a single threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Task executed at: " + System.currentTimeMillis() + " :3");
        };

        scheduler.scheduleAtFixedRate(task, 1, 5, TimeUnit.SECONDS);

        try {
            //task runs for 20s before thread sleeps
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();

    }

public void multipleRateTasks() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task1 executed at: " + System.currentTimeMillis() + " :3");
        };

        Runnable task2 = () -> {
            System.out.println("Task2 executed at: " + System.currentTimeMillis() + " :o");
        };

        scheduler.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(task2, 1, 2, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }

public void multipleDelayTasks() {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task1 executed at: " + System.currentTimeMillis() + " :3");
        };

        Runnable task2 = () -> {
            System.out.println("Task2 executed at: " + System.currentTimeMillis() + " :o");
        };

        scheduler.scheduleWithFixedDelay(task1, 0, 5, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(task2, 1, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }
