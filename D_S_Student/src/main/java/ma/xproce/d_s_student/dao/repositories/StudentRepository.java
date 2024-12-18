package ma.xproce.d_s_student.dao.repositories;

import ma.xproce.d_s_student.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findByDateNaissance(LocalDate dateNaissance);
}
