package com.techdenovo.japps.dao;

import com.techdenovo.japps.model.Student;
import com.techdenovo.japps.utils.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
   DbUtil dbUtil = new DbUtil();

   public List<Student> getAllStudents() {
      List<Student> studentList = new ArrayList<>();
      Connection con = dbUtil.getDbConnection();
      String query = "SELECT * FROM STUDENTS";
      if (con != null) {
         try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Student student = new Student();
               student.setId(rs.getInt("ID"));
               student.setName(rs.getString("NAME"));
               student.setCollegeName(rs.getString("COLLEGE_NAME"));
               studentList.add(student);


            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return studentList;
   }

}
