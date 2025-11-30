package edu.icet.Repository;

import edu.icet.config.HibernateMemberUtil;
import edu.icet.model.entity.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {


    SessionFactory sessionFactory= HibernateMemberUtil.getSessionFactory();
    Session session= sessionFactory.openSession();



    public List<Member> getAll() {
        List<Member> memberList=new ArrayList<>();

        Transaction transaction=session.beginTransaction();
        memberList= session.createQuery("FROM Member", Member.class).list();
        transaction.commit();

        return memberList;

    }

    public void addMember(Member member) {
        Transaction transaction=session.beginTransaction();
        session.persist(member);
        transaction.commit();

    }

    public void remove(String id) {
        Transaction transaction=session.beginTransaction();
        session.remove(session.find(Member.class,id));
        transaction.commit();
    }
}
