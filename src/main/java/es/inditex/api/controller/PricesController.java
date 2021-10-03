package es.inditex.api.controller;


import es.inditex.api.bean.PricesResponse;
import es.inditex.api.bean.SearchRequest;
import es.inditex.api.services.PricesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


/**
 * Controlador para la tabla PRICES
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */



@Slf4j
@RestController("controllerPrices")
@RequestMapping("/api")
public class PricesController {

    @Autowired
    private PricesService pricesService;


    @PostMapping(value="/prices/search", produces = "application/json")
    public List<PricesResponse> SearchPrices(@Valid @RequestBody SearchRequest searchRequest) throws Exception{
        return pricesService.search(searchRequest);
    }

}
