package app;

import app.Employee;
import app.Car;

public class Main {
    public static void main(String[] args) {

        Employee employee = createEmployeeObject("firstName", "patronymicName", "lastname",
                "position", "email", "+380(44)000-00-00", 20);
        outPutEmloyeeData(employee);


        Car car = createCarObject();
        car.start();
    }

    public static Employee createEmployeeObject(String firstName, String patronymicName, String lastname,
                                            String position, String email, String phone, int numYearsOld) {

        return new Employee(firstName, patronymicName, lastname, position, email, phone, numYearsOld);
    }

    public static void outPutEmloyeeData(Employee employee) {

        System.out.println(employee.toString() + "\n");
    }

    public static Car createCarObject() {
        return new Car();
    }

}
