package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany(fetch  = FetchType.EAGER)
    @JoinColumn(name="idUsuario", updatable = false)
    private List<Rol> roles;
    
}
