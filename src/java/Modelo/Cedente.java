/*
 * Script tabla en oracle:
CREATE TABLE cedente
( rut number(10) NOT NULL,
  nombre varchar2(50) NOT NULL,
  rubro varchar2(50) NOT NULL,
  CONSTRAINT cedente_pk PRIMARY KEY (rut)
);
 */
package Modelo;

/**
 *
 * @author bernardo
 */
public class Cedente {
    public int rut;
    public String nombre;
    public String rubro;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
}
