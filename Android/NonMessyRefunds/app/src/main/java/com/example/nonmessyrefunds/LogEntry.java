package com.example.nonmessyrefunds;

import java.util.List;

public class LogEntry {
    private List<String> studentIds;

    public LogEntry() {
    }

    public LogEntry(List<String>  studentIds) {
        this.studentIds = studentIds;
    }

    public List<String> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<String> studentIds) {
        this.studentIds = studentIds;
    }
}
