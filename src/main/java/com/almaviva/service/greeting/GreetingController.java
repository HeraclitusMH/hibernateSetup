package com.almaviva.service.greeting;

import com.almaviva.service.persistence.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public Person person() {
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

        Person person = new Person();
        person.setFirstName("Mario");
        person.setLastName("Rossi");

        session.save(person);
        t.commit();
        System.out.println("successfully saved");
        sessionFactory.close();
        session.close();


        return person;
    }
}
