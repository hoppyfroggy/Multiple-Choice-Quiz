package multiplechoicequiztang;

import java.util.Scanner;

public class MultipleChoiceQuizTang {

    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);
        
        //declaring and initializing the varaibles
        final String QUESTION1 = "1. What's the strongest muscle in the human body?"; 
        final String QUESTION2 = "2. Which planet is closest to the sun?"; 
        final String QUESTION3 = "3. How many elements are there in the periodic table?"; 
        final String QUESTION4 = "4. What is cynophobia the fear of?"; 
        final String QUESTION5 = "5. Who painted the famous painting, Girl with a Pearl Earring?"; 
        String answer;     
        int totalCorrect = 0;
        int totalIncorrect;
        double percentage;
        
        System.out.println("Welcome to my general knowledge quiz!");
        
        //output questions and choices to user, prompt user for their answer and output a statement indicating a correct or incorrect answer
        System.out.println(QUESTION1);
        System.out.println("a) heart, b) tongue, c) masseter, d) gluteus maximus");
        answer = keyedInput.nextLine();
        if ((answer.equals ("c"))||(answer.equals ("C"))) {
            System.out.println("This is correct!");
            totalCorrect = totalCorrect + 1;
            System.out.println("Number of correct answers: " + totalCorrect);
        }
        else {
            System.out.println("Sorry, this is not the correct answer.");
        }
        
        System.out.println();
        System.out.println(QUESTION2);
        System.out.println("a) Mars, b) Mercury, c) Venus, d) Saturn");
        answer = keyedInput.nextLine();
        if ((answer.equals ("b"))||(answer.equals ("B"))) {
            System.out.println("This is correct!");
            totalCorrect = totalCorrect + 1;
            System.out.println("Number of correct answers: " + totalCorrect);
        }
        else {
            System.out.println("Sorry, this is not the correct answer.");
        }
        
        System.out.println();
        System.out.println(QUESTION3);
        System.out.println("a) 130, b) 124, c) 118, d) 120");
        answer = keyedInput.nextLine();
        if ((answer.equals ("c"))||(answer.equals ("C"))) {
            System.out.println("This is correct!");
            totalCorrect = totalCorrect + 1;
            System.out.println("Number of correct answers: " + totalCorrect);
        }
        else {
            System.out.println("Sorry, this is not the correct answer.");
        }
        
        System.out.println();
        System.out.println(QUESTION4);
        System.out.println("a) dogs, b) cats, c) pigs, d) cows");
        answer = keyedInput.nextLine();
        if ((answer.equals ("a"))||(answer.equals ("A"))) {
            System.out.println("This is correct!");
            totalCorrect = totalCorrect + 1;
            System.out.println("Number of correct answers: " + totalCorrect);
        }
        else {
            System.out.println("Sorry, this is not the correct answer.");
        }
        
        System.out.println();
        System.out.println(QUESTION5);
        System.out.println("a) Vincent van Gogh, b) Pablo Picasso, c) Leonardo da Vinci, d) Johannes Vermeer");
        answer = keyedInput.nextLine();
        if ((answer.equals ("d"))||(answer.equals ("D"))) {
            System.out.println("This is correct!");
            totalCorrect = totalCorrect + 1;
            System.out.println("Number of correct answers: " + totalCorrect);
        }
        else {
            System.out.println("Sorry, this is not the correct answer.");
        }
     
        //calculating the total of incorrect answers
        totalIncorrect = 5 - totalCorrect;
        
        //calculating the percentage of questions answered correctly
        percentage = ((double)totalCorrect / 5) * 100;
        
        //output statistics at the end of the quiz
        System.out.println();
        
        System.out.println("Congrats! You made it to the end of the quiz!");
        
        System.out.println("Total number of correct answers: " + totalCorrect);
        
        System.out.println("Total number of incorrect answers: " + totalIncorrect);
        
        System.out.println("Percentage of questions answered correctly: " + percentage + "%");
    }
    
}
