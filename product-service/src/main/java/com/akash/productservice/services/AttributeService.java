package com.akash.productservice.services;

import com.akash.productservice.dtos.AttributeRequestDto;
import com.akash.productservice.models.Attribute;
import com.akash.productservice.models.AttributeTerm;

import java.util.List;
import java.util.UUID;

public interface AttributeService {
    public List<Attribute> getAllAttributes();

    public Attribute createNewAttribute(AttributeRequestDto requestDto);

    public Attribute getAttributeById(UUID id);

    public Attribute updateAttributeById(UUID id, AttributeRequestDto requestDto);

    public Attribute deleteAttributeById(UUID id);

    public List<AttributeTerm> getAllAttributeTermsByAttributeId(UUID id);

    public AttributeTerm createNewAttributeTerm(UUID id, AttributeRequestDto requestDto);

    public AttributeTerm deleteAttributeTermById(UUID id, UUID termId);

    public AttributeTerm updateAttributeTermById(UUID id, UUID termId, AttributeRequestDto requestDto);

    public AttributeTerm getAttributeTermById(UUID id, UUID termId);
}
