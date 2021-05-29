import java.util.*;

class Kthlargest{
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements ");
        int n = sc.nextInt();
        int[] a= new int[n];
        System.out.println("Enter array elements ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Value of K");
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            heap.add(a[i]);
            if(heap.size()>k){
                heap.poll();
            }
            else{
                continue;
            }
        }

        System.out.println("Kth Largest -> "+heap.poll());
    }
}