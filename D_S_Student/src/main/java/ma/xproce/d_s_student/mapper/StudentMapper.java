package ma.xproce.d_s_student.mapper;

import ma.xproce.d_s_student.dao.entities.Student;
import ma.xproce.d_s_student.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDTO studentDTO) {
        return mapper.map(studentDTO, Student.class);
    }

    public StudentDTO fromStudentToStudentDTO(Student student) {
        return mapper.map(student, StudentDTO.class);
    }
}
