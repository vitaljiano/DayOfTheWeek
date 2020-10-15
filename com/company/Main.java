package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeek nameOfDay = new DayOfTheWeek();
        Scanner sc = new Scanner(System.in);
        nameOfDay.planning(sc.nextLine());
    }
}
