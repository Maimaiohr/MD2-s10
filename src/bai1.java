import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        try {
            System.out.println("nhap a:");
            int a = scanner.nextInt();
            System.out.println("nhap b:");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println("ket qua a chia b la:" + c);
        }catch (Exception e) {
            System.err.println("Khong the chia cho so 0");
        }finally {
            System.out.println("ket thuc chuong trinh");
        }
    }
}
