package es.inditex.test.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * Bean generico para los errores
 * @author Borja "Vash"
 * @version 0.1, 03/10/2021
 */

@Data
@AllArgsConstructor
public class ApiError {

    private HttpStatus status;
    private String message;
    private List<String> errores;


}
