package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
}
