
package com.tienda.dao;

import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto, Long>{ //Long es el tipo de dato
    
    
}
