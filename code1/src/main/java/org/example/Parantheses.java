package org.example;

import java.util.Stack;

public class Parantheses {
    public static boolean parentheses(String s) {
//       ({{{{}}}))
        Stack<Character> s1 = new Stack();
        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                s1.push(s.charAt(i));
            } else {
                if (s1.isEmpty()) {
                    return false;
                }
                char topElement = s1.pop();
                if (s.charAt(i) == ')' && topElement != '(') {
                    return false;
                } else if (s.charAt(i) == '}' && topElement != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && topElement != '[') {
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        boolean a = parentheses("({{{{}}}))");
        System.out.println(a);
    }
}
