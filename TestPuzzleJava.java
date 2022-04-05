import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) { 
        PuzzleJava randomCreator = new PuzzleJava();
        System.out.println("----- get 10 rolls Test-----");
        ArrayList<Integer> randomRolls = randomCreator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("----- get random letter Test-----");
        System.out.printf("Random letter is: %s \n\n", randomCreator.getRandomLetter());


        System.out.println("----- generatePassword Test-----");
        System.out.printf("Your Password is: %s \n\n", randomCreator.generatePassword());

        System.out.println("----- get NewPassword Test-----");
        System.out.printf("Your New Password is: %s \n\n", randomCreator.getNewPasswordset(1));




    }
}