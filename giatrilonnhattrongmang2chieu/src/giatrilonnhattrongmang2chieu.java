import java.util.Scanner;

public class giatrilonnhattrongmang2chieu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[][] arr=new int[2][2];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Nhap hang"+i+"cot"+j);
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.printf(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
        int max=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr[i].length;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("gia tri lon nhat trong mang"+max);
    }
}
