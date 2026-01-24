
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student ob1 = new Student("Biplab Jana", 20, 85);
       

        Student ob2 = new Student( "Annapurna Bera", 22, 90);
        Student ob3 = new Student( "Sourav Das", 21, 88);
       
        Student[] students = new Student[3];
        students[0] = ob1;
        students[1] = ob2;
        students[2] = ob3;
        for (int i = 0; i < students.length; i++) {
            
            System.out.println(students[i]);
        }
        // use enhanced for loop
        System.out.println("Using enhanced for loop:");
        for(Student stu : students) {
            System.out.println(stu);
        }
// another way to create array of objects
System.out.println("------------------------------");
// call an anononymous array of objects
        Student[] students2 = {
            new Student("Rohit Sharma", 23, 92),
            new Student("Virat Kohli", 24, 95),
            new Student("MS Dhoni", 25, 89)
        };
        System.out.println("Array created using another way:");
        for(Student stu : students2) {
            System.out.println(stu);
        }
      
        
    }
}

class Student {
  private String newName;
    private int age;
  private int marks;
    Student(String newName, int age, int marks) {
        this.newName = newName;
        this.age = age;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [name=" + newName + ", age=" + age + ", marks=" + marks + "]";
    }
}
