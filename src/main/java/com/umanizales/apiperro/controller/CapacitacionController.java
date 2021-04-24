package com.umanizales.apiperro.controller;

import com.umanizales.apiperro.model.Empleado;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (path = "/capacitacion")
@Validated

public class CapacitacionController {
    @GetMapping
    public Empleado getEmployee()
    {
        Empleado aristizabal = new Empleado("Yon Aristizabal","1053873075",3500000);
        return aristizabal;
    }

    @GetMapping(path = "/empleados")
    public Empleado[] getAllEmployees(){
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Yon Aristizabal", "1053873075", 3500000);
        empleados[1] = new Empleado("Luis Castaño", "123456789", 2500000);
        empleados[2] = new Empleado("Jorge Paez","544646464",5000000);
        return empleados;
    }


}
