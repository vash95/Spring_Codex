package es.inditex.api.services;

import es.inditex.api.bean.PricesResponse;
import es.inditex.api.bean.SearchRequest;

import java.util.List;

/**
 * Interfaz de los servicios para PRICES.
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

public interface PricesService {

    public List<PricesResponse> search(SearchRequest searchRequest);
}
