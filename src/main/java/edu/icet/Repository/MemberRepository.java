package edu.icet.Repository;

import edu.icet.config.HibernateUtil;
import edu.icet.model.entity.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MemberRepository {


    SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    Session session= sessionFactory.openSession();



    public List<Member> getAll() {


    }

    public void addMember(Member member) {
        Transaction transaction=session.beginTransaction();
        session.persist(member);
        transaction.commit();

    }
}
