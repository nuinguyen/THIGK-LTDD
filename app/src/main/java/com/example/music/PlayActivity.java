package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnchon;
    ListView lvSong;
    ArrayList<Song> mangSong;
    TextView tvbai1, tvbai2, tvbai3, tvbai4,tvbai5,tvbai6;
    private int currentQuestion = 0;
    private Song msong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        vinitVi();
        mangSong = (ArrayList<Song>) getlistSong();
        if (mangSong.isEmpty()) {
            return;
        }
        setDataQuestion(mangSong);
       // SongAdapter songAdapter=new SongAdapter(PlayActivity.this,R.layout.,mangSong);

        btnchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PlayActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setDataQuestion(ArrayList<Song> mangSong) {
       // Toast.makeText(this,mangSong.get(0).getIdSong(),Toast.LENGTH_SHORT).show();

        tvbai1.setText(mangSong.get(0).getIdSong());
        tvbai2.setText(mangSong.get(1).getIdSong());
        tvbai3.setText(mangSong.get(2).getIdSong());
        tvbai4.setText(mangSong.get(3).getIdSong());
        tvbai5.setText(mangSong.get(4).getIdSong());
        tvbai6.setText(mangSong.get(5).getIdSong());

        tvbai1.setOnClickListener(this);
        tvbai2.setOnClickListener(this);
        tvbai3.setOnClickListener(this);
        tvbai4.setOnClickListener(this);
        tvbai5.setOnClickListener(this);
        tvbai6.setOnClickListener(this);
    }


    public void vinitVi(){
        btnchon=findViewById(R.id.btn_chon);
        tvbai1=findViewById(R.id.tv_bai1);
        tvbai2=findViewById(R.id.tv_bai2);
        tvbai3=findViewById(R.id.tv_bai3);
        tvbai4=findViewById(R.id.tv_bai4);
        tvbai5=findViewById(R.id.tv_bai5);
        tvbai6=findViewById(R.id.tv_bai6);

    }

    private List<Song> getlistSong() {
        List<Song> list = new ArrayList<>();
        list.add(new Song("1","What",R.raw.a));
        list.add(new Song("2","Are",R.raw.a));
        list.add(new Song("3","You",R.raw.a));
        list.add(new Song("4","Doing",R.raw.a));
        list.add(new Song("5","So",R.raw.a));
        list.add(new Song("6","Max",R.raw.a));
        return list;
    }
    @Override
    public void onClick(View view) {
                switch (view.getId()) {
            case R.id.tv_bai1:
                tvbai1.setBackgroundResource(R.drawable.bg_orange_corner_10);
                break;
            case R.id.tv_bai2:
                tvbai2.setBackgroundResource(R.drawable.bg_orange_corner_10);
                break;
            case R.id.tv_bai3:
                tvbai3.setBackgroundResource(R.drawable.bg_orange_corner_10);
                break;
            case R.id.tv_bai4:
                tvbai4.setBackgroundResource(R.drawable.bg_orange_corner_10);
                break;
            case R.id.tv_bai5:
                tvbai5.setBackgroundResource(R.drawable.bg_orange_corner_10);
                break;
            case R.id.tv_bai6:
                tvbai6.setBackgroundResource(R.drawable.bg_orange_corner_10);
                break;
        }
    }
}