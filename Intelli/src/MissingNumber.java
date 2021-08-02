import java.util.Scanner;
//Missing number in an array of integers in range eg : 1-100
public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");

        int n = sc.nextInt();
        int s = n*(n+1)/2;
        int a[] = new int[n];

        for(int i = 0;i<n-1;i++){
            a[i] = sc.nextInt();
            s = s - a[i]; //Reducing the sum and check if it reaches 0
        }
        if(s==0){
            System.out.println("No Missing Number");
        }
        else{
            System.out.println("Missing Number - "+s);

        }


    }
}
