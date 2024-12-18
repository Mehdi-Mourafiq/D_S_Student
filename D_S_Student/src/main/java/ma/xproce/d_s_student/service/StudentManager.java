package ma.xproce.d_s_student.service;

import lombok.AllArgsConstructor;
import ma.xproce.d_s_student.dao.entities.Student;
import ma.xproce.d_s_student.dao.repositories.StudentRepository;
import ma.xproce.d_s_student.dto.StudentDTO;
import ma.xproce.d_s_student.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService{
    private StudentRepository studentRepository;
    private StudentMapper studentMapper;


    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDTO);
        student = studentRepository.save(student);
        studentDTO = studentMapper.fromStudentToStudentDTO(student);
        return studentDTO;
    }

    @Override
    public boolean deleteStudent(Integer id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDTO> saveStudents(List<StudentDTO> studentDTOS) {
        List<Student> students = new ArrayList<>();

        for (StudentDTO studentDTO : studentDTOS) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDTO));
        }

        students = studentRepository.saveAll(students);

        studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }

        return studentDTOS;
    }

    @Override
    public List<StudentDTO> getStudentByDateNaissance(LocalDate dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDTO> studentDTOS = new ArrayList<>();
        for (Student student : students) {
            studentDTOS.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentDTOS;
    }
}
