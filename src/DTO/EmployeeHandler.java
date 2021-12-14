package DTO;

public class EmployeeHandler<N>{
    public  N Employee;

    public EmployeeHandler(N employee) {
        Employee = employee;
    }

    public N getEmployee() {
        return Employee;
    }
}
