package app;

 import app.Employee;
 import app.Car;

public class Main {
    public static void main(String[] args) {

      Employee employee = new Employee("firstName","patronymicName","lastname",
                                      "position","email","+380(44)000-00-00",20);

      Car car = new Car();
      car.Start();

      //не доступне
      //car.startElectricity();


    }
}
