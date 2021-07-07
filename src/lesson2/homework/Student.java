package lesson2.homework;



public class Student implements Comparable<Student> {
    String name;
    String lastName;
    int age;
    int course;
    int averageMark;

    public Student(String name, String lastName, int age, int course, int averageMark) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public int getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageMark=" + averageMark +
                '}' + "\n";
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getAverageMark(), averageMark);
    }



}
