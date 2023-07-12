import java.util.Scanner;

public class TimeToEquality {

    public static int equal(int arr[], int n){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int d=0;
        for(int i=0;i<n;i++){
            if(arr[i] == max){
                continue;
            }
            d+=max-arr[i];
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(equal(arr, n));
    }
}
