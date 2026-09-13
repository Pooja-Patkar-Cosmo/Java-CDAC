class Student {
    String name;
    int roll_no;
    String phone_no;
    String address;

    public static void main(String args[]){

        Student stud = new Student();
        stud.name = "John";
        stud.roll_no = 2;

        Student s1 = new Student();
        s1.name= "Sam";
        s1.roll_no = 1;
        s1.phone_no = "9468593707";
        s1.address = "Kharghar";

        Student s2 = new Student();
        s2.name= "John";
        s2.roll_no = 2;
        s2.phone_no = "9680423908";
        s2.address = "Kharghar";

        System.out.println("Student 1 :" );
        System.out.println("Name :" + s1.name + " | Rollno: " + s1.roll_no + " | Phone No : " + s1.phone_no + " | Address : " + s1.address + "\n");

        System.out.println("Student 2 :" );
        System.out.println("Name :" + s2.name + " | Rollno: " + s2.roll_no + " | Phone No : " + s2.phone_no + " | Address : " + s2.address);

       
        
    }
    
}

