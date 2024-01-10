package com.example.thi.repository;

import com.example.thi.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    @Override
    public List<Employee> showListEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee\n" +
                    "join department\n" +
                    "on department.id_d = employee.id_department;");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer idEmployee = resultSet.getInt("id_e");
                String name = resultSet.getString("name_e");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("tele_phone");
                Integer salary = resultSet.getInt("salary");
                Integer idDepartment = resultSet.getInt("id_department");
                String nameDepartment = resultSet.getString("name_d");
                Employee employee = new Employee(idEmployee, name, email, address, phoneNumber, salary, idDepartment, nameDepartment);
                employeeList.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }

    @Override
    public void createEmpl(Employee employee) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO `employee` (`name_e`, `email`, `address`, `tele_phone`, `salary`) VALUES (?, ?, ?, ?,?);");
            statement.setString(1, employee.getName());
            statement.setString(2, employee.getEmail());
            statement.setString(3, employee.getAddress());
            statement.setString(4, employee.getPhoneNumber());
            statement.setInt(5, employee.getSalary());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void deleteEmpl(int idEmpl) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM `employee` WHERE (`id_e` = ?);");
            statement.setInt(1, idEmpl);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Employee> searchEmp(String search) {
        Connection connection = DBConnection.getConnection();
        List<Employee> employeeList = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("select * from `employee` where `name_e` like ?;");
            statement.setString(1, "%" + search + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer idEmployee = resultSet.getInt("id_e");
                String name = resultSet.getString("name_e");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phoneNumber = resultSet.getString("tele_phone");
                Integer salary = resultSet.getInt("salary");
                Integer idDepartment = resultSet.getInt("id_department");
                String nameDepartment = resultSet.getString("name_d");
                Employee employee = new Employee(idEmployee, name, email, address, phoneNumber, salary, idDepartment, nameDepartment);
                employeeList.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
