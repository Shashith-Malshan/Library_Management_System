package edu.icet.Repository;

import edu.icet.config.HibernateUtil;
import edu.icet.model.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookRepository {

    SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    Session session= sessionFactory.openSession();

    public void addMember(Book book) {
        Transaction transaction=session.beginTransaction();
        session.persist(book);
        transaction.commit();
    }


}
