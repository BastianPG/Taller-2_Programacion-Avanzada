/*
 * Copyright (c) 2023. Programacion Avanzada, DISC, UCN.
 */

package cl.ucn.disc.pa.bibliotech.model;

/**
 * Clase que representa un Libro.
 *
 * @author Programacion Avanzada.
 */
public final class Libro {

    /**
     * The ISBN.
     */
    private String isbn;

    /**
     * The Titulo.
     */
    private String titulo;

    /**
     * The Author.
     */
    private String autor;

    /**
     * The Categoria
     */
    private String categoria;

    // TODO: Agregar la calificacion.
    private double calificacion;



    private double contCalificacion;

    private double contEstrellas;


    /**
     * The Constructor.
     *
     * @param isbn      del libro.
     * @param titulo    del libro.
     * @param autor     del libro
     * @param categoria del libro.
     */
    public Libro(final String isbn, final String titulo, final String autor, final String categoria, final int calificacion) {

        // TODO: agregar validacion de ISBN LISTO
        if (isbn == null || isbn.length() == 0) {
            throw new IllegalArgumentException("isbn no valido!");
        }
        this.isbn = isbn;

        // validacion del título
        if (titulo == null || titulo.length() == 0) {
            throw new IllegalArgumentException("Titulo no valido!");
        }
        this.titulo = titulo;

        // TODO: Agregar validacion LISTO
        if (autor == null || autor.length() == 0) {
            throw new IllegalArgumentException("Autor no valido!");
        }
        this.autor = autor;

        // TODO: Agregar validacion LISTO
        if (categoria == null || categoria.length() == 0) {
            throw new IllegalArgumentException("Categoria no valido!");
        }
        this.categoria = categoria;

        //validacion calificacion
        if (calificacion < 0 || calificacion > 5) {
            throw new IllegalArgumentException("calificacion no valida");
        }
        this.calificacion = calificacion;
    }




    /**
     * @return the ISBN.
     */
    public String getIsbn() {
        return this.isbn;
    }

    /**
     * @return the titulo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * @return the autor.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * @return the categoria.
     */
    public String getCategoria() {
        return this.categoria;
    }

    public double getContCalificacion() {
             return contCalificacion;
         }

    public double getContEstrellas() {
        return contEstrellas;
    }

    public double getCalificacion() {
         return calificacion;
    }

    public void setContCalificacion(double contCalificacion) {
        this.contCalificacion = contCalificacion;
    }

    public void setContEstrellas(double contEstrellas) {
        this.contEstrellas = contEstrellas;
    }

    public void getCalificacion(double calificacionEnviar) {
        this.calificacion = calificacionEnviar;
    }
}