package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION("Action", "Acción"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comedia"),
    DRAMA("Drama", "Drama"),
    CRIMEN("Crime", "Crimen"),
    AVENTURA("Adventure", "Aventura"),
    TERROR("Horror", "Terror"),
    FANTASIA("Fantasy", "Fantasía"),
    SUSPENSO("Thriller", "Suspenso"),
    ANIMACION("Animation", "Animación"),
    CORTO("Short", "Corto"),
    FAMILIAR("Family", "Familiar"),
    CIENCIA_FICCION("Sci-Fi", "Ciencia-Ficcion");

    private String categoriaOmdb;
    private String categoriaEspanol;

    Categoria (String categoriaOmdb, String categoriaEspanol){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEspanol = categoriaEspanol;
    }

    /*
    *  estamos haciendo la transformación de string a
    * un tipo de dato de nuestra categoría.
    * traemos esos valores  coincide con las variables que tenemos aquí ya mapeadas,
    *  ahí va a hacer esa transformación.
    *  Y nos va a retornar a categoría del tipo.
    *  En caso de que no pueda,  ninguna categoría fue encontrada*/

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }

    public static Categoria fromEspanol(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaEspanol.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }


}
