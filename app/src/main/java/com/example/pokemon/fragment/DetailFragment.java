package com.example.pokemon.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pokemon.R;
import com.example.pokemon.comm.Comm;
import com.example.pokemon.models.Pokemon;

public class DetailFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    ImageView pok_img;
    TextView pokname,pokheight,pokweight;
    RecyclerView recycler_type;
    static DetailFragment instance;

    public static DetailFragment getInstance() {
        if(instance == null)
            instance = new DetailFragment();
        return instance;
    }

    public DetailFragment() {
        // Required empty public constructor
    }


    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.fragment_detail,container,false);


        Pokemon pokemon = Comm.comlist.get(getArguments().getInt("position"));

        pok_img = (ImageView)itemView.findViewById(R.id.pokimg);
        pokname = (TextView) itemView.findViewById(R.id.pokName);
        pokheight= (TextView) itemView.findViewById(R.id.height);
        pokweight = (TextView) itemView.findViewById(R.id.weight);

        setDetailPok(pokemon);

        return itemView;
    }

    private void setDetailPok(Pokemon pokemon) {
        //Load Image
        Glide.with(getActivity()).load(pokemon.getImg()).into(pok_img);

        pokname.setText(pokemon.getName());
        pokheight.setText(pokemon.getHeight());
        pokweight.setText(pokemon.getWeight());


    }
}
