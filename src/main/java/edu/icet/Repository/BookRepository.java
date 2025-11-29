package edu.icet.Repository;

import edu.icet.config.HibernateBookUtil;
import edu.icet.model.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    SessionFactory sessionFactory= HibernateBookUtil.getSessionFactory();
    Session session= sessionFactory.openSession();

    public void addMember(Book book) {
        Transaction transaction=session.beginTransaction();
        session.persist(book);
        transaction.commit();
    }


    public List<Book> getAll() {
        Transaction transaction=session.beginTransaction();
        List<Book> bookList=new ArrayList<>();
        bookList= session.createQuery("FROM Book", Book.class).list();
        transaction.commit();

        return bookList;

    }
}
