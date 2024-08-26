package baitap;

import java.util.Scanner;

public class Product implements Ishop{
    private int ID;
    private String Name;
    private Double Price;
    private boolean status;

    public Product() {
    }

    public Product(int ID, String name, Double price, boolean status) {
        this.ID = ID;
        Name = name;
        Price = price;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Enter product ID: ");
        this.ID = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product name: ");
        this.Name = scanner.nextLine();
        System.out.println("Enter product price: ");
        this.Price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter product status: ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Status: " + (this.status? "sold" : "unsold"));
    }
}
