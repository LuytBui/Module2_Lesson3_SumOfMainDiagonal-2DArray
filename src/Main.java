import java.util.Scanner;

public class Main {
    //    Viết một ứng dụng cho phép người dùng nhập vào một ma trận vuông của các số thực,
//    sau đó tính ra cho người dùng tổng của các số ở đường chéo chính.
//    Ma trận vuông là một ma trận có chiều cao và chiều rộng bằng nhau.
//    Đường chéo chính là tập hợp các phần tử được định vị bằng tọa độ [i][i].
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {2, 4, 2, 4, 2},
                {1, 2, 1, 1, 2},
                {4, 5, 1, 2, 6}
        };

        System.out.println("Ma trận: ");
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.printf("%d  ", elem);
            }
            System.out.println();
        }

        int mainDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++){
            mainDiagonalSum += arr[i][i];
        }
        System.out.printf("Tổng trên đường chéo chính của ma trận: %d\n",mainDiagonalSum);

    }
}
