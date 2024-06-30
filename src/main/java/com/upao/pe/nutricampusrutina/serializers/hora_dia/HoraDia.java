package com.upao.pe.nutricampusrutina.serializers.hora_dia;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.upao.pe.nutricampusrutina.modelos.EjercicioRutina;
import com.upao.pe.nutricampusrutina.serializers.DietaComida;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class HoraDia {
    @Id
    private Long idHoraDia;
    private LocalDate fecha;
    private LocalTime hora;
    @OneToMany(mappedBy = "horaDia", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DietaComida> dietaComidas;
    @OneToMany(mappedBy = "horaDia", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<EjercicioRutina> ejercicioRutinas;
}
