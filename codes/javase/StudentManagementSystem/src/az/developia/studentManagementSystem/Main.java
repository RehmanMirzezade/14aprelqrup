package az.developia.studentManagementSystem;

import java.time.LocalDateTime;

import az.developia.studentManagementSystem.entity.Book;
import az.developia.studentManagementSystem.entity.Student;
import az.developia.studentManagementSystem.exception.MyRuntimeException;
import az.developia.studentManagementSystem.repository.StudentRepository;

public class Main {
public static void main(String[] args) {
	Student stu = new Student(null,"Rehman","Mirzezade",12,"Rehman","rehman1234");
	StudentRepository s = new StudentRepository();
	try{
		if(s.checkUser(stu.getUsername())) {
		s.addStudent(stu);
		}else {
			System.out.println("Bu istifadeci artiq var!");
		}
	}catch(MyRuntimeException e){
		System.out.println(e.getMessage());
	}
	 Book book = new Book(
             null,
             "Java Basics",
             "James Gosling",
             2020,
             LocalDateTime.now()
     );

     StudentRepository repo = new StudentRepository();
     repo.addBook(book);
}
}
