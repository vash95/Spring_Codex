package es.inditex.api.model;

import lombok.Data;

import javax.persistence.*;


/**
 * Clase entidad PRICES
 * Tabla que almacena el precio y tarifa de un producto en un rango de tiempo
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

@Entity
@Table(name = "PRICES")
@Data
public class Prices {


    @EmbeddedId
    private PricesId pricesId;

    @Column(name="BRAND_ID")
    private int brandId;

    @Column(name="PRICE_LIST")
    private int priceList;

    @Column(name="PRIORITY")
    private int priority;

    @Column(name="PRICE")
    private double price;

    @Column(name="CURR")
    private String curr;

}
