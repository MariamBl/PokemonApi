package com.example.pokemon.retrofit;

import com.example.pokemon.models.Pokedex;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface IPokemondex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
