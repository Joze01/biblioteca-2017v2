/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.sv.bean;

/**
 *
 * @author Jose
 */
public class documentoBean {

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the autor
     */
    public int getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(int autor) {
        this.autor = autor;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the edicion
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the fechaRegistro
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the editorial
     */
    public int getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(int editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the paginas
     */
    public String getPaginas() {
        return paginas;
    }

    /**
     * @param paginas the paginas to set
     */
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    /**
     * @return the Tracks
     */
    public String getTracks() {
        return Tracks;
    }

    /**
     * @param Tracks the Tracks to set
     */
    public void setTracks(String Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * @return the tipoMaterial
     */
    public int getTipoMaterial() {
        return tipoMaterial;
    }

    /**
     * @param tipoMaterial the tipoMaterial to set
     */
    public void setTipoMaterial(int tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    private String isbn;
    private String Nombre;
    private String descripcion;
    private int autor;
    private int anio;
    private int edicion;
    private String fechaRegistro;
    private int editorial;
    private String paginas;
    private String Tracks;
    private int tipoMaterial;
    
    
    
    
    
}
