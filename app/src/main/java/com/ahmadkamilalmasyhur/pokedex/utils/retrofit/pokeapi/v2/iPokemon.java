package com.ahmadkamilalmasyhur.pokedex.utils.retrofit.pokeapi.v2;

import com.ahmadkamilalmasyhur.pokedex.model.pokemonlist.PokemonListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface iPokemon {
    @Headers("Accept: application/json")
    @GET("pokemon/")
    Call<PokemonListResponse> getPokemon(@Query("limit") String limit, @Query("offset") String offset);

    @Headers("Accept: application/json")
    @GET("pokemon/{id}")
    Call<PokemonListResponse> getPokemonById(@Path("id") String id);
}
