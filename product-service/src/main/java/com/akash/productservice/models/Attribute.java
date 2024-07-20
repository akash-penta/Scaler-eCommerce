package com.akash.productservice.models;

import com.akash.productservice.enums.AttributeType;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Attribute extends BaseModel {
    private String name;
    private AttributeType type;
}