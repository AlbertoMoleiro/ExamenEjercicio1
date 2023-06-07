package com.softtek.examenejercicio1.model;

import org.springframework.stereotype.Component;

@Component("general")
public class IvaGeneral implements IImpuesto{

    @Override
    public double calcularImpuesto(Producto p1){
        return p1.getPrecio() * 0.21;
    }
}
