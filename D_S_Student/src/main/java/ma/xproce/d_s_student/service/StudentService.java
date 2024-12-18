package ma.xproce.d_s_student.service;

import ma.xproce.d_s_student.dto.StudentDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface StudentService {
    public StudentDTO saveStudent(StudentDTO studentDTO);
    public boolean deleteStudent(Integer id);
    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOS);
    public List<StudentDTO> getStudentByDateNaissance(LocalDate dateNaissance);

}
