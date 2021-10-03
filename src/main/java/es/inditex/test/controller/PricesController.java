package es.inditex.test.controller;


import es.inditex.test.bean.PricesResponse;
import es.inditex.test.bean.SearchRequest;
import es.inditex.test.services.PricesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
