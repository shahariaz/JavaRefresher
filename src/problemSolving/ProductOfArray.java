package problemSolving;
import  java.util.Scanner;
public class ProductOfArray {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            int a = input.nextInt();
            nums[i]=a;
        }
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = 1;
        r[n-1] =1;
        for(int i =1;i<n;i++){
            l[i] = l[i-1] * nums[i -1];
        }
        for(int i =n-2;i>=0;i--){
            r[i] = r[i+1] * nums[i+1];
        }
        for(int i =0;i<n;i++){
            nums[i] = l[i] * r[i];
        }
        for(int i =0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
