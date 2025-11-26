package com.bezkoder.springjwt.controllers;


import com.bezkoder.springjwt.models.Budget;
import com.bezkoder.springjwt.security.services.BudgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
@CrossOrigin("*")
public class BudgetController {

    private final BudgetService service;

    public BudgetController(BudgetService service) {
        this.service = service;
    }

    @GetMapping
    public List<Budget> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Budget getOne(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Budget create(@RequestBody Budget product) {
        return service.create(product);
    }

    @PutMapping("/{id}")
    public Budget update(@PathVariable Long id, @RequestBody Budget product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
