package pe.com.reto.service;

import java.math.BigDecimal;

import pe.com.reto.dto.response.CurrencyResponse;
import pe.com.reto.model.CurrencyEntity;
import rx.Single;

public interface ICurrencyService {

	CurrencyEntity save(CurrencyEntity productEntity);

	Single<CurrencyResponse> findById(Long id);
	
	Single<BigDecimal> getidLocation(String monedaOrigen, String monedaDestino);
}
