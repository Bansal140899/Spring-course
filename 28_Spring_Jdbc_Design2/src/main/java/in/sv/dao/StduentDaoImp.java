package in.sv.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import in.sv.beans.Student;

public class StduentDaoImp extends JdbcDaoSupport implements StudentDao {

	
	
	

	

	@Override
	public boolean addStdDaodetails(Student std) {
		boolean status = false;
		String sql_query = "insert into student values(? ,? ,?)";
		
		int count = getJdbcTemplate().update(sql_query ,std.getRoll() ,std.getName() ,std.getCity());
		if(count > 0) {
			status = true;
		}else {
			status = false;
		}
		return status;
	}

}
