package com.spring.jdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
    	// spring JDBC
    	// insert operation
        System.out.println( "My program started" );
        
        // Spring JDBC --> JDBC template --> implementation code 
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springjdbc/config.xml");
        // we need to say hello to the JDBC template 
       // JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        // insert query
        
     //   String query = "insert into student (id, name , city) values (?,?,?)";
        // fire query 
        
       // int result = template.update(query,104, "Shivam", "Bangalore");
      //  System.out.println("Number of record inserted :" + result);
          StudentDao studentDao  =context.getBean("studentDao", StudentDao.class);
          Student student = new Student();
          student.setId(123 );
          student.setName("Archi");
          student.setCity("Pune");
          
          int display = studentDao.insert(student);  
          System.out.println("Student record inserted : "+ display);
          
          student.setId(110);
          student.setName("Machines");
          student.setCity("Nagpur");
          int update = studentDao.change(student);
          System.out.println("One record updated : " + update);
          
          // delete 
          int delete = studentDao.delete(103);
          System.out.println("One record deleted : " + delete);
          
          Student studentOne = studentDao.getStudent(100);
          System.out.println("Get Student by Id : "+ studentOne);
          
          List<Student> students = studentDao.getAllStudents();
          for (Student displayObj: students) {
        	  System.out.println(displayObj);
          }
          ((ClassPathXmlApplicationContext) context).close(); 
        
    }
}
