package com.example.demo.controller;

import com.example.demo.model.ApiResponse;
import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class DocumentController {
    @Autowired
    private DocumentService documentService;
    private final List<Document> documentList = new ArrayList<>();

    @GetMapping("/")
    public void hello() {
        ApiResponse res = new ApiResponse();
        res.setResponse("Welcome");
        res.setStatus(true);
    }


    @GetMapping("/api")
    public List<Document> getAllDocuments() {

        return documentService.getAllDocuments();
    }

    @PostMapping("/api/upload")
    public Document uploadDocument(@RequestBody Document document) {
        return documentService.uploadDocument(document);
    }

    @DeleteMapping("/api/delete/{id}")
    public void deleteDocument(@PathVariable Long id) throws Exception {
        documentService.deleteDocument(id);
        ApiResponse res = new ApiResponse();
        res.setResponse("Successfully Deleted");
        res.setStatus(true);
    }
}
