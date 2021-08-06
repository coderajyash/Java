import java.util.ArrayList;
import java.util.Scanner;

public class CountOfElement {
    public static void main(String[] args) {
        int i,n=10;
        int[] a = new int[n];
        ArrayList<Integer> count = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched : ");
        int s = sc.nextInt();
        int first=-1,last=-1;
        int start = 0,end = n-1,mid;
        while(start<=end){
            mid = start + (end-start)/2;

            if(a[mid]==s){
                first = mid;
                end = mid-1; // for last occurance start = mid+1;
            }
            else if(a[mid]>s){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        start = 0;
        end = n-1;

        while(start<=end){
            mid = start + (end-start)/2;

            if(a[mid]==s){
                last = mid;
                start = mid+1;
            }
            else if(a[mid]>s){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println("Count of element : "+(last-first+1));
    }
}
