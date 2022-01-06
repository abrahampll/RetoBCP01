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
public class CurrencyResponse {
	
	
	private Long idMoneda;
	private String nombreMoneda;
	private String tipoMoneda;
	private String monedaCambio;
	private BigDecimal tipoCambio;

}
