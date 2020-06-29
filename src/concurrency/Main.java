package concurrency;


public class Main {

    static Thread mainThread = Thread.currentThread();

    public static void main(String[] args) {
        Reasoning reason = new Reasoning();
        reason.start();
         //run all of your threads from this main class.

        TeamTC1 tc1 = new TeamTC1();
        Thread tc1Thread = new Thread(tc1);
        tc1Thread.start();
    }
}