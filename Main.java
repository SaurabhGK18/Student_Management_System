import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Update Student\n4. Delete Student\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    dao.addStudent(new Student(name));
                    break;
                case 2:
                    for (Student s : dao.getAllStudents()) {
                        System.out.println(s.getId() + ": " + s.getName());
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    dao.updateStudentName(idToUpdate, newName);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int idToDelete = sc.nextInt();
                    dao.deleteStudent(idToDelete);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
