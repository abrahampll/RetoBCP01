package pe.com.reto.service;

import java.math.BigDecimal;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.com.reto.dto.response.CurrencyResponse;
import pe.com.reto.model.CurrencyEntity;
import pe.com.reto.repository.CurrencyRepository;
import rx.Single;

@Service
@Slf4j
@RequiredArgsConstructor
public class CurrencyServiceImpl implements ICurrencyService {

	private final  CurrencyRepository currencyRepository;
	
	@Override
	public CurrencyEntity save(CurrencyEntity productEntity) {
		return currencyRepository.save(productEntity);
    
	}

	@Override
	public Single<CurrencyResponse> findById(Long id) {
		return findCurrencyInRepository(id);
	}
	
	
	private Single<CurrencyResponse> findCurrencyInRepository(Long id){
		return Single.create(single ->{
				Optional<CurrencyEntity> optional = currencyRepository.findById(id);
				log.info("valor de rpta :  {}", optional.get().getCurrencyName());
				if(!optional.isPresent()) {
					single.onError(new EntityNotFoundException());
				}else {
					CurrencyResponse currencyResponse= toCurrencyResponse(optional.get());
				single.onSuccess(currencyResponse);
				}
		});
	}
	
	private CurrencyResponse toCurrencyResponse(CurrencyEntity currency) {
		CurrencyResponse currencyResponse = new CurrencyResponse();
		BeanUtils.copyProperties(currency, currencyResponse);
		currencyResponse.setIdMoneda(currency.getIdCurrency());
		currencyResponse.setNombreMoneda(currency.getCurrencyName());
		currencyResponse.setMonedaCambio(currency.getExchangeCurrency());
		currencyResponse.setTipoCambio(currency.getExchangeRate());
		return currencyResponse;
		
	}

	@Override
	public Single<BigDecimal> getidLocation(String monedaOrigen, String monedaDestino) {
		
		return null;
	}
	
	

}
