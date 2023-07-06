package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int month = 1; month < 11; month++) {


            if (money >= threshold) {
                // отдыхает
                money = money - expenses;
                money = money / 3;
                count++;

            } else {
                // работает
            }
            money = money + income;
            money = money - expenses;

        }
        return count;
    }
}
