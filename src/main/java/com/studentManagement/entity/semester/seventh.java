package com.studentManagement.entity.semester;

import com.studentManagement.entity.Student;
import jakarta.persistence.*;

@Entity
@Table(name = "seventh")
public class seventh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or another appropriate strategy
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "student_id", nullable = false)
    private String studentId;

    @Column(name = "subject_id")
    private String subjectId;

    @Column(name = "internals")
    private String internals;

    @Column(name="externals")
    private String externals;

    @Column(name= "regulation")
    private String regulation;

    @Column(name= "attendance")
    private String attendance;

    @ManyToOne
    @JoinColumn(name = "student-id6",nullable = false,insertable = false, updatable = false)
    private Student student6;

    public seventh() {
    }

    public seventh(String studentId, String subjectId, String internals, String externals, String regulation, String attendance) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.internals = internals;
        this.externals = externals;
        this.regulation = regulation;
        this.attendance = attendance;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getInternals() {
        return internals;
    }

    public void setInternals(String internals) {
        this.internals = internals;
    }

    public String getExternals() {
        return externals;
    }

    public void setExternals(String externals) {
        this.externals = externals;
    }

    public String getRegulation() {
        return regulation;
    }

    public void setRegulation(String regulation) {
        this.regulation = regulation;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }
}
