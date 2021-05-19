package kmit;

import java.util.*;

public class StackParanthsis {

    public static void main(String[] args) {
        String s = "{{(}}";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s){

        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch !=')' && ch !='}' && ch != ']'){
                stack.push(ch);
            }
            else {
                if(ch != map.get(stack.pop())){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}


