package es.inditex.api.bean;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Bean de petición de controllerPrices
 * Con los parametros de busqueda.
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

@Data
public class SearchRequest  implements Serializable {

    @NotNull(message = "No puede ser nulo 'productId'")
    private int productId;
    @NotNull(message = "No puede ser nulo 'date'")
    private Timestamp date;
    @NotNull(message = "No puede ser nulo 'brandId'")
    private int brandId;

}
