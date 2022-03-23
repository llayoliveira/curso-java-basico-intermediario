package com.layane.cursojava.aula46;

public interface SqlDML {
	void update(String query);
	void select(String query);
	void delete(String query);
	void insert(String query);
}
