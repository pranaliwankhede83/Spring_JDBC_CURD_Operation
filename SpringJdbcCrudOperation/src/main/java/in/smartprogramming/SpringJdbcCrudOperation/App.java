package in.smartprogramming.SpringJdbcCrudOperation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.smartprogramming.bean.Student;
import in.smartprogramming.mapper.StudentRowMapper;
import in.smartprogramming.resources.SpringConfigurationFile;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationFile.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		// -----------------Insert Query------------------

		/*
		 * int roll_no = 105; String name = "pragati"; float marks = 54.2f;
		 * 
		 * String insert_sql_query = "Insert into student values(?,?,?)"; int count =
		 * jdbcTemplate.update(insert_sql_query, roll_no, name, marks);
		 * 
		 * if (count > 0) { System.out.println("Insertion successful"); } else {
		 * System.out.println("Insertion failed"); }
		 */

		// ---------------update Query---------------

		/*
		 * int roll_no = 102; float marks= 91.3f; String update_sql_query =
		 * "update student set std_marks=? where std_roll=?"; int count1 =
		 * jdbcTemplate.update(update_sql_query,marks, roll_no);
		 * 
		 * if(count1>0) { System.out.println("Updation successful"); } else {
		 * System.out.println("Updation failed"); }
		 */

		// ----------------Delete Query------------------

		//int roll_no = 102;

		/*
		 * String delete_sql_query = "delete from student where std_roll=?";
		 * 
		 * int count2 = jdbcTemplate.update(delete_sql_query, roll_no);
		 * 
		 * if (count2 > 0) { System.out.println("Deletion successful"); } else {
		 * System.out.println("Deletion failed"); }
		 */
		
		//---------------Select Query---------------------
		
		/*
		 * String select_sql_query = "select * from student"; List<Student> std_list =
		 * jdbcTemplate.query(select_sql_query, new StudentRowMapper() );
		 * 
		 * for(Student std : std_list) {
		 * 
		 * System.out.println("Roll No.:->"+std.getRoll_no());
		 * System.out.println("Name:->"+std.getName());
		 * System.out.println("Marks:->"+std.getMarks());
		 * System.out.println("----------------------------------------"); }
		 */
		//---------------Select Query for getting single object---------------------
		
		/*
		 * int roll_no=101; String select_sql_query =
		 * "select * from student where std_roll=?"; List<Student> std_list =
		 * jdbcTemplate.query(select_sql_query, new StudentRowMapper(), roll_no );
		 * 
		 * for(Student std : std_list) {
		 * 
		 * System.out.println("Roll No.:->"+std.getRoll_no());
		 * System.out.println("Name:->"+std.getName());
		 * System.out.println("Marks:->"+std.getMarks());
		 * System.out.println("----------------------------------------"); }
		 */
		
		//---------------Select Query for getting single object---------------------
		
		int roll_no=103;
		String select_sql_query = "select * from student where std_roll=?";
		Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), roll_no );
		
		
			System.out.println("Roll No.:->"+std.getRoll_no());
			System.out.println("Name:->"+std.getName());
			System.out.println("Marks:->"+std.getMarks());
			
		
	}
}
