package com.enzodb97.pacientes.repository;

import com.enzodb97.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository  extends JpaRepository <Paciente, Long>{
 
    @Query ("SELECT p FROM Paciente p WHERE p.dni = :dni")
    Paciente findByDni(String dni);
   
    
}
