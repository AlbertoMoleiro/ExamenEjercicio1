package com.softtek.examenejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Factura {
    @Autowired
    @Qualifier("general")
    private IImpuesto impuesto;

    private List<Producto> productos;

    public double calcularTotalFactura(){
        double total = 0;
        for(Producto p: productos){
            total += impuesto.calcularImpuesto(p) + p.getPrecio();
        }

        return total;
    }
}
