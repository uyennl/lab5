package cotroller;

import model.Customer;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Company implements GiaoDien {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> arrCustomer = new ArrayList<>();

    public void addCustomer() {
        int id = enterCustomerId();
        String name = enterName();
        String phone = enterPhone();
        Customer cs = new Customer(id, name, phone);
        arrCustomer.add(cs);
    }

    public int enterCustomerId() {
        int id = 0;
        System.out.println("Mời nhập id khách hàng");
        while (true) {
            try {
                id = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Sai rồi. Bạn phải nhập số!");
                continue;
            }
            if (id > 0) {
                boolean flag = false;
                for (Customer cs : arrCustomer) {
                    if (cs.getCustomerId() == id) {
                        flag = true;
                    }
                }
                if (!flag) {
                    return id;
                } else {
                    System.out.println("Id đã tồn tại. Mời nhập lại!");
                }
            } else {
                System.out.println("Id phải lớn hơn 0");
            }
        }
    }

    public String enterName() {
        System.out.println("Mời nhập tên khách hàng!");
        String name = null;
        while (true) {
            try {
                name = sc.nextLine().trim();
            } catch (NoSuchElementException e) {
                System.out.println("Tên không được để trống");
                continue;
            }
            if (!name.matches(".*\\d.*") || name.matches(".*[^a-zA-Z].*")) {
                return name;
            } else {
                System.out.println("Tên không hợp lệ!");
            }
        }
    }

    public String enterPhone() {
        String phone = null;
        System.out.println("Mời nhập sdt khách hàng!");
        while (true) {
            try {
                phone = sc.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Không được đẻ trống. Mời nhập lại!");
                continue;
            }
            if (!phone.matches("/(03|05|07|08|09|01[2|6|8|9|0])+([0-9]{8})\b/")) {
                boolean flag = false;
                for (Customer cs : arrCustomer) {
                    if (cs.getPhone().equals(phone)) {
                        flag = true;
                    }
                }
                if (!flag) {
                    return phone;
                } else {
                    System.out.println("Số điện thoại đã tồn tại. Mời nhập lại!");
                }
            } else {
                System.out.println("Sai định dạng. Moi nhập lại!");
            }
        }
    }

    public void displayCustomer() {
        int sum = 0;
        for (Customer cs : arrCustomer) {
            System.out.println(cs);
            sum++;
        }
        System.out.println("------------------------");
        System.out.println("Total: " + sum + " Customer");
    }

    public Customer searchById(int id) {
        for (Customer cs : arrCustomer) {
            if (cs.getCustomerId() == id) {
                return cs;
            }

        }
        return null;

    }

    public void displayById() {
        System.out.println("Nhâp ID khách hàng cần tìm");
        int id = sc.nextInt();
        Customer search = searchById(id);
        for (Customer cs : arrCustomer) {
            if (search == null) {
                System.out.println("Không tìm thấy id khách hàng");
            } else {
                System.out.println(search);
            }
        }

    }

    public Customer searchByName(String name) {
        for (Customer cs : arrCustomer) {
            if (cs.getName().equals(name)) {
                return cs;
            }

        }
        return null;
    }

    public void displayByName() {
        String name = enterName();
        Customer search = searchByName(name);
        for (Customer cs : arrCustomer) {
            if (search == null) {
                System.out.println("Không tìm thấy tên khách hàng");
            } else {
                System.out.println(search);
            }
        }

    }
}



