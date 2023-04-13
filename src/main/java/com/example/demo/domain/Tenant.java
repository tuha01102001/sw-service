package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tenants")
public class Tenant extends BaseEntity {

    private String alias;
    private String uuid;

}
