package com.cydeo.bootstrap;

import com.cydeo.entitity.Car;
import com.cydeo.entitity.Department;
import com.cydeo.entitity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;

    private final EmployeeRepository employeeRepository;

    private final DepartmentRepository departmentRepository;

    public DataGenerator(CarRepository carRepository, EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.carRepository = carRepository;
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();

        List<Department> departmentList = new ArrayList<>();


        Car car1 = new Car("BMW","M3");
        Car car2 = new Car("Audi","Q7");
        Car car3 = new Car("Mercedes","GClass");

        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);

        Employee employee1 = new Employee("Smith","ar","smith@gmail.com", LocalDate.of(2020,9,19), Gender.MALE,10000);
        Employee employee2 = new Employee("Ahmet","ar","Ahmet@gmail.com", LocalDate.of(2020,9,19), Gender.MALE,10000);
        Employee employee3 = new Employee("Cameron","Colin","Cameron@gmail.com", LocalDate.of(2020,9,19), Gender.MALE,10000);

        Department department1 = new Department("QA ENgineer","IT");
        Department department2 = new Department("HR","HR");
        Department department3 = new Department("DEv","IT");


        employeeList.addAll(Arrays.asList(employee1,employee2,employee3));

        departmentList.addAll(Arrays.asList(department1,department2,department3));

       employeeRepository.saveAll(employeeList);

       departmentRepository.saveAll(departmentList);






    }
}
