package com.leafsoft.common;

import org.hibernate.Session;
import com.leafsoft.persistence.HibernateUtil;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("873334");
        stock.setStockName("s3ures33hdsa");

        session.save(stock);
        session.getTransaction().commit();
    }
}