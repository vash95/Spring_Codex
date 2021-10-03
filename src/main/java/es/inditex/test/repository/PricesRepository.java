package es.inditex.test.repository;


import es.inditex.test.model.Prices;
import es.inditex.test.model.PricesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Repositorio JPA para PRICES
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

@Repository
public interface PricesRepository extends JpaRepository<Prices, PricesId> {

    public List<Prices> findAllByBrandIdAndPricesIdProductIdAndPricesIdStartDateBeforeAndPricesIdEndDateAfter(int brandId, int productId, Timestamp date, Timestamp date1);
}
