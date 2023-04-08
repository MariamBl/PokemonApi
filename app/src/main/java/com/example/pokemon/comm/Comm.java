package com.example.pokemon.comm;

import android.graphics.Color;

import com.example.pokemon.R;
import com.example.pokemon.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Comm {
    public static List<Pokemon> comlist=new ArrayList<>();
    public static final String KEY_POKEMON_TYPE = "type";
    public final static String ENABLE_KEY_HOME = "position";
    public static final String KEY_NUM_EVOLUTION = "num";

    public static Pokemon findPokemonByNum(String num) {
        for(Pokemon pokemon : comlist)
        {
            if(pokemon.getNum().equals(num))
                return pokemon;
        }
        return null;
    }

    public static int getColorByType(String s) {
        switch(s)
        {

            case "Normal":
                return Color.parseColor(String.valueOf(R.color.ice));


            case "Dragon":
                return Color.parseColor(String.valueOf(R.color.dragon));



            case "Psychic":
                return Color.parseColor(String.valueOf(R.color.psychic));


            case "Electric":
                return Color.parseColor(String.valueOf(R.color.electric));


            case "Ground":
                return Color.parseColor(String.valueOf(R.color.ground));


            case "Grass":
                return Color.parseColor(String.valueOf(R.color.grass));

            case "Poison":
                return Color.parseColor(String.valueOf(R.color.poison));

            case "Steel":
                return Color.parseColor(String.valueOf(R.color.steel));


            case "Fairy":
                return Color.parseColor(String.valueOf(R.color.fairy));


            case "Fire":
                return Color.parseColor(String.valueOf(R.color.fire));


            case "Fight":
                return Color.parseColor(String.valueOf(R.color.fighting));


            case "Bug":
                return Color.parseColor(String.valueOf(R.color.bug));


            case "Ghost":
                return Color.parseColor(String.valueOf(R.color.ghost));


            case "Dark":
                return Color.parseColor(String.valueOf(R.color.dark));


            case "Ice":
                return Color.parseColor(String.valueOf(R.color.ice));


            case "Water":
                return Color.parseColor(String.valueOf(R.color.water));
            default:
                return Color.parseColor("#658FA0");
        }
    }
}
