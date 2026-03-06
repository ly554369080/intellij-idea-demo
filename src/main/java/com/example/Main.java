package com.example;

import com.example.demo.Calculator;
import com.example.demo.utils.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("欢迎使用IntelliJ IDEA演示程序!");
            System.out.println("========================");

            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n请选择操作:");
                System.out.println("1. 计算器");
                System.out.println("2. 字符串处理");
                System.out.println("3. 退出");
                System.out.print("请输入选项: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // 消耗换行符

                switch (choice) {
                    case 1:
                        runCalculator(calculator, scanner);
                        break;
                    case 2:
                        runStringUtils(scanner);
                        break;
                    case 3:
                        System.out.println("感谢使用，再见!");
                        return;
                    default:
                        System.out.println("无效选项，请重试");
                }
            }
        }

        private static void runCalculator(Calculator calculator, Scanner scanner) {
            System.out.print("请输入第一个数字: ");
            double a = scanner.nextDouble();
            System.out.print("请输入第二个数字: ");
            double b = scanner.nextDouble();
            System.out.print("请输入操作符 (+, -, *, /): ");
            String op = scanner.next();

            try {
                double result = calculator.calculate(a, b, op);
                System.out.printf("结果: %.2f %s %.2f = %.2f%n", a, op, b, result);
            } catch (IllegalArgumentException e) {
                System.out.println("错误: " + e.getMessage());
            }
        }

        private static void runStringUtils(Scanner scanner) {
            System.out.print("请输入一个字符串: ");
            String input = scanner.nextLine();

            System.out.println("选择操作:");
            System.out.println("1. 反转字符串");
            System.out.println("2. 检查是否回文");
            System.out.println("3. 转换为大写");
            System.out.println("4. 转换为小写");
            System.out.print("请输入选项: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.println("反转后: " + StringUtils.reverse(input));
                    break;
                case 2:
                    System.out.println("是否回文: " + StringUtils.isPalindrome(input));
                    break;
                case 3:
                    System.out.println("大写: " + StringUtils.toUpperCase(input));
                    break;
                case 4:
                    System.out.println("小写: " + StringUtils.toLowerCase(input));
                    break;
                default:
                    System.out.println("无效选项");
            }
        }
}