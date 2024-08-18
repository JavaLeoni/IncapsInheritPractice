package app;

import app.Employee;
import app.Car;

public class Main {
    public static void main(String[] args) {

        createEmployeeObject("firstName", "patronymicName", "lastname",
                "position", "email", "+380(44)000-00-00", 20);

        createCarObjectAndCallStartMethod();

    }

    public static void createEmployeeObject(String firstName, String patronymicName, String lastname,
                                            String position, String email, String phone, int numYearsOld) {

        Employee employee = new Employee(firstName, patronymicName, lastname, position, email, phone, numYearsOld);
    }

    public static void createCarObjectAndCallStartMethod() {
        Car car = new Car();
        car.start();
    }

}
