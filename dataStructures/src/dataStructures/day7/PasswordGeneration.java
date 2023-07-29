package dataStructures.day7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class PassWordGenerator{
    int passLength;
    String upper,lower,number,special;
    PassWordGenerator(){
        passLength =0;
        upper = "";
        lower = "";
        special = "";
        number = "";
    }
    public void acceptUserInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to password generation app");
        System.out.println("Now we need some informations what type of passowrd you require to create");
        System.out.print("Enter the length of the password : ");
        passLength = sc.nextInt();
        sc.nextLine();
        System.out.print("Do you want to include Uppercase letters(yes/no) : ");
        upper = sc.nextLine();
        System.out.print("Do you want to include Lowercase letters(yes/no) : ");
        lower = sc.nextLine();
        System.out.print("Do you want to include numbers(yes/no) : ");
        number = sc.nextLine();
        System.out.print("Do you want to include special characters(yes/no) : ");
        special = sc.nextLine();
    }
    public void savePassword(String password){
        try {
            FileWriter myWriter = new FileWriter("D:\\IdeaProjects\\dataStructures\\src\\dataStructures\\day7\\password.txt");
            myWriter.write(password);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void passwordStrength(String input){
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        System.out.print("Strength of password:- ");
        if (hasDigit && hasLower && hasUpper && specialChar && (n >= 8))
            System.out.print(" Strong");
        else if ((hasLower || hasUpper || specialChar) && (n >= 6))
            System.out.print(" Moderate");
        else
            System.out.print(" Weak");
    }
    public String generatePassword(){
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = "";
        Random random = new Random();
        String[] password = new String[passLength];

        int index = 0;
        if(this.lower.equals("yes")) {
            password[index] = String.valueOf(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
            combinedChars += lowerCaseLetters;
            index++;
        }
        if(this.upper.equals("yes")) {
            password[index] = String.valueOf(capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length())));
            combinedChars += capitalCaseLetters;
            index++;

        }
        if(this.special.equals("yes")) {
            password[index] = String.valueOf(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
            combinedChars += specialCharacters;
            index++;
        }
        if(this.number.equals("yes")) {
            password[index] = String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
            combinedChars += numbers;
            index++;
        }

        for(int i = index; i< passLength ; i++) {

            password[i] = String.valueOf(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }
        String myPassword = "";
        for(String e:password) {
            myPassword += e;
        }

        return myPassword;
    }

}

public class PasswordGeneration {
    public static void main(String[] args) {
        PassWordGenerator obj = new PassWordGenerator();
        obj.acceptUserInputs();
        String password = obj.generatePassword();
        System.out.println(password);
        obj.savePassword(password);
        obj.passwordStrength(password);

    }
}
