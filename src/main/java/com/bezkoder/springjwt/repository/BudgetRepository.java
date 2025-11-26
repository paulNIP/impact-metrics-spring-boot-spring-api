package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {

}
