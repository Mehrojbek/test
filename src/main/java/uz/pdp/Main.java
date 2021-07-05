package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.model.Course;
import uz.pdp.model.Student;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("uz.pdp");
        context.refresh();
        Student student = context.getBean(Student.class);
        Course course = context.getBean(Course.class);

    }
}
