package in.sv.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import in.sv.beans.Employee;


@Repository
public class StduentDaoImp  implements StudentDao {

	
	
	
 @Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean addStdDaodetails(Employee std) {
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
