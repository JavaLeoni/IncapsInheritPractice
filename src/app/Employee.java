package app;

public class Employee {
    private String firstName;
    private String patronymicName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int numYearsOld;

    public Employee(String firstName, String patronymicName, String lastName, String position, String email, String phone, int numYearsOld) {
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.numYearsOld = numYearsOld;
    }

    @Override
    public String toString() {
        return  "ім'я: " + firstName + ", " +
                "по батькові: " + patronymicName + ", " +
                "прізвище: " + lastName + ", " +
                "посада: " + position + ", " +
                "e-mail: " + email + ", " +
                "контактний телефон: " + phone + ", " +
                "вік: " + numYearsOld;
    }

}
