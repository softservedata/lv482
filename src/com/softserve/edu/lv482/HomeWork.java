package com.softserve.edu.lv482;

import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть Радіус:");
        double radius;
        radius = sc.nextDouble();
        double area;
        area = Math.PI *(radius * radius);
        System.out.println("Площа кола дорівнює: " + area);
       double circumference;
       circumference = Math.PI * 2 * radius;
        System.out.println("Периметр дорівнює: " + circumference);
        //Щось тут не так

        System.out.print("Ваше Ім'я:");
        String name = sc.nextLine();
        System.out.print("Ваш Адрес: ");
        String address = sc.nextLine();
        System.out.println("Ім*я " + name + " за адресою: " + address);

        System.out.print("С1 ");
        double C1 = sc.nextDouble();
        System.out.print("C2 ");
        double C2 = sc.nextDouble();
        System.out.print("C3 ");
        double C3 = sc.nextDouble();
        System.out.print("Ціна за хв: ");
        double prise = sc.nextDouble();
        System.out.println("Загальна Тривалість: " + (C1 + C2 + C3));
        System.out.println("Загальна Вартість: " + (C1 + C2 + C3 * prise));
        sc.close();
    }
}