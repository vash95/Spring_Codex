package es.inditex.api.services.impl;

import es.inditex.api.bean.PricesResponse;
import es.inditex.api.bean.SearchRequest;
import es.inditex.api.model.Prices;
import es.inditex.api.repository.PricesRepository;
import es.inditex.api.services.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementación de los servicios para PRICES.
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */


@Service
public class PricesServiceImpl implements PricesService {


    @Autowired
    public PricesRepository repository;


    @Override
    public List<PricesResponse> search(SearchRequest request) {

        List<Prices> price = repository.
                findAllByBrandIdAndPricesIdProductIdAndPricesIdStartDateBeforeAndPricesIdEndDateAfter(request.getBrandId(),
                        request.getProductId(), request.getDate(), request.getDate());

        return mapperResults(price);

    }

    /**
     * Mapeo Prices a PricesResponse
     * Mapea una lista de objetos Prices a otra lista de objetos PricesResponse.
     * @param price Lista de la Entidad Prices.
     * @return Lista de objectos de tipo PricesResponse.
     */

    private List<PricesResponse> mapperResults(List<Prices> price) {
        return price.stream()
                .map(p -> new PricesResponse(
                        p.getPricesId().getProductId(),
                        p.getBrandId(),
                        p.getPricesId().getStartDate(),
                        p.getPricesId().getEndDate(),
                        p.getPriceList(), p.getPrice()))
                .collect(Collectors.toList());
    }
}
