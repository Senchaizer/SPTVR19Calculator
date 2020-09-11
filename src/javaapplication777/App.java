/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication777;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private final Scanner scanner = new Scanner(System.in);
    
    public void run(){
        System.out.println("Выполняется метод run()");
        System.out.print("Введите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Укажите операцию (+, -, *, /):");
        String znak = scanner.nextLine();
        System.out.println("Результат: ");
        if(null != znak)switch (znak) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                break;
        }
        System.out.println("Закончился метод run()");
    }
  }
