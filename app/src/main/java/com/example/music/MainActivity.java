package com.example.music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ViewUtils;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnchonbai;
    private Button btnplay;
    private Button btnpause;
    MediaPlayer mediaPlayer;
    ProgressBar progressBar;
    TextView tvidsong, tvnamesong,tvtotal;
    ArrayList<Song> mangSong;
    int position;
    private SeekBar seekBar;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vinitVi();

        progressBar.setVisibility(View.GONE);
        btnchonbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer=MediaPlayer.create(MainActivity.this,mangSong.get(position).getFileSong());
                tvidsong.setText(mangSong.get(position).getIdSong());
                tvnamesong.setText(mangSong.get(position).getNameSong());
                mediaPlayer.start();
                SettimmeTotal();
//                String url="https://data.chiasenhac.com/down2/2180/6/2179326-7bb9c33a/128/Pho%20Da%20Len%20Den%20Cukak%20Remix_%20-%20Huyen%20Tam.mp3";
//                MediaPlayer mediaPlayer= new MediaPlayer();
//                progressBar.setVisibility(View.VISIBLE);
//                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//                try{
//                    mediaPlayer.setDataSource(url);
//                    mediaPlayer.prepareAsync();
//
//                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                        @Override
//                        public void onPrepared(MediaPlayer mediaPlayer) {
//                            progressBar.setVisibility(View.GONE);
//                            mediaPlayer.start();
//                        }
//                    });
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
            }
        });
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                SettimmeTotal();

            }
        });

    }
    public  void SettimmeTotal(){
        SimpleDateFormat timeTotal =new SimpleDateFormat("mm:ss");
        tvtotal.setText(timeTotal.format(mediaPlayer.getDuration()));
        seekBar.setMax(mediaPlayer.getDuration());
    }
    public void vinitVi(){
        btnchonbai=findViewById(R.id.btn_chonbai);
        btnplay=findViewById(R.id.btn_play);
        btnpause=findViewById(R.id.btn_pause);
        progressBar=findViewById(R.id.progressBar);
        tvidsong=findViewById(R.id.tv_idsong);
        tvnamesong=findViewById(R.id.tv_namesong);
        tvtotal=findViewById(R.id.tv_total);

    }

}