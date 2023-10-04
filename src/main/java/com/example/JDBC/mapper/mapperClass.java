package com.example.JDBC.mapper;
import com.example.JDBC.model.employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class mapperClass implements RowMapper <employee> {

    @Override
    public employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary"));
    }
}
