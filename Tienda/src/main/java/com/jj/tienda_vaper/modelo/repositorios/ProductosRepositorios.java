package com.jj.tienda_vaper.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jj.tienda_vaper.modelo.entidades.Productos;

@Repository
public interface ProductosRepositorios extends JpaRepository<Productos,String> {
    // public void findClientesMayorLimite(){
    
    // }
}
