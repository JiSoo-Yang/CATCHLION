package com.example.demo9.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class CoverLetterEntity extends BaseEntity {
    private String content;

    @ManyToOne
    private JobEntity job;
}
