package az.developia.studentManagementSystem.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import az.developia.studentManagementSystem.entity.Book;
import az.developia.studentManagementSystem.entity.Student;
import az.developia.studentManagementSystem.exception.MyRuntimeException;

public class StudentRepository {

	public void addStudent(Student student) throws MyRuntimeException {

		try {
			if (student.getName().length() > 45) {
				throw new MyRuntimeException("name too long");

			}
			String query = "insert into students(name,surname,age,username,password) values('" + student.getName()
					+ "','" + student.getSurname() + "','" + student.getAge() + "','" + student.getUsername() + "','"
					+ student.getPassword() + "')";
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root",
					"1234");
			Statement st = connect.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean login(String username, String password) {

		boolean userIsExists = false;

		String query = "SELECT COUNT(*) FROM students WHERE username = '" + username + "' AND password = '" + password
				+ "'";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root",
					"1234");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			userIsExists = rs.getInt(1) == 1 ? true : false;
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return userIsExists;
	}

	public boolean checkUser(String username) {

		boolean exists = false;

		try {
			String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
			String dbUser = "root";
			String dbPassword = "1234";

			Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);

			Statement st = conn.createStatement();

			String sql = "SELECT COUNT(*) FROM students WHERE username = '" + username + "'";

			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				exists = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return exists;

	}

	private final String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
	private final String user = "root";
	private final String password = "1234";

	public void addBook(Book book) {
		String sql = "INSERT INTO books (title, author, publication_year, register_date) VALUES ('"+book.getTitle()+"',.,...,...)";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement ps = conn.createStatement()) {

			
			ps.executeUpdate(sql);
			System.out.println("Book əlavə olundu!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}