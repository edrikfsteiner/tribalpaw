package com.tribalpaw.api.controller;

import com.tribalpaw.api.dto.building.BuildingRequestDto;
import com.tribalpaw.api.exception.BadRequestException;
import com.tribalpaw.api.exception.InternalServerException;
import com.tribalpaw.api.exception.NotFoundException;
import com.tribalpaw.api.handler.RestExceptionHandler;
import com.tribalpaw.api.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/buildings")
public class BuildingController {
    @Autowired
    private BuildingService service;
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
    public ResponseEntity<?> add(@RequestBody BuildingRequestDto building) {
        try {
            return ResponseEntity.ok(service.post(building));
        } catch (BadRequestException ex) {
            return handler.handleBadRequest(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }

    @PutMapping
    public ResponseEntity<?> edit(@RequestBody BuildingRequestDto building) {
        try {
            return ResponseEntity.ok(service.put(building));
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
            return ResponseEntity.ok("Building deleted");
        } catch (NotFoundException ex) {
            return handler.handleNotFound(ex);
        } catch (InternalServerException ex) {
            return handler.handleInternalServer(ex);
        }
    }
}