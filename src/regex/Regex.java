package regex;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

class Regex {

    public static void main(String[] args) {

        // 1. What does the following pattern match? (\d){36} explain in a println() statement.

        System.out.println("The following pattern ('\\d'){36} matches : the first slash is an escape indicator. The second slash with the \nsmall d is looking for all numbers in a given string. And the brackets 36 says it will be matched exactly 36 times");


        // 2. Create a new array of the first names of the TEKmentors.  Use Regex to only grab the first name of every TEKmentor.  Push the values to a new array
        String[] tekMentors;
        //Can not get this to work. I have tried converting to string and a hundred other things. Just don't know.
        String[] TEKmentors = {"Amir Yunas", "Mark Bennet", "Rosa Garcia", "Desaree Byers", "Abram Jablonski", "Dylan Fellows", "Emilios Papas", "Jonathan Diamond"};
        ArrayList<String> matches = new ArrayList<String>();
        Pattern p = Pattern.compile("\\s\\w+");
        for (String s : TEKmentors) {
            if (p.matcher(s).matches()) {
                matches.add(s);
            }
        }
        System.out.println("First names: " + matches.toString());


        StringBuffer sb = new StringBuffer();
        for (String s : TEKmentors) {
            sb.append(s);
            sb.append(" ");
        }
        String newTEK = sb.toString();
        System.out.println("New TEK = : " + newTEK);
        for (final String item : newTEK.replaceAll("Yunas", "").split("\",\"")) {
        }
        System.out.println("First Names: " + newTEK);


        // 3. Find all the occurences of any form of 'book' in the following paragraph.
        // use regex to match the occurences and store the count of books in an int.

        String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";
        System.out.println(bookText);
        String bookPattern = "book";
        Pattern pattern = Pattern.compile(bookPattern);
        Matcher matcher = pattern.matcher(bookText);
        int bookCount = 0;
        while (matcher.find()) {
            bookCount++;
            System.out.println("Book count = " + bookCount);

        }

        // 4.a Create an array of all the words besides the word 'sleepy'.
        // Each word does not have to be a separate element, although you can split it that way if you wish.
        // We just want an array that everything that is not 'sleepy'.

        String sleepy = "I felt sleepy because I saw the others were sleepy and because I knew I should feel sleepy, but I wasn't really sleepy.  If you're sleepy and you know it, clap your hands.  Keep on being sleepy until you actually become sleepy";
        List<String> newSleepy = new ArrayList();
        for (final String item : sleepy.replaceAll("sleepy", "").split("\",\"")) {
            newSleepy.add(item);
        }
        for (final String item : newSleepy) {
            System.out.println("The new sleepy: " + newSleepy);
        }

        // 4.b combine the array that you just created into a string
        String not_sleepy; //punctuation marks will be here
        final List<String> notSleepy = newSleepy;
        StringBuffer sb1 = new StringBuffer();
        for (String s : notSleepy) {
            sb1.append(s);
            sb1.append(" ");
        }
        String strNotSleepy = sb1.toString();
        System.out.println("notSleepy = : " + strNotSleepy);

        //4.c remove the punctuation marks from the notSleepy string.
        String notSleepyNone = strNotSleepy;
        System.out.println("No punctuation = " + notSleepyNone.replaceAll("[,.']", ""));

        //no punctuation marks should be here.

        //4.d Now replace all the occurences of 'sleepy' with the word 'happy'.  Call the new string happy.  

        String happy = sleepy;
        System.out.println("New String happy = " + happy.replaceAll("sleepy", "happy"));

        System.out.println("Also attempted the bonus but failed. Can't figure out the array thing. However, \\u26\\w+ would have worked.");
    }

    //BONUS :  ******** attempted and failed. But \\u26\w+ would work if I could figure out the array part.
    //5. You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF
// is a selection of unicode arrow symbols to aid you in your search.
// Match all the codes that are arrows, and then print them out to the console.
// They should be printing out as the arrow images.

//    String[] arrows = {"\u21FD", "\u26F7", "\u21FF", "\u21EF", "\u21EC", "\u26F9", "\u26FD", "\u26D4", "\u26A5", "\u21FD", "\u2190", "\u26A1", "\u21BA", "\u2196", "\u2603", "\u21FD"};
//    ArrayList<String> matches1 = new ArrayList<String>();
//    Pattern p1 = Pattern.compile("\\u26\\w+");
//        for(String s1 : arrows)    {
//        if (p1.matcher(s1).matches()) {
//            matches1.add(s1);
//        }
//        System.out.println("arrows: " + matches1.toString());
//        //final String sleepy = "[\"text1\",\"text2\",\"text3\"]";
        //final String input = "[\"text1\",\"text2\",\"text3\"]";
        // final List<String> newSleepy = new ArrayList<>();
        //  final List<String> output = new ArrayList<>();
        // for(final String item : sleepy.replaceAll("^\\[\"|\"\\]$", "").split("\",\"")) {
        // for(final String item : input.replaceAll("^\\[\"|\"\\]$", "").split("\",\"")) {
        // newSleepy.add(item);
        // output.add(item);
        //}
        //for(final String item : newSleepy) {
        //for(final String item : output) {
        // System.out.println(item);
        //}
        //}
    }