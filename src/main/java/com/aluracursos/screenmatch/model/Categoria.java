package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIMEN("Crime");

    private String categoriaOmdb;

    Categoria (String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
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

}
