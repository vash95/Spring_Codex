package es.inditex.test.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Bean de respuesta de controllerPrices
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */


@Data
@AllArgsConstructor
public class PricesResponse  implements Serializable {

    private int productId;

    private int brandId;

    private Timestamp startDate;

    private Timestamp endDate;

    private int priceList;

    private double price;

}
