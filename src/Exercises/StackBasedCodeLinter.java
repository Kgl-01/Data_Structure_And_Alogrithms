package Exercises;

import DataStructure.Stack;

public class StackBasedCodeLinter {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "(var x = {y:[1,2,3]}";

        String result = lint(str);

        System.out.println(result);
    }

    static String lint(String str){
        Stack<Character>stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(isOpeningBrace(c)){
                stack.push(c);
            } else if (isClosingBrace(c)) {
                if(stack.isEmpty()){
                    return "Doesn't have opening brace";
                }else{
                    char top = stack.pop();
                    if(isNotAMatch(top,c)){
                        return c + " has mismatching opening brace";
                    }
                }
            }
        }

        if(!stack.isEmpty()){
            return "Doesn't have closing brace";
        }
        return "No issues found";
    }

     static boolean isOpeningBrace(char c){
        return c=='('|| c=='{'||c=='[';
    }

    static boolean isClosingBrace(char c){
        return c==')'||c=='}'||c==']';
    }

    static boolean isNotAMatch(char openingBrace,char closingBrace){
        return (openingBrace == '(' && closingBrace != ')') || (openingBrace == '{' && closingBrace != '}') || (openingBrace == '[' && closingBrace != ']');
    }

}
