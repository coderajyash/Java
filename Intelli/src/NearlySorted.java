import java.util.Scanner;

public class NearlySorted {
    //Element can be at i , i-1 , i+1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array elements");

        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Search Element : ");
        int s = sc.nextInt();
        int l=0,h=n-1,m;
        int res = -1;
        while(l<=h){
            m = l+(h-l)/2;
            if(a[m]==s){
                res= m;
                break;
            }
            if((a[m-1]==s)&&(m-1)>=l){
                res = m-1;
                break;
            }
            if((a[m+1]==s)&&(m+1)<=h){
                res = m+1;
                break;
            }
            else if(a[m]<s){
                l = m+2;
            }
            else if(a[m]>s){
                h=m-2;
            }
        }
        if(res!=-1){
            System.out.println("Found at : "+res);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
