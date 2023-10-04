package com.example.JDBC.Repo;

import com.example.JDBC.model.employee;

public interface EmployeeRepo {
    int countEmplyess();
    void insertEmp(employee emp);
    employee search(int id);
    int update(employee empp);
    int delete(int id );

}
