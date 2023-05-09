package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		/*
		 * Student student=new Student(3,"Rajnish Singh","Bhopal"); int
		 * i=studentDao.insert(student); System.out.println(i);
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while (go) {
			System.out.println("Press 1 for add new studnet");
			System.out.println("Press 2 for display all studnet");
			System.out.println("Press 3 for get details of studnets");
			System.out.println("Press 4 for delete studnets");
			System.out.println("Press 5 for update studnets");
			System.out.println("Press 6 for exit");

			try {
				int input=Integer.parseInt(br.readLine());
				if(input==1)
				{
					//add new students
				}
				else if(input==2)
				{
					//display students
				}
				switch(input)
				{
				case 1:
					System.out.println("Enter User Id");
					int uId=Integer.parseInt(br.readLine());
					
					System.out.println("Enter User Name");
					String uName=br.readLine();
					
					System.out.println("Enter User City");
					String uCity=br.readLine();
					
					Student s=new Student();
					s.setId(uId);
					s.setName(uName);
					s.setCity(uCity);
					
					int r=studentDao.insert(s);
					System.out.println(r + "Student Added Successfully...");
					System.out.println("***********************************");
					System.out.println();
					
				break;
				
				case 2:
					System.out.println("***********************************");
					List<Student> allStudents=studentDao.getAllStudent();
					for(Student st:allStudents)
					{
						System.out.println("Id:" + st.getId());
						System.out.println("Name:" + st.getName());
						System.out.println("City:" + st.getCity());
						System.out.println("***********************************");
					}
					break;
					
				case 3:
					System.out.println("***********************************");
					System.out.println("Enter User Id");
					int userId=Integer.parseInt(br.readLine());
					Student student=studentDao.getStudent(userId);
					System.out.println("Id:" + student.getId());
					System.out.println("Name:" + student.getName());
					System.out.println("City:" + student.getCity());
					System.out.println("***********************************");
					break;
					
				case 4:
					System.out.println("Enter User Id");
					int Id=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(Id);
					System.out.println("Student deleted.....");
					System.out.println("***********************************");
					break;
					
				case 5:
					System.out.println("Enter User Id");
					int IdUp=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(IdUp);
					System.out.println("Student updated.....");
					System.out.println("***********************************");
					break;
				
				case 6:
					go = false;
					break;
					
					
				}

			} catch (Exception e) {
				System.out.println("invalid entry try with another one");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thank you for using my application...");

	}
}
