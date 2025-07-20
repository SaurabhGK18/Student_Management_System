import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private Connection conn;

    public StudentDAO() throws Exception {
        conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/student_db", "root", "your_password");
    }

    public void addStudent(Student student) throws Exception {
        String sql = "INSERT INTO students (name) VALUES (?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, student.getName());
        stmt.executeUpdate();
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> students = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            students.add(new Student(rs.getInt("id"), rs.getString("name")));
        }
        return students;
    }

    public void deleteStudent(int id) throws Exception {
        String sql = "DELETE FROM students WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }

    public void updateStudentName(int id, String newName) throws Exception {
        String sql = "UPDATE students SET name=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, newName);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }
}
