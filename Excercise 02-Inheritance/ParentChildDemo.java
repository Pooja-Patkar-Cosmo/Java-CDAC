class ParentClass {
    public void printParentMessage() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    public void printChildMessage() {
        System.out.println("This is child class");
    }
}

public class ParentChildDemo {
    public static void main(String[] args) {
        // 1 - Method of parent class by object of parent class
        ParentClass parentObj = new ParentClass();
        parentObj.printParentMessage();

        // 2 - Method of child class by object of child class
        ChildClass childObj = new ChildClass();
        childObj.printChildMessage();

        // 3 - Method of parent class by object of child class
        childObj.printParentMessage();
    }
}
