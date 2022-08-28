package pl.edu.amu.projektystudentow.sprawozdania.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.amu.projektystudentow.sprawozdania.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
