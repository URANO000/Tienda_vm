package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="constante")
public class Constante implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idConstante;
    
    private String atributo;
    private String valor;
    
    
}
