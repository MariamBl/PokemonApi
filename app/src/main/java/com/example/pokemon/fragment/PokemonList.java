package com.example.pokemon.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokemon.R;
import com.example.pokemon.adapter.Pokemon_list_Adp;
import com.example.pokemon.comm.Comm;
import com.example.pokemon.comm.ItemDec;
import com.example.pokemon.models.Pokedex;
import com.example.pokemon.retrofit.IPokemondex;
import com.example.pokemon.retrofit.RetrofitClient;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Retrofit;

public class PokemonList extends Fragment {
    IPokemondex iPokemondex;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RecyclerView recyclerViewPK_list;
    static PokemonList instance;

    public PokemonList() {
        Retrofit retrofit = RetrofitClient.getInstance();
        iPokemondex = retrofit.create(IPokemondex.class);
    }

    public static PokemonList getInstance() {
        if (instance == null) {
            instance = new PokemonList();
        }
        return instance;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pokemon_list,container,false);
        recyclerViewPK_list = view.findViewById(R.id.pok_list_rec);
        recyclerViewPK_list.setHasFixedSize(true);
        recyclerViewPK_list.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        ItemDec itemDec = new ItemDec(getActivity(), R.dimen.test);
        recyclerViewPK_list.addItemDecoration(itemDec);

        getAllData();
        return view;
    }

    private void getAllData() {

        compositeDisposable.add(iPokemondex.getListPokemon()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Pokedex>() {
                    @Override
                    public void accept(Pokedex pokedex) throws Throwable {
                        Comm.comlist = pokedex.getPokemon();
                        Pokemon_list_Adp pokemon_list_adp = new Pokemon_list_Adp(getActivity(), Comm.comlist);
                        recyclerViewPK_list.setAdapter(pokemon_list_adp);
                    }
                })
        );
    }
}
