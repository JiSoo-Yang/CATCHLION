package com.example.demo9.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class JobEntity extends BaseEntity {
    private String title;
    private String description;
    private LocalDate deadline;

    @ManyToOne
    private CompanyEntity company;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
    private List<CoverLetterEntity> coverLetters;
}
