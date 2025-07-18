package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="rol")
public class Rol implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idRol;
    
    private Long idUsuario;
    private String nombre;
    
}
