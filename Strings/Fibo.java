import java.util.*;

// ISC Class 11 Computer Science
// Program: Fibonacci for Alphabets
// This program accepts two initial strings and generates
// n terms of a Fibonacci-like sequence for strings.

class Fibo {
    int n;           // Number of terms to generate
    String S0, S1;   // First two terms
    String s = "";   // Stores the generated sequence
    Scanner Sc = new Scanner(System.in);

    // Accept input from user
    void accept() {
        System.out.print("Enter first string: ");
        S0 = Sc.nextLine();
        System.out.print("Enter second string: ");
        S1 = Sc.nextLine();
        System.out.print("Enter number of terms: ");
        n = Sc.nextInt();
    }

    // Generate Fibonacci-like sequence for strings
    void generate() {
        for (int i = 1; i <= n; i++) {
            s = s + S0 + " ";           // Add current term to result
            String S2 = S1 + S0;        // Next term = S1 + S0
            S0 = S1;                     // Shift terms
            S1 = S2;
        }
    }

    // Display the generated sequence
    void display() {
        System.out.println("Fibonacci sequence of strings:");
        System.out.println(s);
    }

    // Main method
    public static void main(String[] args) {
        Fibo f = new Fibo();
        f.accept();
        f.generate();
        f.display();
    }
}
