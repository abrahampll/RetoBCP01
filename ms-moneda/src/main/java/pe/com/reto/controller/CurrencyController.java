package pe.com.reto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pe.com.reto.dto.response.CurrencyResponse;
import pe.com.reto.dto.response.ExchangeCurrencyResponse;
import pe.com.reto.service.ICurrencyService;
import rx.Single;
import rx.schedulers.Schedulers;
@RestController
@RequestMapping(value = "/api/currency", produces = "application/json")
@RequiredArgsConstructor
@Slf4j
public class CurrencyController {
	
	  private final ICurrencyService currencyService;
	
	@GetMapping("/{id}")
	public Single<ResponseEntity<CurrencyResponse>>  retorno(@PathVariable Long id){
		log.info("mensaje de prueba : {}", id);
		
		return currencyService.findById(id)
				.subscribeOn(Schedulers.io())
				.map(book -> ResponseEntity.ok(book));
	}
	
	@GetMapping("/tipoCambio")
	public Single<ResponseEntity<ExchangeCurrencyResponse>> prueba(@RequestParam String monedaOrigen,
			@RequestParam String monedaDestino, @RequestParam Long monto ){
		
		log.info("mensaje de prueba : {}", monedaOrigen);
		
		return currencyService.getidLocation(monedaOrigen, monedaDestino, monto)
				.subscribeOn(Schedulers.io())
				.map(res -> ResponseEntity.ok(res));
	}
	
		
	
}
