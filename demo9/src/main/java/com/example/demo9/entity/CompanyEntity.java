package com.example.demo9.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class CompanyEntity extends BaseEntity {
    private String name;
    private String Location;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<JobEntity> jobs;
}
