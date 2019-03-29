package com.evry.patient_management_system;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.evry.patient_management_system.Patient;
import com.evry.patient_management_system.InPatient;
import com.evry.patient_management_system.OutPatient;

/**
 * Hello world!
 *
 */
public class PatientManagement {
	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
		SessionFactory factory = meta.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Patient patient = new Patient();
		patient.setName("ABC");
		patient.setBill(876.88);

		InPatient inPatient = new InPatient();
		inPatient.setBed_no(101);
		inPatient.setNo_days(3);

		OutPatient outPatient = new OutPatient();
		outPatient.setNumber(5);

		session.persist(patient);
		session.persist(inPatient);
		session.persist(outPatient);
		transaction.commit();
		factory.close();
	}
}
