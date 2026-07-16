class Student {

    // Data members
    int id;
    String name;

    // 1. Default Constructor
    Student() {
        id = 0;
        name = "Not Assigned";
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
    }

    // 3. Copy Constructor
    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        System.out.println("Copy Constructor Called");
    }

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println("\nStudent 1 Details:");
        s1.display();

        Student s2 = new Student(177, "Sharik");
        System.out.println("\nStudent 2 Details:");
        s2.display();

        Student s3 = new Student(s2);
        System.out.println("\nStudent 3 Details (Copied from Student 2):");
        s3.display();
    }
}