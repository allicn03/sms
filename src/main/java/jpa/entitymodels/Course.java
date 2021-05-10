package jpa.entitymodels;

import lombok.*;
import lombok.experimental.FieldDefaults;

//import javax.persistence.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor

public class Course {
    //fields
    int cId;
    String cName;
    String cInstructorName;

}