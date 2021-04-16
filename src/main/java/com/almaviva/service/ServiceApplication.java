package com.almaviva.service;

import com.almaviva.service.persistence.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
@EntityScan({"com.almaviva.service.persistence.model"})
public class ServiceApplication {

	private static SessionFactory factory;

	public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);


//			StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//
//			Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//			LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
//			SessionFactory factory = localSessionFactoryBean.getObject();
//
//			//SessionFactory factory = meta.getSessionFactoryBuilder().build();
//			Session session = factory.openSession();
//			Transaction t = session.beginTransaction();
//
//			Person person = new Person();
//			person.setFirstName("Mario");
//			person.setLastName("Rossi");
//
//			session.save(person);
//			t.commit();
//			System.out.println("successfully saved");
//			factory.close();
//			session.close();

//			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("testPerson");
//			EntityManager entityManager = entityManagerFactory.createEntityManager();
//			entityManager.getTransaction().begin();
//			entityManager.persist(person);
//			entityManager.getTransaction().commit();



	}
}
