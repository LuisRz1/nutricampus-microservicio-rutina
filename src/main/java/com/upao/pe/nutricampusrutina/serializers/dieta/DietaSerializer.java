package com.upao.pe.nutricampusrutina.serializers.dieta;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DietaSerializer {
    private List<Object> comidas;
}
