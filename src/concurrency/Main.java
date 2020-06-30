package concurrency;

public class Main {

    public static void main(String[] args) {
        Reasoning reason = new Reasoning();
        reason.start();
        //run all of your threads from this main class.

        TeamTC1 tc1 = new TeamTC1(" -- Team Semicolon");
        Thread tc1Thread = new Thread(tc1);
        tc1Thread.start();

        //sync

        Sync syncThread = new Sync("sync thread");
        Sync syncThread1 = new Sync("sync thread1");
        Sync syncThread2 = new Sync("sync thread2");
        Sync syncThread3 = new Sync("sync thread3");
        Sync syncThread4 = new Sync("sync thread4");

        syncThread.start();
        syncThread1.start();
        syncThread2.start();
        syncThread3.start();
        syncThread4.start();

        try {
            syncThread.join();
            syncThread1.join();
            syncThread2.join();
            syncThread3.join();
            syncThread4.join();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}