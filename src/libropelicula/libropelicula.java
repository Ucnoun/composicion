/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libropelicula;
import Pelicula.Actor;
import Pelicula.Autor;
import Pelicula.Director;
import Pelicula.Editorial;
import Pelicula.Libro;
import Pelicula.Productora;

/**
 *
 * @author elies
 */
public class libropelicula {
    private String libro;
    private String pelicula;
    private Actor nombreActor;
    private Autor nombreAutor;
    private Director nombreDirector;
    private Editorial nombreedEditorial;
    private Libro nombreLibro;
    private Productora nombreProductora;
    
    public libropelicula(){
        nombreActor = new Actor();
        nombreAutor = new Autor();
        nombreDirector = new Director();
        nombreedEditorial = new Editorial();
        nombreLibro = new Libro();
        nombreProductora = new Productora();
        

    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Actor getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(Actor nombreActor) {
        this.nombreActor = nombreActor;
    }

    public Autor getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(Autor nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public Director getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(Director nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public Editorial getNombreedEditorial() {
        return nombreedEditorial;
    }

    public void setNombreedEditorial(Editorial nombreedEditorial) {
        this.nombreedEditorial = nombreedEditorial;
    }

    public Libro getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(Libro nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Productora getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(Productora nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    @Override
    public String toString() {
        return "libropelicula{" + "libro=" + libro + ", pelicula=" + pelicula + ", nombreActor=" + nombreActor + ", nombreAutor=" + nombreAutor + ", nombreDirector=" + nombreDirector + ", nombreedEditorial=" + nombreedEditorial + ", nombreLibro=" + nombreLibro + ", nombreProductora=" + nombreProductora + '}';
    }
         
    }
            

