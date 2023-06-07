package com.softtek.examenejercicio1.model;

import org.springframework.stereotype.Component;

@Component("reducido")
public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto p1){
        return p1.getPrecio() * 0.04;
    }


}
