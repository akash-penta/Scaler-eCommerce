package com.akash.productservice.respositories;

import com.akash.productservice.models.AttributeTerm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AttributeTermRepository extends JpaRepository<AttributeTerm, UUID> {
}
