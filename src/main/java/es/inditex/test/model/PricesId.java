package es.inditex.test.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * Clase de la PK compuesta de PRICES.
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

@Data
@Embeddable
public class PricesId implements Serializable {


    @Column(name="START_DATE")
    private Timestamp startDate;

    @Column(name="END_DATE")
    private Timestamp endDate;

    @Column(name="PRODUCT_ID")
    private int productId;


}
