package com.management;
import java.util.Scanner;
import java.util.ArrayList;
public class StockManagement {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfo p = new StockPortfo();
        while (flag == 0) {
            System.out.println("----Enter details of Stock ");
            StockPortfo.Stock s = p.new Stock();
            System.out.println("Enter Company Name:");
            s.company = sc.nextLine();
            System.out.println("Enter number of share:");
            s.noOfShare = sc.nextInt();
            System.out.println("Enter Price of share:");
            s.price = sc.nextDouble();

            p.portf.add(s);
            System.out.println("Want to enter more Stocks? enter 0 for YES or 1 for NO!");
            flag = sc.nextInt();
        }
        for (int i = 0; i < p.portf.size(); i++) {
            System.out.println(p.totalValue());

        }
    }
}

class StockPortfo {
    int noOfStock = 0;
    ArrayList<Stock> portf = new ArrayList<Stock>();
    double totalValue = 0;

    class Stock {
        int noOfShare;
        String company;
        double price;
    }

    public double totalValue() {
        for (int i = 0; i < portf.size(); i++) {
            totalValue += portf.get(i).price * portf.get(i).noOfShare;
        }
        return totalValue;
    }
}
