package com.example.JDBC.config;

import com.example.JDBC.Repo.EmployeeRepo;
import com.example.JDBC.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class startUp implements CommandLineRunner {
    @Autowired
    JdbcTemplate jdbcTemp;
    @Autowired
    EmployeeRepo emp;
    @Override
    public void run(String... args) throws Exception {
       // jdbcTemp.execute("create table employee (id SERIAL, name VARCHAR(40), salary NUMERIC(15,2))");
        if(emp.countEmplyess()==0){
            emp.insertEmp(new employee(1,"Hanaa",400));
            emp.insertEmp(new employee(2,"Nora",500));
            emp.insertEmp(new employee(3,"Ali",600));
           // emp.countEmplyess();
            // emp.update(new employee());
            //emp.delete(4);
           // emp.delete(5);
            //emp.search(5);


        }




    }
}
