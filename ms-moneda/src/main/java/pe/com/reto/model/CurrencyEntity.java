package pe.com.reto.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="moneda")
@Data
public class CurrencyEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCurrency;
	
	
	@Column(name ="curreny_Name" )
	private String currencyName;
	
	@Column(name ="origin_Currency" )
	private String originCurrency;
	
	@Column(name ="exchange_Currency" )
	private String exchangeCurrency;

	
	
	
	@Column(name ="exchange_Rate" ,  precision = 6, scale = 2)
	private BigDecimal exchangeRate;
}
