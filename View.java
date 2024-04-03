import java.util.Scanner;

public class View { /// ВВОД ПОЛЬЗОВАТЕЛЯ
    Scanner scanner;
    Scanner scanner2;
    public View() {
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
        // scan();
        // scan1();
    }
    public int scan(){
        System.out.println("Введите первое число");
        return scanner.nextInt();
    }
    public String scan1(){
        System.out.println("Введите операцию + - * /");
        return scanner2.nextLine();}
    public int scan3(){
    System.out.println("Введите второе число");
        return scanner.nextInt();
        }
        
}
