package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String fileType;
    private double size;
    private Date uploadDate;

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

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
