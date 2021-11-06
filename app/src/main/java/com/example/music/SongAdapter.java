package com.example.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Song> arraySong;
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater= (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(myLayout,null);
        TextView tvbai1=view.findViewById(R.id.tv_bai1);
        tvbai1.setText(arraySong.get(i).idSong);
        TextView tvbai2=view.findViewById(R.id.tv_bai2);
        tvbai2.setText(arraySong.get(i).idSong);
        TextView tvbai3=view.findViewById(R.id.tv_bai3);
        tvbai3.setText(arraySong.get(i).idSong);
        TextView tvbai4=view.findViewById(R.id.tv_bai4);
        tvbai4.setText(arraySong.get(i).idSong);
        TextView tvbai5=view.findViewById(R.id.tv_bai5);
        tvbai5.setText(arraySong.get(i).idSong);
        TextView tvnamesong=view.findViewById(R.id.tv_namesong);
        tvnamesong.setText(arraySong.get(i).nameSong);
        TextView tvidsong=view.findViewById(R.id.tv_idsong);
        tvidsong.setText(arraySong.get(i).nameSong);

        return view;
    }
}
