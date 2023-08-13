package com.posmanagement.Pos.Management.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String customerAddress;
    private String customerEmail;
    private double customerSalary;
    @Type(type = "json")
    @Column(name = "customerMobileNumber", columnDefinition = "json")
    private ArrayList customerMobileNumber;
    private boolean activeState;
}
