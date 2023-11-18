package com.company;

import java.util.Stack;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 11/16/2023, Thursday
 **/
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        char leftBracket = '(';
        char leftBracketSquare = '[';
        char leftBracketCurly = '{';

        char rightBracket = ')';
        char rightBracketSquare = ']';
        char rightBracketCurly = '}';

        Stack<Character>  stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c==leftBracket || c==leftBracketSquare || c== leftBracketCurly )
            {
                stack.push(c);
//                System.out.println("push:"+c);
            }
            else
            {
                if(stack.isEmpty()) return false;
                char o = stack.pop();
//                System.out.println("pop:"+o);
                if (c==rightBracket && o!=leftBracket) return false;
                if (c==rightBracketSquare && o!=leftBracketSquare) return false;
                if (c==rightBracketCurly && o!=leftBracketCurly) return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        ValidParentheses V = new ValidParentheses();
        String s = "]";
        System.out.println(V.isValid(s));
    }
}
