package ma.xproce.d_s_student.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StudentDTO {
    private String name;
    private String email;
    private LocalDate dateNaissance;

}
