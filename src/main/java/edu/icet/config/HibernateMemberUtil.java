package edu.icet.config;

import edu.icet.model.entity.Member;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateMemberUtil {

    private static SessionFactory sessionFactory;
    private static Configuration config = new Configuration();

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            config.configure();
            config.addAnnotatedClass(Member.class);

            sessionFactory = config.buildSessionFactory();
        }
        return sessionFactory;
    }



}
