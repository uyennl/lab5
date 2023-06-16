package view;

import cotroller.Company;

import java.util.Scanner;
//chua ham du lieu giao tiep vs nguoi dung hien thi cho nguoi dung thay*

public class CompanyManagement {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu m =new Menu();
        m.Menu();
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
