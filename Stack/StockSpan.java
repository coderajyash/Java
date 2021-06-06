package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements ");
        int n = sc.nextInt();
        int[] a= new int[n];
        int i;
        System.out.println("Enter array elements ");
        for(i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> dis = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        
        int res=1;
        for (i=0;i<n;i++){
            if(stack.empty()){
                res = 1;
            }
            else if(!stack.empty()&&stack.peek()>a[i]){
                res =1;

            }
            else if(!stack.empty()&&stack.peek()<=a[i]){

                while(!stack.empty()&&stack.peek()<=a[i]){
                    
                    res++;
                    temp.push(stack.pop());

                    
                }
                //clone the temporary stack element back to original stack as the elements were popped
            while(temp.size()!=0){
                stack.push(temp.pop());
            }

            }
            dis.add(res);
            res=1;
            stack.add(a[i]);
        }
        for(i=0;i<n;i++){
            System.out.println(dis.get(i));
        }
    }
   
}
