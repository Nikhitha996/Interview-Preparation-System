import java.util.Scanner;

public class InterviewPreparationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== INTERVIEW PREPARATION SYSTEM =====");

        // Login System
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login Credentials");
            return;
        }

        System.out.println("\nLogin Successful!");
        System.out.println("Quiz Started...\n");

        int score = 0;

        // Questions
        String[] questions = {
                "1. Which language is platform independent?",
                "2. Which keyword is used for inheritance in Java?",
                "3. Which data structure uses FIFO?",
                "4. Which company developed Java?",
                "5. What is the extension of Java bytecode file?"
        };

        String[][] options = {
                {"A. C", "B. Java", "C. Python", "D. C++"},
                {"A. extends", "B. implement", "C. inherit", "D. super"},
                {"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
                {"A. Microsoft", "B. Google", "C. Sun Microsystems", "D. Apple"},
                {"A. .java", "B. .class", "C. .js", "D. .exe"}
        };

        char[] answers = {'B', 'A', 'B', 'C', 'B'};

        // Quiz Logic
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter Answer: ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!\n");
                score++;
            } else {
                System.out.println("Wrong Answer!\n");
            }
        }

        // Result
        System.out.println("===== QUIZ COMPLETED =====");
        System.out.println("Total Score: " + score + "/" + questions.length);

        if (score >= 4) {
            System.out.println("Excellent Performance!");
        } else if (score >= 2) {
            System.out.println("Good Try!");
        } else {
            System.out.println("Need More Practice!");
        }

        sc.close();
    }
}