package com.capgemini.ntc.database.core;

import com.capgemini.ntc.test.core.logger.BFLogger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;

public class DriverManager {

	private static EntityManagerFactory emf;

	public static EntityManager createEntityManager(String dbPrefix) {
		BFLogger.logInfo("Creating entity manager for database unit name: " + dbPrefix);
		return getEntityManagerFactory(dbPrefix).createEntityManager();
	}

	private static EntityManagerFactory getEntityManagerFactory(String dbPrefix) {
		return emf != null ? emf : Persistence.createEntityManagerFactory(dbPrefix);
	}

}