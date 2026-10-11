package DB;

import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
