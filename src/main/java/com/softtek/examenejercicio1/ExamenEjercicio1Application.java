package com.softtek.examenejercicio1;

import com.softtek.examenejercicio1.model.Factura;
import com.softtek.examenejercicio1.model.IvaSuperReducido;
import com.softtek.examenejercicio1.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExamenEjercicio1Application implements CommandLineRunner {

    @Autowired
    Factura factura;
    public static void main(String[] args) {
        SpringApplication.run(ExamenEjercicio1Application.class, args);
    }

    public void run(String... args) throws Exception {

        //Instanciar Objetos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Boli",1.2));
        productos.add(new Producto("Folios", 5.4 ));
        productos.add(new Producto("Gomas", 7.2 ));

        factura.setProductos(productos);
       //Calcular Factura Iva General, imprimir con dos decimales
        System.out.println("La factura con iva general es:" + factura.calcularTotalFactura());

        //Calcular Factura Iva Reducido

        factura.setImpuesto(new IvaSuperReducido());
        System.out.println("La factura con iva reducido es:" + factura.calcularTotalFactura());
    }


}
