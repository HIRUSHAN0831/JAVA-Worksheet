package LW_03;


class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer; // Lecturer object

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

public class Q04 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. Kasun Madushanka");
        lecturer.setCourseTeaching("OOP Programming");

        Course course = new Course();
        course.setCourseName("Object-Oriented Programming");
        course.setCourseCode("ICT11043");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Hirushan Rajapaksha");
        student.setDegreeName("BSc (Hons) in Computer Science");
        student.setCourseFollowing(course.getCourseName());

        System.out.println("----- Course Registration Details -----");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());
        System.out.println("Lecturer Teaching: " + course.getLecturer().getCourseTeaching());
        System.out.println("---------------------------------------");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());
    }
}
