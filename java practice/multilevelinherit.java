class Person {
String name;
void displayName() {
System.out.println("Name: " + name);
}
}

class Student extends Person {
int rollNo;
void displayRoll() {
System.out.println("Roll No: " + rollNo);
}
}

class CollegeStudent extends Student {
String course;
void displayCourse() {
System.out.println("Course: " + course);
}
}

public class multilevelinherit{
public static void main(String[] args) {
CollegeStudent sc = new CollegeStudent();
sc.name = "Hareesh";
sc.course = "CSE";
sc.rollNo = 12;
sc.displayName();
sc.displayRoll();
sc.displayCourse();
}
}