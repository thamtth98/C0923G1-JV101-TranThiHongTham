package com.example.product_manage.repository;

import com.example.product_manage.model.Product;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Product> showList() {
        List<Product> products = entityManager.createQuery("select s from product s", Product.class).getResultList();
        return products;
    }

    @Override
    public void saveProduct(Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(int id) {
        String queryS = "SELECT s FROM product s WHERE s.id = :id";
        TypedQuery<Product> query = entityManager.createQuery(queryS, Product.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void update(Integer id, Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(product);
        entityTransaction.commit();

    }

    @Override
    public void deleted(Product product) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> findByName(String searchName) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        String queryS = "SELECT s FROM product s WHERE s.name = :searchName";
        TypedQuery<Product> query = entityManager.createQuery(queryS, Product.class);
        query.setParameter("searchName", searchName);
        List<Product> products = query.getResultList();
        entityTransaction.commit();
        return products;
    }
}
