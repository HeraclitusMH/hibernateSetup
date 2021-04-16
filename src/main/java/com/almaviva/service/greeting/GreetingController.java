package com.almaviva.service.greeting;

import com.almaviva.service.persistence.model.PersonMod;
import com.almaviva.service.persistence.model.Possedimenti;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @GetMapping("/testDB")
    public PersonMod person() {
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        PersonMod personMod = new PersonMod();
        personMod.setFirstNameMod("Mario");
        personMod.setLastNameMod("Rossi");
        personMod.setAnima(false);

        List<Possedimenti> possedimentiList = new LinkedList<>();
        Possedimenti possedimenti = new Possedimenti();
        possedimenti.setTipoPossedimenti("Schiave");
        possedimentiList.add(possedimenti);
        Possedimenti possedimenti2 = new Possedimenti();
        possedimenti2.setTipoPossedimenti("Lux");
        possedimentiList.add(possedimenti2);
        personMod.setPossedimentiList(possedimentiList);

        session.save(personMod);
        t.commit();
        System.out.println("successfully saved");

        Query<PersonMod> query = session.createQuery( "from com.almaviva.service.persistence.model.PersonMod");
        PersonMod personMod1 = query.list().get(0);

        session.close();

        return personMod1;
    }
}
