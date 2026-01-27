import java.util.*;

// ISC Class 11 Computer Science
// Program: Mix
// This program combines two words alternately
// If the words are of unequal length, the remaining letters of the longer word are appended

class Mix {
    String wrd;       // Stores the word (original or mixed)
    int len;          // Length of the word
    Scanner Sc = new Scanner(System.in); // Scanner for input

    // Constructor
    Mix() {
        wrd = "";
        len = 0;
    }

    // Accept a word from user and convert to uppercase
    void feedword() {
        System.out.print("Enter a word: ");
        wrd = Sc.next().toUpperCase();
        len = wrd.length();
    }

    // Mix two words alternately and store result in this object
    void mixword(Mix P, Mix Q) {
        int l = Math.min(P.len, Q.len); // Determine smaller length
        for (int i = 0; i < l; i++) {
            wrd = wrd + P.wrd.charAt(i) + Q.wrd.charAt(i); // Alternate characters
        }

        // Append remaining characters of longer word
        if (P.len > Q.len)
            wrd = wrd + P.wrd.substring(l);
        else if (P.len < Q.len)
            wrd = wrd + Q.wrd.substring(l);
    }

    // Display the word
    void display() {
        System.out.println(wrd);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Mix m1 = new Mix(); // First word
        Mix m2 = new Mix(); // Second word
        Mix m3 = new Mix(); // Mixed word

        // Accept words from user
        m1.feedword();
        m2.feedword();

        // Mix the two words
        m3.mixword(m1, m2);

        // Display all words
        System.out.print("Word 1: ");
        m1.display();
        System.out.print("Word 2: ");
        m2.display();
        System.out.print("Mixed: ");
        m3.display();
    }
}
