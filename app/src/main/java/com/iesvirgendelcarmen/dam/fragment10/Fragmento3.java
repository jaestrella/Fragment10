package com.iesvirgendelcarmen.dam.fragment10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by matinal on 26/10/2017.
 */

public class Fragmento3 extends Fragment {
    public static final String ARG_ID_ENTRADA_SELECCIONADA="item_id";
    private Contenido.Lista_entrada mItem;
    public Fragmento3(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)){
            mItem =Contenido.ENT_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.layout_detalle, container, false);
        if(mItem!=null){
            ((TextView)rootView.findViewById(R.id.textotitulo)).setText(mItem.textoEncima);
            ((TextView)rootView.findViewById(R.id.textocontenido)).setText(mItem.textoDebajo);
            ((ImageView)rootView.findViewById(R.id.imagen)).setImageResource(mItem.idImagen);
        }
        return rootView;
    }

}
