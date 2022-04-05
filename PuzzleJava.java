import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomNum = new ArrayList<Integer>();
        Random rand = new Random();
        
        for (int i=1; i<=11; i++){
            randomNum.add(rand.nextInt(20) +1);
        }
        return randomNum;
    }
        
    

    public String getRandomLetter() {
        Random rand = new Random();
        String abcString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = abcString.charAt(rand.nextInt(26));
        
        return String.valueOf(randomChar);
        
    }

    public String generatePassword() {
        
        String password = "";

        for(int i= 0; i < 8; i++){
          password += getRandomLetter();
        }
        return password;
        
    }

    public ArrayList<String> getNewPasswordset(int length){

        ArrayList<String> setPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            setPassword.add(generatePassword());
        }
        return setPassword;
            


    }
        
        

        
}

    
