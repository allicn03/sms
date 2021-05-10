package jpa.entitymodels;

import lombok.*;
import lombok.experimental.FieldDefaults;

//import javax.persistence.*;
import java.util.List;

@Getter @Setter
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor

public class Student {
    //fields
    String sEmail;
    String sName;
    String sPass;
    List<Student> sCourses;

    public void getStudentPassword() {

    }

    public String getStudentByEmail() {
        return null;
    }
}


