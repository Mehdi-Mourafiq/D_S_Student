package ma.xproce.d_s_student.web;

import lombok.AllArgsConstructor;
import ma.xproce.d_s_student.dto.StudentDTO;
import ma.xproce.d_s_student.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphGLController {
    private StudentService studentService;

    @MutationMapping
    public StudentDTO saveStudent(@Argument StudentDTO student){
        return studentService.saveStudent(student);
    }

    @MutationMapping
    public Boolean deleteStudent(@Argument Integer id){
        return studentService.deleteStudent(id);
    }

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(@Argument LocalDate dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }
 }
