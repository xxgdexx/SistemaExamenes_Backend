package com.sistemaexamenes.entity;

import javax.persistence.*;

@Entity
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolID;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;
}
