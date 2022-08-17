package com.sistemaexamenes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles" )
public class Rol {

    @Id
    private Long  rolID;
    private String nombre;
}
