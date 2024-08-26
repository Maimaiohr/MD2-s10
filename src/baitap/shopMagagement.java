package baitap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class shopMagagement {
    public static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("****************PRODUCT*************** \n" +
                    "1. Add product \n" +
                    "2. Hien thi danh sach sản phẩm\n" +
                    "3. Sap xep theo gia tang dan\n"+
                    "4. Sap xep theo gia giam dan\n"+
                    "5. Update product\n"+
                    "6. Delete product\n"+
                    "7. Thoat");
            System.out.println("Mời bạn chọn 1-7:");
            boolean check = true;
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Them moi san pham ");
                    Product product = new Product();
                    product.inputData(scanner);
                    products.add(product);
                    break;
                case 2:
                    System.out.println("========PRODUCT=======");
                    for (Product product1 : products) {
                        product1.displayData();
                    }break;
                case 3:
                    products.sort(new Comparator<Product>() {

                        @Override
                        public int compare(Product o1, Product o2) {
                            return (int) (o1.getPrice()-o2.getPrice());
                        }});
                    System.out.println("Sau khi sắp xếp tăng dần ");
                    for (Product product1 : products) {
                        product1.displayData();
                    }break;
                case 4:
                    products.sort(new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return (int) (o2.getPrice()- o1.getPrice());
                        }
                    });
                    System.out.println("Sau khi sắp xếp giam dần ");
                    for (Product product1 : products) {
                        product1.displayData();
                    }break;
                case 5:
                    //nhap id can sua
                    System.out.println("nhap id can sua");
                    int id = Integer.parseInt(scanner.nextLine());
                    //loop duyet list tim pham tu can sua
                    for (Product product1 : products) {
                        if (product1.getID()==id){
                            product1.inputData(scanner);
                            break;
                        }
                    }break;
                case 6:
                    //nhap id can xoa
                    System.out.println("nhap id can xoa");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    //loop duyet list tim pham tu can xoa
                    for (Product product1 : products) {
                        if (product1.getID()==idDelete){
                            products.remove(product1);
                            break;
                        }
                    }break;
                case 7:
                    System.exit(0);
            }

        }while (true);
    }
}
