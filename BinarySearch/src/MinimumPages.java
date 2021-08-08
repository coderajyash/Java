import java.util.Scanner;

public class MinimumPages {

    static boolean distribute(int[] a,int n,int k,int mid){

        int sum = 0;
        int student =1;

        for(int i=0;i<n;i++){
            sum =sum+a[i];

            if(sum>mid){
                student++;
                sum=a[i];
            }

            if(student>k){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements");

        int i, sum = 0;
        int[] a = new int[n];

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Enter the number of Students : ");
        int k = sc.nextInt();
        int low = a[n - 1], high = sum;

        // Binary Search on [Max]-----------------[Sum]
        int mid, res = -1;

        if (k > n) {
            res = -1;
        }
        else {
            while (low <= high) {

                mid = low + (high - low) / 2;

                if (distribute(a, n, k, mid)) {
                    res = mid;
                    high = mid - 1;// if possible then go left as we have to find the minimum

                } else {
                    low = mid + 1;
                }
            }
        }

        if (res != -1) {
            System.out.println("Minimum pages : " + res);
        } else {
            System.out.println("Minimum pages not possible ");
        }
    }

}