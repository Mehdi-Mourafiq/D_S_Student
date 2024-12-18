package ma.xproce.d_s_student;

import ma.xproce.d_s_student.dto.StudentDTO;
import ma.xproce.d_s_student.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class DSStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DSStudentApplication.class, args);
	}

	@Bean
	CommandLineRunner start(StudentService studentService){
		return args -> {
			studentService.saveStudents(
					List.of(
							StudentDTO.builder().name("El Mehdi Mourafiq").email("mourafiqmehdi@gmail.com").dateNaissance(LocalDate.of(2002, 9, 16)).build(),
							StudentDTO.builder().name("Adnane Motya").email("AdnaneMotya@gmail.com").dateNaissance(LocalDate.of(2001, 6, 1)).build(),
							StudentDTO.builder().name("Younes Chafki").email("YounesChafki@gmail.com").dateNaissance(LocalDate.of(2002, 8, 15)).build(),
							StudentDTO.builder().name("Sami Fakhri").email("SamiFakhri@gmail.com").dateNaissance(LocalDate.of(2003, 7, 21)).build()
					)
			);
		};
	}
}
