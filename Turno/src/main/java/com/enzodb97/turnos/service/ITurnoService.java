package com.enzodb97.turnos.service;


import com.enzodb97.turnos.model.Turno;
import java.time.LocalDate;
import java.util.List;

public interface ITurnoService {
    
    public List<Turno> getTurnos();

    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente);

    public void deleteTurno(Long id);

    public Turno findTurno(Long id);

    public void editTurno (Long id, Turno turno);
    
}

