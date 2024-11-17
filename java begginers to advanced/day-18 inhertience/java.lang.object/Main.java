public class Main {
    public static void main(String[] args) {
        Student stud = new Student("harshad", 21);
        System.out.println(stud);

        primaryStudent student1 = new primaryStudent("karana", 18, "hadhds");
        System.out.println(student1);
    }
}

class Student {
    private String Name;
    private int Age;

    public Student(String name, int age) {
        Name = name;
        Age = age;
    }

    public String toString() {
        return "Name:" + Name + " age:" + Age;
    }

}

class primaryStudent extends Student {
    private String ParentName;

    public primaryStudent(String name, int age, String parent) {
        super(name, age);
        ParentName = parent;
    }

    @Override
    public String toString() {
        return "parent:" + ParentName + super.toString();// you want parent class method use super.method name
    }

}
