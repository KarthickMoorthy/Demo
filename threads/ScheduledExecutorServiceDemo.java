package threads;

import java.util.concurrent.*;
import java.util.function.Function;

public class ScheduledExecutorServiceDemo {

    private void execute() {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        getTasksToRun().apply(executorService);
        executorService.shutdown();
    }

    private void executeWithMultiThread() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        getTasksToRun().apply(executorService);
        executorService.shutdown();
    }

    private Function<ScheduledExecutorService, String> getTasksToRun() {
        return (executorService -> {
            ScheduledFuture<?> scheduledFuture1 = executorService.schedule(() -> {
                // Task
                return "Text";
            }, 3, TimeUnit.SECONDS);

            ScheduledFuture<?> scheduledFuture2 = executorService.scheduleAtFixedRate(() -> {
                // Task

            }, 1, 10, TimeUnit.SECONDS);

            ScheduledFuture<?> scheduledFuture3 = executorService.scheduleWithFixedDelay(() -> {
                // Task
            }, 1, 10, TimeUnit.SECONDS);

            ScheduledFuture<String> scheduledFuture4 = executorService.schedule(() -> {
                // Task
                return "Hellow world";
            }, 1, TimeUnit.SECONDS);

            try {
                if(scheduledFuture4.isDone()){
                    String value = scheduledFuture4.get();
                    System.out.println("value = " + value);
                }

                String text = (String) scheduledFuture1.get();
                System.out.println("text = " + text);

            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }
            return null;
        });
    }

    public static void main(String... args) {
        ScheduledExecutorServiceDemo demo = new ScheduledExecutorServiceDemo();
        demo.execute();
        demo.executeWithMultiThread();
    }
}
