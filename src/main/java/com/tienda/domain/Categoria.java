/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*; //Solo en desarrollo para produccion se debe colocar las librerías que se requeiran
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author andrj
 */
@Data //Crea automaticamente metodos
@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id_categoria")
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen; //hibernate lo tranbsforma en ruta_imagen
        this.activo = activo;
    }
    
    
}

