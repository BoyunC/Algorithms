package topics.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1991 {

    static class Node {
        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    static List<Node>[] list;
    static StringBuilder sb =new StringBuilder();

    static void preOrder (int start) {
        for (Node node : list[start]) {
            int left = node.left;
            int right = node.right;

            sb.append((char) (start + 'A' - 1));

            if(left != -18) {
                preOrder(left);
            }

            if(right != -18) {
                preOrder(right);
            }
        }
    }

    static void inOrder (int start) {
        for(Node node : list[start]) {
            int left = node.left;
            int right = node.right;

            if(left != -18) {
                preOrder(left);
            }

            sb.append((char) (start + 'A' - 1));

            if(right != -18) {
                preOrder(right);
            }
        }
    }

    static void postOrder (int start) {
        for(Node node : list[start]) {
            int left = node.left;
            int right = node.right;

            if(left != -18) {
                preOrder(left);
            }

            if(right != -18) {
                preOrder(right);
            }

            sb.append((char) (start + 'A' - 1));
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(kb.readLine());
        list = new ArrayList[N+1];
        for (int i = 1; i < N + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i < N + 1; i++) {
            String[] line = kb.readLine().split(" ");
            int data  = line[0].charAt(0) - 'A' + 1;
            int left  = line[1].charAt(0) - 'A' + 1;
            int right = line[2].charAt(0) - 'A' + 1;
            list[data].add(new Node(left, right));
        }

        preOrder(1);
        sb.append('\n');
        inOrder(1);
        sb.append('\n');
        postOrder(1);
        sb.append('\n');


        System.out.println(sb.toString());
    }
}
