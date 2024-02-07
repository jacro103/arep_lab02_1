package com.example;

import java.util.concurrent.ConcurrentHashMap;

import com.google.gson.JsonObject;

public class Cache {
        private ConcurrentHashMap<String, JsonObject> movie;
    private static Cache cache = null;

    /**
     * Constructor para la clase MovieCache
     */
    public Cache(){
        movie = new ConcurrentHashMap<String,JsonObject>();
    }

     /**
     * Obtiene la instancia de la clase MovieCache
     * @return la instancia actual de la caché de películas
     */
    public static Cache getCache(){
        if(cache == null){
            cache = new Cache();
        }

        return cache;
    }
    /**
     * Obtiene la información de una película de la caché
     * @param name el nombre de la película a recuperar
     * @return toda la información de la película si existe en la caché, de lo contrario null
     */
    public JsonObject getMovieInfo(String name){
        return movie.get(name);
    }
     /**
     * Comprueba si una película existe en la caché
     * @param name el nombre de la película a buscar
     * @return true si la película existe en la caché, de lo contrario false
     */
    public boolean ListCache(String name){
        return movie.containsKey(name);
    }

    /**
     * Agrega información de una película a la caché
     * @param name el nombre de la película
     * @param movieInfo el objeto JSON que contiene la información de la película
     */
    public void addCache(String name, JsonObject movieInfo){
        movie.putIfAbsent(name, movieInfo);
    }
}
