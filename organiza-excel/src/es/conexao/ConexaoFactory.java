package es.conexao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

public final class ConexaoFactory {
	private static ConexaoFactory conexao = null;

	public static ConexaoFactory controlarInstancia() {
		if (conexao == null) {
			conexao = new ConexaoFactory();
		}
		return conexao;
	}

}
