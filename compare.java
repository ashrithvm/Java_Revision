import java.util.*;

class Student implements Comparable<Student>{
    private final int id;
    private final String name;
    private final int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getStudentId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student [ID="+this.id+", Name="+this.name+", Age="+this.age+"]";
    }

    @Override
    public int compareTo(Student other){
        return this.id - other.id;
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.getAge()-s2.getAge();
    }
}

public class compare{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(102, "Alice", 22));
        students.add(new Student(101, "Bob", 20));
        students.add(new Student(103, "Charlie", 21));

        students.sort(new NameComparator());
        System.out.println(students);

        System.out.println();

        students.sort(new AgeComparator());
        System.out.println(students);
    }
}