import java.util.*;

class Solution {
    public boolean solution(String S) {
        // write your code in Java SE 8

        String[] list =S.split("");
        
        boolean foundA = false;
        boolean foundB = false;
        
       for(String word:list){
            if(word.equals("a") && foundB==false){
               foundA=true;               
            } 
             else if(word.equals("a") && foundB==true){
               return true;               
            } 
       }
           for(String word1:list){
            if(word1.equals("b")){
               foundB=true;               
            else if (foundB==true && foundA==true) {
            }  
                 return false;
        }
        else if (word1.equals("b") && foundA==true){
            return false;
        }
        }
      return true;

    }
}