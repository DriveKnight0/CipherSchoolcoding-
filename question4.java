
    // Online Free Java compiler to run Java program online
    import java.util.Scanner;
    public class Main {
      public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int input1=in.nextInt();
        int input2=in.nextInt();
        int[] arr= new int [4];
        int rem=0;
        int index=0;

        while (input1 > 0) {
            arr[index++] = input1 % 2;
            input1 /= 2;
        }

        if(arr[input2]==0){
          arr[input2]=1;
        }else if (arr[input2]==1){
          arr[input2]=0;
        }
        
        int len=arr.length;
        for (int i = len - 1; i >= 0; i--){
          System.out.print(arr[i]);
        }
      }
    }