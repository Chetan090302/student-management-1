package com.studentManagement.repository.semester;
import com.studentManagement.entity.Student;
import com.studentManagement.entity.semester.first;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FirstSemesterInterface extends JpaRepository<first,Long>
{
    @Query("SELECT s FROM Student s JOIN FETCH s.first")
    List<com.studentManagement.entity.Student> findAllUsersWithAddressfirst();
}
