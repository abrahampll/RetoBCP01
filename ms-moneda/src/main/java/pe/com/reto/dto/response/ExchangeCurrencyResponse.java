package pe.com.reto.dto.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeCurrencyResponse {
	

	private String monedaOrigen;
	private String monedaDestino;
	private BigDecimal monto;
	private BigDecimal tipoCambio;
	

	


}
