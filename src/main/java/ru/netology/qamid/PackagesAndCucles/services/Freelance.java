package ru.netology.qamid.PackagesAndCucles.services;

public class Freelance {
    public int calculate(int income, int expenses, int threshold){
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money -= expenses;
                money /= 3;
            }else{
                money += (income - expenses);
            }
        }
        return count;
    }
}
