package com.tribalpaw.api.controller;

import com.tribalpaw.api.dto.province.ProvinceRequestDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.InternalServerException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.handler.RestExceptionHandler;
import com.tribalpaw.api.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/provinces")
public class ProvinceController {
    @Autowired
    private ProvinceService service;
    @Autowired
    private RestExceptionHandler handler;

    @GetMapping
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.ok(service.getAll());
        } catch (NotFoundException ex) {
            return handler.handleNotFound(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(service.getById(id));
        } catch (NotFoundException ex) {
            return handler.handleNotFound(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody ProvinceRequestDto province) {
        try {
            return ResponseEntity.ok(service.post(province));
        } catch (BadRequestException ex) {
            return handler.handleBadRequest(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }

    @PutMapping
    public ResponseEntity<?> put(@RequestBody ProvinceRequestDto province) {
        try {
            return ResponseEntity.ok(service.put(province));
        } catch (BadRequestException ex) {
            return handler.handleBadRequest(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id) {
        try {
            service.delete(id);
            return ResponseEntity.ok("Province deleted");
        } catch (NotFoundException ex) {
            return handler.handleNotFound(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }
}