package in.sv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.sv.bean.Student;
import in.sv.dbcon.DbConnection;

public class StudentDaoImp implements StudentDao {

	@Override
	public boolean addStudentdetails(Student student) {

		Connection con = null;
		boolean status;

		try {

			con = DbConnection.getConnection();

			PreparedStatement ps = con.prepareStatement(
					"insert into student values(?,?,?)"
			);

			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setString(3, student.getCity());

			int count = ps.executeUpdate();

			if (count > 0) {
				status = true;
			} else {
				status = false;
			}

		} catch (Exception e) {

			status = false;
			e.printStackTrace();

		}

		return status;
	}
}