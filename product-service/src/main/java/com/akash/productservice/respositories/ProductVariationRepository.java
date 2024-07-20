package com.akash.productservice.respositories;

import com.akash.productservice.models.ProductVariation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ProductVariationRepository extends JpaRepository<ProductVariation, UUID> {
    Optional<ProductVariation> findById(UUID id);
}
