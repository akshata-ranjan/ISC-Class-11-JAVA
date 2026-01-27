import java.util.*;

// ISC Class 11 Computer Science
// Program: Magic
// This program accepts a line of words and counts how many times each word (magic word) occurs
// Only words containing consecutive letters are counted
// Duplicate words are skipped

class Magic {
    String wrd;               // Stores the input line
    Scanner Sc = new Scanner(System.in); // Scanner for input

    // Accept input from user and convert to uppercase
    void accept() {
        System.out.print("Enter words: ");
        wrd = Sc.nextLine().toUpperCase();
    }

    // Check if a word contains consecutive letters
    boolean cons(String a) {
        for (int i = 0; i < a.length() - 1; i++)
            if (a.charAt(i) + 1 == a.charAt(i + 1))
                return true;
        return false;
    }

    public static void main(String args[]) {
        Magic m = new Magic();
        m.accept();

        String s[] = m.wrd.split(" "); // Split input into words

        for (int i = 0; i < s.length; i++) {

            // Skip word if it has already appeared
            int k;
            for (k = 0; k < i; k++)
                if (s[i].equals(s[k]))
                    break;
            if (k != i) continue;

            int n = 0;
            if (m.cons(s[i])) { // Only count words with consecutive letters
                for (int j = i; j < s.length; j++)
                    if (s[i].equals(s[j]))
                        n++;
                System.out.println(s[i] + " : " + n); // Print word and count
            }
        }
    }
}
