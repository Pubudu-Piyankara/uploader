package com.example.demo.service;

import com.example.demo.model.Document;

import java.util.List;

public interface DocumentInterface {
    List<Document> getAllDocuments();

    Document uploadDocument(Document document);

    void deleteDocument(Long id) throws Exception;
}
