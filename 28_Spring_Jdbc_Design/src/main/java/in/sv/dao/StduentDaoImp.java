package in.sv.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import in.sv.beans.Student;

public class StduentDaoImp implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean addStdDaodetails(Student std) {
		boolean status = false;
		String sql_query = "insert into student values(? ,? ,?)";
		
		int count = jdbcTemplate.update(sql_query ,std.getRoll() ,std.getName() ,std.getCity());
		if(count > 0) {
			status = true;
		}else {
			status = false;
		}
		return status;
	}

}
