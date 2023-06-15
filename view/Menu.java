package view;

import cotroller.Company;
import cotroller.GiaoDien;
import model.Customer;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public void Menu() {
        Company cp = new Company();
        int choice = 0;
        label:
        while (true)// vong lap vo han
        {
            System.out.println("===========MENU===========");
            System.out.println("1. List all Customer");
            System.out.println("2. Search Customer");
            System.out.println("3. Add new Customer");
            System.out.println("4. Customer statistical");
            System.out.println("5. Exit");
            System.out.println("===========END===========");
            System.out.println("Enter your choose");
            try {
                choice = Integer.parseInt(sc.nextLine().trim()); //nhan vao string trả ve interger

            } catch (NumberFormatException e) {
                System.out.println("Sai roi,nhap so tu 1-6 nheeeee");
                continue;//
            }
            switch (choice) {
                case 1:
                    cp.displayCustomer();
                    break;
                case 2:
                    Menu2();
                    break;
                case 3:
                    cp.addCustomer();
                    break;
                case 4:

                    break;
                case 5:

                    break label;
                default:
                    System.out.println("Làm ơn nhập số từ 1-5 nheeee. Iuuuuuu");
                    break;
            }
        }
    }

    public void Menu2() {
        Company cp = new Company();
        int choice = 0;
        label:
        while (true)// vong lap vo han
        {
            System.out.println("===========MENU===========");
            System.out.println("1. Find by Customer ID");
            System.out.println("2. Find by Name");
            System.out.println("3. Exit");
            System.out.println("===========END===========");
            System.out.println("Enter your choose");
            try {
                choice = Integer.parseInt(sc.nextLine().trim()); //nhan vao string trả ve interger

            } catch (NumberFormatException e) {
                System.out.println("Sai roi,nhap so tu 1-3 nheeeee");
                continue;//
            }
            switch (choice) {
                case 1:
                    cp.displayById();
                    break;
                case 2:
                    cp.displayByName();
                    break;
                case 3:
                    break label;
                default:
                    System.out.println("Làm ơn nhập số từ 1-3 nheeee. Iuuuuuu");
                    break;
            }
        }
    }
}

