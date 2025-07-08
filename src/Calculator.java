import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result;
        boolean flag = true;

        System.out.println("Введите первое число:");
        int a = scanner.nextInt();

        System.out.println("Введите знак:");
        String znak = scanner.next();

        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        result = switch (znak) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Деление на ноль запрещено! Повторите заново");
                    flag = false;
                    yield 0;
                } else {
                    yield a / b;
                }
            }
            case "%" -> {
                if (b == 0) {
                    System.out.println("Деление на ноль запрещено! Повторите заново");
                    flag = false;
                    yield 0;
                } else {
                    yield a % b;
                }
            }
            default -> {
                System.out.println("Ошибка!");
                flag = false;
                yield 0;
            }
        };

        if (flag) {
            System.out.println("Ответ: " + result);
        }
    }
}