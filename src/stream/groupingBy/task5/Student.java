package stream.groupingBy.task5;

public class Student {
    private String name;
    private int age;
    private int courseId;

    public Student(String name, int age, int courseId) {
        this.name = name;
        this.age = age;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
