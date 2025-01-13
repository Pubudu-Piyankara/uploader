package com.example.demo.model;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Document {
    private long id;
    private String name;
    private String fileType;
    private double size;

    public Document(){

    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Document document)) return false;
        return id == document.id && Double.compare(size, document.size) == 0 && Objects.equals(name, document.name) && Objects.equals(fileType, document.fileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fileType, size);
    }
}
