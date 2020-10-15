package com.company;

import java.util.Scanner;

public class DayOfTheWeek {
    String namesOfDay;

    public void planning(String namesOfDay) {
//        if (namesOfDay.equalsIgnoreCase("Sunday")
//                || namesOfDay.equalsIgnoreCase("Monday")
//                || namesOfDay.equalsIgnoreCase("Tuesday")
//                || namesOfDay.equalsIgnoreCase("Wednesday")
//                || namesOfDay.equalsIgnoreCase("Thursday")
//                || namesOfDay.equalsIgnoreCase("Friday")
//                ||  namesOfDay.equalsIgnoreCase("Saturday")){
            switch (namesOfDay.toLowerCase()){
                case "monday":
                    System.out.println("У Вас заплановано бізнес-зустріч");
                    break;
                case "tuesday":
                    System.out.println("У Вас заплановано відрядженнядо до Києва");
                    break;
                case "wednesday":
                    System.out.println("У Вас заплановано вечеря у ресторані");
                    break;
                case "thursday":
                    System.out.println("У Вас заплановано робота в офісі");
                    break;
                case "friday":
                    System.out.println("У Вас заплановано підготовка до вихідних");
                    break;
                case "saturday":
                    System.out.println("Пиво, друзі, веірки, все разом:))");
                    break;
                case "sunday":
                    System.out.println("У Вас заплановано Велике, Велике ПОХМІЛЛЯ!");
                    break;
                default: {
                    System.out.println("Ви ввели не коректну назву дня тижня. Введіть правельну ще раз");
                    Scanner sc = new Scanner(System.in);
                    planning(sc.nextLine());

                }
            //}
        }

    }
}
