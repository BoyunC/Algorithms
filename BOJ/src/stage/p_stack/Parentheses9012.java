package stage.p_stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses9012 {

    public static String solution(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c=='(')
                stack.push(c);
            else if(stack.empty())
                return "NO";
            else
                stack.pop();
        }

        if(stack.empty())
            return "YES";
        else
            return "NO";
    }


    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(kb.readLine());

        for (int i = 0; i < t; i++)
            sb.append(solution(kb.readLine())).append('\n');

        System.out.println(sb);
    }
}
