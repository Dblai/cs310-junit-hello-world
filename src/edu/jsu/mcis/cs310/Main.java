package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        int lengthOfMessage = message.length();
        char[] reversedMessage = new char[length];

        for (int i = 0; i < length; i++){
            reversedMessage[i] = message.charAt(length - 1 - i);
        }

      
    }
    
}