package com.example.annotationsh2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String favColor;

    public Person(Integer id, String name, String favColor) {
        this.id = id;
        this.name = name;
        this.favColor = favColor;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(favColor, person.favColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, favColor);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favColor='" + favColor + '\'' +
                '}';
    }
}
