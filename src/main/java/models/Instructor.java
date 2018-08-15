package models;

import javax.persistence.*;

@Entity
@Table(name = "instructors")
public class Instructor {

    private int id;
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public Instructor() {
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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
