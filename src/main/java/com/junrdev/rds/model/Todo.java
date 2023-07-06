package com.junrdev.rds.model;

import jakarta.persistence.Entity;

@Entity
public record Todo(String title, String content) {
}
