import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Math Quiz");
            System.out.println("This quiz has 3 questions");

            Option option1 = new Option("a", "5");
            Option option2 = new Option("b", "4");
            Option option3 = new Option("a", "4");
            Option option4 = new Option("b", "7");
            Option option5 = new Option("a", "2^2");
            Option option6 = new Option("b", "-2^2");
            Option option7 = new Option("c", "1+3");
            Option option8 = new Option("d", "4^1");


            Question question1 = new Question(
                    1,
                    "What is 2 + 2?",
                    "Question with single answer");

            Question question2 = new Question(
                    2,
                    "What is 5 + 2?",
                    "Question with single answer");

            Question question3 = new Question(
                    3,
                    "4 = ?",
                    "Question with multiple answer");


            question1.addOption(option1);
            question1.addOption(option2);
            question2.addOption(option3);
            question2.addOption(option4);
            question3.addOption(option5);
            question3.addOption(option6);
            question3.addOption(option7);
            question3.addOption(option8);

            int correctAnswer = 0;

            question1.printQuestion();
            String userAnswer1 = scanner.nextLine();
            if(userAnswer1.contains("b")){
                correctAnswer++;
            }

            question2.printQuestion();
            String userAnswer2 = scanner.nextLine();
            if(userAnswer2.contains("b")){
                correctAnswer++;
            }

            question3.printQuestion();
            String userAnswer3 = scanner.nextLine();
            if(userAnswer3.contains("abcd")){
                correctAnswer++;
            }

            System.out.println("You had " + correctAnswer + "/3 answers correct");
            return;


        }



    }


}