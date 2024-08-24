import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        try {
            System.out.println("nhap a:");
            int a = scanner.nextInt();
            System.out.println("nhap b:");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("ket qua a chia b la:" + sum);
        }catch (Exception e) {
            System.err.println("sai dinh dang, xin nhap vao so nguyen");
        }finally {
            System.out.println("ket thuc chuong trinh");
        }
    }
}
