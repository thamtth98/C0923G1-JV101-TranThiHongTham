package com.example.democ09.controller;

import com.example.democ09.model.Person;
import com.example.democ09.service.IPersonService;
import com.example.democ09.service.impl.PersonService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PersonController", value = "/person")
public class PersonController extends HttpServlet {

    private IPersonService personService = new PersonService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                deletePersonById(req, resp);
                break;
            case "showFormEdit":
                int id = Integer.parseInt(req.getParameter("personId"));
                Person person = this.personService.findById(id);
                req.setAttribute("person", person);
                req.getRequestDispatcher("person/edit.jsp").forward(req, resp);
                break;
            default:
                showListPersons(req, resp);
                break;
        }
    }

    private void deletePersonById(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("personId"));
        this.personService.deleteById(id);
        resp.sendRedirect("/person");
    }

    private void showListPersons(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Person> personList = this.personService.findAll();
        req.setAttribute("personList", personList);
        req.getRequestDispatcher("person/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                updatePerson(req, resp);
                break;
            default:
                showListPersons(req, resp);
                break;
        }
    }

    private void updatePerson(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int personId = Integer.parseInt(req.getParameter("personId"));
        String lastName = req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        Person person = new Person(personId, lastName, firstName, address, city);
        this.personService.updatePerson(person);
        resp.sendRedirect("/person");
    }
}
