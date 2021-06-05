package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NearestGreaterRight {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> res = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements ");
        int n = sc.nextInt();
        int[] a= new int[n];
        int i;
        System.out.println("Enter array elements ");
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(i=n-1;i>=0;i--){

            if(stack.empty()){
                res.push(-1);
                
            }
            else if(!stack.empty()&&stack.peek()>a[i]){
                
                res.push(stack.peek());
                
            }
            else if(!stack.empty()&&stack.peek()<=a[i]){
                //pop unitll stack is empy or stak top is greater than given element
                while(!stack.empty()&&stack.peek()<=a[i]){
                    stack.pop();
                }

                //check for what condition did while loop terminate
                if(stack.empty()){
                    res.push(-1);
                }
                else if(stack.peek()>a[i]){
                    res.push(stack.peek());
                }

            }
            stack.push(a[i]);
        }
        for(i=0;i<n;i++){
            System.out.println(res.pop());
        }
    }
}
