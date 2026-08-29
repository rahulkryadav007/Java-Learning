class Teacher {
    String name = "Mr. Sharma";
}

class Department {
    // Aggregation: Teacher can exist independently of Department.
    private Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }

    void showTeacher() {
        System.out.println("Teacher: " + teacher.name);
    }
}

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    // Composition: Car creates and owns its Engine.
    private final Engine engine = new Engine();

    void startCar() {
        engine.start();
        System.out.println("Car starts");
    }
}

public class BasicExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Department department = new Department(teacher);
        department.showTeacher();

        Car car = new Car();
        car.startCar();
    }
}
