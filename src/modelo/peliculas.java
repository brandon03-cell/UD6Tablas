package modelo;

public class peliculas {
    private String titulo;
    private String genero;
    private Integer duracion;;
    private Double puntuacion;

    public peliculas(String titulo, String genero, Integer duracion, Double puntuacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.puntuacion = puntuacion;
    }

    public peliculas() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Double puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "peliculas{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
