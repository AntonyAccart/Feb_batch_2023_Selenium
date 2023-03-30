package week6day3ass;

import java.util.*;

public class PrintUniqueCharacter {
    
    public static void main(String[] args) {
        
        Scanner str = new Scanner(System.in);
        System.out.println("Enter  name: ");
        String name = str.nextLine();
        
        char[] chars = name.toCharArray(); 
        
        Set<Character> uniqueChars = new HashSet<>(); 
        
        for (char text : chars) {
            if (!uniqueChars.add(text)) { 
                uniqueChars.remove(text);
            }
        }
        
        System.out.print("Unique characters in name ");
        for (char text : uniqueChars) {
            System.out.print(text + " ");
        }
        
        str.close();
    }
}
