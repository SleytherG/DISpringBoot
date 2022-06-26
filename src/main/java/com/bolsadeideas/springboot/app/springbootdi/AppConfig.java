package com.bolsadeideas.springboot.app.springbootdi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.app.springbootdi.models.domain.ItemFactura;
import com.bolsadeideas.springboot.app.springbootdi.models.domain.Producto;
import com.bolsadeideas.springboot.app.springbootdi.models.services.IServicio;
import com.bolsadeideas.springboot.app.springbootdi.models.services.MiServicio;
import com.bolsadeideas.springboot.app.springbootdi.models.services.MiServicioComplejo;


@Configuration
public class AppConfig {

    @Bean(value = "miServicioSimple")
    public IServicio registrarMiServicioSimple() {
        return new MiServicio();
    }
    
    @Primary
    @Bean(value = "miServicioComplejo")
    public IServicio registrarMiServicioComplejo() {
        return new MiServicioComplejo();
    }

    @Bean(value = "itemsFactura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicicleta Bianchi aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        List<ItemFactura> itemsFactura = new ArrayList<ItemFactura>();
        itemsFactura.add(linea1);
        itemsFactura.add(linea2);

        return itemsFactura;
        // return Arrays.asList(linea1, linea2);
    }

    @Bean(value = "itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Producto producto1 = new Producto("Monitor LG LCD 24", 250);
        Producto producto2 = new Producto("Notebook Asus", 500);
        Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 1);

        List<ItemFactura> itemsFactura = new ArrayList<ItemFactura>();
        itemsFactura.add(linea1);
        itemsFactura.add(linea2);
        itemsFactura.add(linea3);
        itemsFactura.add(linea4);

        return itemsFactura;
        // return Arrays.asList(linea1, linea2);
    }
}

