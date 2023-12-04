package case_study.repository;

import case_study.models.person.Employee;

import java.util.List;

public interface IRepository<E>{
    List<E> display();
    E findId(String id);
    void add(E e);
    void delete(E e);
}
