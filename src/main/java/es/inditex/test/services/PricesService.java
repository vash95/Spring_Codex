package es.inditex.test.services;

import es.inditex.test.bean.PricesResponse;
import es.inditex.test.bean.SearchRequest;

import java.util.List;

/**
 * Interfaz de los servicios para PRICES.
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

public interface PricesService {

    public List<PricesResponse> search(SearchRequest searchRequest);
}
