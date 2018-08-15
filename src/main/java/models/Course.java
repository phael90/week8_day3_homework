package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    private int id;
    private String title;
    private LevelType level;

    public Course(String title, LevelType level) {
        this.title = title;
        this.level = level;
    }

    public Course() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "level")
    public LevelType getLevel() {
        return level;
    }

    public void setLevel(LevelType level) {
        this.level = level;
    }
}
