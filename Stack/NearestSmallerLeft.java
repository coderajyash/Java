package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallerLeft {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        //for left subarray order of result is same
        ArrayList<Integer> res = new ArrayList<>();
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements ");
        int n = sc.nextInt();
        int[] a= new int[n];
        
        System.out.println("Enter array elements ");
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(i=0;i<n;i++){

            if(stack.empty()){
                res.add(-1);

            }
            else if(!stack.empty()&&stack.peek()<a[i]){
                res.add(stack.peek());
            }
            else if(!stack.empty()&&stack.peek()>=a[i]){

                while(!stack.empty()&&stack.peek()>=a[i]){
                    stack.pop();
                }
                if(stack.empty()){
                    res.add(-1);
                }
                else if(stack.peek()<a[i]){
                    res.add(stack.peek());

                }
            }
            stack.push(a[i]);
        }
        
        for(i=0;i<n;i++){
            System.out.println(res.get(i));
        }

    }
}
