package com.studentManagement.repository.semester;

import com.studentManagement.entity.Student;
import com.studentManagement.entity.semester.fourth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FourthSemesterInterface extends JpaRepository<fourth,Long>
{
    @Query("SELECT s FROM Student s JOIN FETCH s.fourth")
    List<com.studentManagement.entity.Student> findAllUsersWithAddressfourth();
}
