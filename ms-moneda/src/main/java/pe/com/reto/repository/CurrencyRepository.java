package pe.com.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.reto.model.CurrencyEntity;

public interface CurrencyRepository  extends JpaRepository<CurrencyEntity, Long> {
	
	
	
	
	@Query(value="select exchangeRate from CurrencyEntity a where  originCurrency= ?1 and exchangeCurrency = ?2")
	String getidLocation (String monedaOrigen, String monedaDestino );
	
	
	
	
}
