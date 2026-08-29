final class Constants {
    static final double PI = 3.14159;
}

class Parent {
    final void show() {
        System.out.println("This method cannot be overridden");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        final int age = 24;
        System.out.println("Age: " + age);
        System.out.println("PI: " + Constants.PI);

        Parent p = new Parent();
        p.show();
    }
}
