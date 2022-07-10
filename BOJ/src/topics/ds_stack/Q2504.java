package topics.ds_stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        boolean flag = true;
        int answer = 0;
        int cnt =1;

        for(int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);

            if(cur == '(') {

                stack.push(cur);
                cnt *= 2;
            } else if(cur == '[') {

                stack.push(cur);
                cnt *= 3;
            } else {

                if(cur == ')') {
                    if(stack.isEmpty() || stack.peek() != '(') {
                        flag = false;
                        break;
                    }

                    if(str.charAt(i - 1) == '(') {
                        answer += cnt;
                    }

                    stack.pop();
                    cnt /= 2;
                } else if(cur == ']') {

                    if(stack.isEmpty() || stack.peek() != '[') {
                        flag = false;
                        break;
                    }

                    if(str.charAt(i-1)=='[') {
                        answer += cnt;
                    }

                    stack.pop();
                    cnt /= 3;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if(!flag || !stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }
    }
}
