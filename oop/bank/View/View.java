package View;

import java.util.Scanner;

public class View {
    public static void Menu(){
        System.out.println("1. Đăng nhập \n");
        System.out.println("2. Mở tài khoản mới \n");
        System.out.println("*. Thoat app \n");
    }

    public static void Login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email:  \n");
        String email = scanner.nextLine();
        System.out.println("Password:  \n");
        String password = scanner.nextLine();
        scanner.close();
    }

    public static void Register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email:  \n");
        String email = scanner.nextLine();
        System.out.println("Password:  \n");
        String password = scanner.nextLine();
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("Gender (1: male, 2: female) : ");
        int gender = scanner.nextInt();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        scanner.close();
    }

    public static void ControlLogin(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch(num){
            case 1:
                Login();
            case 2:
                Register();
            default:
                System.out.println("thoat app !!");
        }
    }

    public static void view() {
        Menu();
        ControlLogin();
    }
}
