package ru.junjavadev.dao;

import org.hibernate.SessionFactory;
import ru.junjavadev.domain.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
