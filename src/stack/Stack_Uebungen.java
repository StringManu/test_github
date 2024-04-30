package stack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Uebungen {
	
	public static String reverseString(String input) {
		  Stack<Character> stack = new Stack<>();

		  for (char c : input.toCharArray()) {
		    stack.push(c);
		  }

		  StringBuilder reversedString = new StringBuilder();
		  while (!stack.isEmpty()) {
		    reversedString.append(stack.pop());
		  }

		  return reversedString.toString();
		}

	public static boolean checkBrackets(String expression) {
	        Stack<Character> stack = new Stack<>();
	        for (char ch : expression.toCharArray()) {
	            if (ch == '(' || ch == '[' || ch == '{') {
	                stack.push(ch);
	            } else if (ch == ')' || ch == ']' || ch == '}') {
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                char top = stack.pop();
	                if ((ch == ')' && top != '(') ||
	                    (ch == ']' && top != '[') ||
	                    (ch == '}' && top != '{')) {
	                    return false;
	                }
	            }
	        }
	        return stack.isEmpty();
	    }
	
	public static boolean checkBracketsMusterloesung(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		for(char c : input.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char lastOpen = stack.peek();
				if((c == ')' && lastOpen != '(') ||
					(c == '}' && lastOpen != '{') ||
					(c == ']' && lastOpen != '[')) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
	public static double evaluateUPN(String input) {
		return 0;
	}
	
	public static void main(String[] args) {
		/**
		String input1 = "Hallo Manuel was geht";
		  String reversed1 = reverseString(input1);
		  System.out.println(reversed1); 

		  String input2 = "12345";
		  String reversed2 = reverseString(input2);
		  System.out.println(reversed2); 
		Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib deinen Satz ein: ");
        String input = scanner.nextLine();
        if (checkBrackets(input)) {
            System.out.println("Korrekte Klammerung!");
        } else {
            System.out.println("Fehlerhafte Klammerung!");
        }
        **/
		String str = "(()))";
		System.out.println(checkBracketsMusterloesung(str));
	}

}