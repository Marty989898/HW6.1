package ru.netology.qamid.PackagesAndCucles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceTest {
    @Test
    public void TestClase1() {
        Freelance freelance = new Freelance();
       int actual = freelance.calculate(10_000, 3_000, 20_000);
       int expenses = 3;

        Assertions.assertEquals(expenses, actual);
    }

    @Test
    public void TestClase2() {
        Freelance freelance = new Freelance();
        int actual = freelance.calculate(100_000, 60_000, 150_000);
        int expenses = 2;

        Assertions.assertEquals(expenses, actual);
    }



}