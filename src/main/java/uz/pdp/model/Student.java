package uz.pdp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Data

@Component
public class Student {
    private int id;
    private String firsName;
    private String lastName;
    private int birthYear;


}
