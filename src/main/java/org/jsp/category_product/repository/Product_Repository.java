package org.jsp.category_product.repository;

import org.jsp.category_product.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product, Integer> {

}
