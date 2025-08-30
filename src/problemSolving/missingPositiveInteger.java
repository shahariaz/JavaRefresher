package problemSolving;
import java.util.Scanner;
public class missingPositiveInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        };
        // check if all element is negative
        boolean flag = false;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(1);
        }
        else{
            boolean flag1 = false;
            for(int i=0;i<n;i++) {
                if(arr[i] == 1){
                    flag1 = true;
                    break;
                }
            }
            if(!flag1){
                System.out.println(1);
            }
            else{
                //clean up
                for(int i=0;i<n;i++){
                    if(arr[i]<=0 || arr[i]>n) {
                        arr[i] = 1;
                    }

                }
                //indexing & Hashing
                for(int i=0;i<n;i++){
                    int v = arr[i];
                    v = Math.abs(v);
                    if(v==n){
                        arr[0] = - Math.abs(arr[0]);
                    }else{
                        arr[v] = - Math.abs(arr[v]);
                    }
                }
                boolean flag2 = false;
                for(int i=1;i<n;i++){
                    if(arr[i]>0){
                        System.out.println(i);
                        flag2 = true;
                        break;
                    }
                }
                if(!flag2){
                    if(arr[0]>0){
                        System.out.println(n);
                    }else{
                        System.out.println(n+1);
                    }
                }

            }
        }
}   }
