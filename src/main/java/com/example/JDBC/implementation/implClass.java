package com.example.JDBC.implementation;

import com.example.JDBC.Repo.EmployeeRepo;
import com.example.JDBC.mapper.mapperClass;
import com.example.JDBC.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class implClass implements EmployeeRepo {
    @Autowired
    private JdbcTemplate jdbctemp;
    @Override
    public int countEmplyess() {
        return jdbctemp.queryForObject("select count(*) from employee", Integer.class);
    }
    @Override
    public void insertEmp(employee emp) {
        jdbctemp.update("insert  into employee (id, name, salary) values(?,?,?)",
                new Object[]{emp.getID(),emp.getName(),emp.getSalary()});
        //(?) Bind variable
    }
    @Override
    public employee search(int id) {
        return jdbctemp.queryForObject("select * from employee where id=?", new Object [] {id},
                new mapperClass());
    }
    @Override
    public int update(employee empp) {
        return jdbctemp.update("update employee set name=?, salary=? , " +
                "new Object[] {empp.getName, empp.getSalary}");
    }
    @Override
    public int delete(int id) {
        return jdbctemp.update("delete from employee where id=?",
                new Object[] {id}) ;
    }
}
