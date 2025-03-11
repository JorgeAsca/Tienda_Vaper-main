package com.jj.tienda_vaper.modelo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jj.tienda_vaper.modelo.entidades.Gamas;

@Repository
public interface GamasRepositorios extends JpaRepository<Gamas,String> {
    // public void findClientesMayorLimite(){
    
    // }
}