package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data

@Component
public class Course {
    private int courseNumber;
    private String courseName;
    private String courseInfo;


}
