package com.trainer.system.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name="entrenador")
public class EntrenadorEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_entrenador;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private String telefono;

    @Column(unique=true,nullable=false)
    private String correo;

    @Column()
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
