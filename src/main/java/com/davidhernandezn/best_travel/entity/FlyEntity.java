package com.davidhernandezn.best_travel.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.davidhernandezn.best_travel.util.AeroLine;

import jakarta.persistence.Column;
//JAKARTA JEE TENIA JPA, MAS NO SPRING
//SPRING YA NO USA JEE USA JAKARTA
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 

/*INTERFAZ SERIELIZABLE
 * todo objeto puede ser serializado en la red, se puede comvertir en bytes y transmitilor por http o bd (OPCIONAL LAS NUEVAS VERSIONES YA LO HACEN)
 * 
 *No es necesario agregar column, ya que entity sabe que es una tabla 
 * */

@Entity(name="fly")
@NoArgsConstructor //Constructor Vacio  
@AllArgsConstructor //Solicitado por Builder
@Data //get, set, toString, equals
@Builder //evita tener sobrecarga de constructores
public class FlyEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //INDICAR QUE ES AUTOINCREMENTABLE, postgrest usa identity 
	private Long id;
	
	private Double originLat;
	private Double originLgn;
	
	private Double destinyLat;
	private Double destinyLng;

	//DOUBLE PRECISION
	private BigDecimal price;
	
	@Column(length = 20)
	private String originName;
	@Column(length = 20)
	private String destinyName;

	@Enumerated(EnumType.STRING)
	private AeroLine aeroLine;

}
