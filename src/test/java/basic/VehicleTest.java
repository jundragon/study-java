package basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    @Test
    public void test() {
        Car car = new Car();
        System.out.println(car.getName());
    }
}