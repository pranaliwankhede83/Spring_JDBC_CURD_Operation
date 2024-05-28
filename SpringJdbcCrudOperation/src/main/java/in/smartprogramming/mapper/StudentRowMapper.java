package in.smartprogramming.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.smartprogramming.bean.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		
		std.setRoll_no(rs.getInt("std_roll"));	
		std.setName(rs.getString("std_name"));
		std.setMarks(rs.getFloat("std_marks"));
		
		return std;
	}

}
