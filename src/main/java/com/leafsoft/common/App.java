package com.leafsoft.common;

import org.hibernate.Session;
import com.leafsoft.persistance.HibernateUtil;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("837334");
        stock.setStockName("sure3s33hdsa");

        session.save(stock);
        session.getTransaction().commit();
    }
}