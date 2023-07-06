package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.FreelancerService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {
    @Test
    public void testCalculate() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalculate2() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}
