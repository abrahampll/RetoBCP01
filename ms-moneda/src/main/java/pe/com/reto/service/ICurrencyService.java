package pe.com.reto.service;

import pe.com.reto.dto.response.CurrencyResponse;
import pe.com.reto.dto.response.ExchangeCurrencyResponse;
import pe.com.reto.model.CurrencyEntity;
import rx.Single;

public interface ICurrencyService {

	CurrencyEntity save(CurrencyEntity productEntity);

	Single<CurrencyResponse> findById(Long id);
	
	Single<ExchangeCurrencyResponse> getidLocation(String monedaOrigen, String monedaDestino,  Long monto);
}
