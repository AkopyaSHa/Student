package ru.arl;

import java.util.List;
import java.util.Objects;

public class Task {
    private String name;
    private String description;
    private List<Student> students;
    private List<Hashtag> hashtags;


    public Task(String name, String description, List<Student> students, List<Hashtag> hashtags) {
        this.name = name;
        this.description = description;
        this.students = students;
        this.hashtags = hashtags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(description, task.description) &&
                Objects.equals(students, task.students) &&
                Objects.equals(hashtags, task.hashtags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, students, hashtags);
    }
}
