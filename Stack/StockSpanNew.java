package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanNew {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

        }

        Stack<Integer> stack = new Stack<>();
        int res = 1;
        Stack<Integer> copy = new Stack<>();
        for (int i = 0; i < n; i++) {
            if(!stack.empty() && stack.peek()<=a[i]){
                while(!stack.empty() && stack.peek()<=a[i]){
                    res = res+1;
                    copy.push(stack.pop());

                }
                while(!copy.empty()){
                    stack.push(copy.pop());
                }
            }
            else if (stack.empty()){
                res=1;
            }
            System.out.println(res+" ");
            res=1;
            stack.push(a[i]);
        }

    }
}
