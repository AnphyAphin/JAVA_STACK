class Parent {
    private void display() {
        System.out.println("Parent's private display method");
    }

    public void show() {
        System.out.println("Parent's public show method");
    }
}

class Child extends Parent {
    ////////////////////////////////////////////////////////////////
    // This is NOT overriding, it's a new method
    private void display() {
        System.out.println("Child's private display method");
    }

    @Override
    public void show() {
        System.out.println("Child's overridden show method");
    }
}

public class PrivateOverrideDemo {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        // obj.display(); Error: display() is private, not accessible

        Parent parentObj = new Parent();
        parentObj.show();
        // parentObj.display(); Are accessible only inside the same class
    }
}