import java.util.Stack;

public class DSStack {

    public static boolean validParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();

        if(arr.length == 0 || arr[0] == ')' || arr[0] == '}' || arr[0] == ']'){
            return false;
        }

        for(Character i: arr){
           if(i == '(') {
               stack.push(')');
           } else if(i == '{') {
               stack.push('}');
           } else if(i == '[') {
               stack.push(']');
           } else if(stack.pop() != i){
               return false;
           }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(){}{}[]";
        System.out.println(validParenthesis(str));

    }
}
