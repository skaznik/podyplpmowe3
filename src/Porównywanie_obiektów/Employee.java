package Porównywanie_obiektów;

import java.util.Objects;

public class Employee {
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && //tutaj są warunki porównania - jeśli nie potrzebne - usunąć
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }


}
