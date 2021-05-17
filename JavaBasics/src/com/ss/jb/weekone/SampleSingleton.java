package com.ss.jb.weekone;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SampleSingleton {

	private static Connection conn = null;
	private static SampleSingleton instance = null;

	private SampleSingleton() {
		
	}
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
}
