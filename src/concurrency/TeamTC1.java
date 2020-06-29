package concurrency;
import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable {

    List<String> team = new ArrayList<>();

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Dylan Fellows");
            team.add("Dylan Fellows");
            Thread.sleep(1000);
            System.out.println("Jeramie Andrews");
            team.add("Jeramie Andrews");
            Thread.sleep(1000);
            System.out.println("Victor Betts");
            team.add("Victor Betts");
            Thread.sleep(1000);
            System.out.println("Sabitha Radhakrishnan");
            team.add("Sabitha Radhakrishnan");
            Thread.sleep(1000);
            System.out.println("Jessica Ulysse");
            team.add("Jessica Ulysse");
            Thread.sleep(1000);
            System.out.println("Matthew Castiglione");
            team.add("Matthew Castiglione");
            Thread.sleep(1000);
            System.out.println("Vani Muppuru");
            team.add("Vani Muppuru");
            Thread.sleep(1000);
            System.out.println("Kevin Ibanez");
            team.add("Kevin Ibanez");
            Thread.sleep(1000);
            System.out.println("Nancy Golden");
            team.add("Nancy Golden");
            Thread.sleep(1000);
            System.out.println("Vimala Murthy");
            team.add("Vimala Murthy");
            Thread.sleep(1000);
            System.out.println("John Kol");
            team.add("John Kol");
            Thread.sleep(1000);
            System.out.println("George Torres");
            team.add("George Torres");
            Thread.sleep(1000);
            System.out.println("Norita Sieffert");
            team.add("Norita Sieffert");
            System.out.println(team.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//This thread should be created by implementing the Runnable interface,
// NOT by extending the Thread class.  In the run method of this thread, print out the
// name of each student in your TA group,
// (starting with your TA).
// There should be a pause of 1 second before each name is printed to the console.
// The name should then be pushed to the team List
// After all the names have been pushed to this List,
// print out the entire list of all the students in your TA group. Don't forget your TA as well!
// All of these steps should be done whenever the thread is started.
// (i.e. it can be done directly in the run()method of the thread itself).
// Kick off the thread in the Main class of the concurrency package.