package chapter08;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
//        Student[] students = manageStudent.addStudent();
//        manageStudent.printStudents(students);
        manageStudent.checkEquals();
    }

    public Student[] addStudent(){
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul","010101001","asd@kasldfjsafl.com");
        return students;
    }

    public void printStudents(Student... students){
        for(Student student : students){
            System.out.println(student.toString());
        }
    }

    public void checkEquals(){
        Student a = new Student("min", "seoul", "01010101010", "asd@asd.com");
        Student b = new Student("min", "seoul", "01010101010", "asd@asd.com");

        if(a.equals(b)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
