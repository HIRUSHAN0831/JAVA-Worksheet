package LW_05;
import java.util.ArrayList;

abstract class UniversityMember {
    private String name;
    public UniversityMember(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void displayInfo();
}

class Lecturer extends UniversityMember {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching = new ArrayList<>();

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        for (Course c : coursesTeaching) {
            c.displayInfo();
        }
    }

    public void displayDepartmentInfo() {
        if (department != null) department.displayInfo();
    }

    public void displayInfo() {
        System.out.println("Lecturer: " + getName() + ", Position: " + position);
    }
}

class Undergraduate extends UniversityMember {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled = new ArrayList<>();

    public Undergraduate(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null) degree.displayInfo();
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled() {
        for (Course c : coursesEnrolled) {
            c.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Undergraduate: " + getName() + ", ID: " + studentID + ", Year: " + year);
    }
}

class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering = new ArrayList<>();

    public Degree(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void listCoursesOffering() {
        for (Course c : coursesOffering) {
            c.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Degree: " + name + ", Students: " + numberOfStudents);
    }
}

class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering = new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) departmentHead.displayInfo();
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
    }
}

class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }

    public void removeLecturerInCharge() {
        this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }

    public void displayInfo() {
        System.out.println("Course: " + name + ", EnrollType: " + enrollType + ", Students: " + numberOfStudentsEnrolled);
    }
}

public class Q02 {
    public static void main(String[] args) {
        Department dept = new Department("Software Engineering");
        Degree degree = new Degree("Computer Science", 120);
        Course course = new Course("Object-Oriented Programming", "Full-time", 60);
        Lecturer lecturer = new Lecturer("Dr. Kasun", "Senior Lecturer", dept);
        Undergraduate student = new Undergraduate("Hiru", "ST123", "2nd Year", degree);

        dept.appointDepartmentHead(lecturer);
        dept.addLecturer(lecturer);
        dept.offerCourse(course);

        degree.offerCourse(course);
        course.addLecturerInCharge(lecturer);
        course.addDegreeBelongsTo(degree);

        lecturer.addCourse(course);
        student.enrollCourse(course);

        lecturer.displayInfo();
        lecturer.listCoursesTeaching();
        lecturer.displayDepartmentInfo();

        student.displayInfo();
        student.displayDegreeInfo();
        student.listCoursesEnrolled();

        degree.displayInfo();
        degree.listCoursesOffering();

        dept.displayInfo();
        dept.displayDepartmentHeadInfo();
    }
}
