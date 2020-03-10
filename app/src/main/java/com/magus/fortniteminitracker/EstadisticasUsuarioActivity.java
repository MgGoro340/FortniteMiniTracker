package com.magus.fortniteminitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class EstadisticasUsuarioActivity extends AppCompatActivity {


    private TextView tvAccount;
    private TextView tvEpicUser;
    private TextView tvWins;
    private TextView tvKills;
    private TextView  tvWinRatio;
    private TextView tvMatchs;
    private TextView  tvKillsPorGame;
    private TextView tvTop25;
    private TextView tvTop10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas_usuario);

        tvAccount = findViewById(R.id.textViewAccount);
        tvEpicUser = findViewById(R.id.textViewEpicUser);
        tvWins = findViewById(R.id.textViewWins);
        tvKills = findViewById(R.id.textViewKills);
        tvWinRatio = findViewById(R.id.textViewWinRatio);
        tvMatchs = findViewById(R.id.textViewMatchs);
        tvKillsPorGame = findViewById(R.id.textViewKillPorGame);
        tvTop25 = findViewById(R.id.textViewTop25);
        tvTop10 = findViewById(R.id.textViewTop10);

        Bundle extras = getIntent().getExtras();
        tvAccount.setText(extras.get("account").toString());
        tvEpicUser.setText(extras.get("epicUser").toString());
        tvWins.setText(extras.get("wins").toString());
        tvKills.setText(extras.get("kills").toString());
        tvWinRatio.setText(extras.get("winRatio").toString());
        tvMatchs.setText(extras.get("matchs").toString());
        tvKillsPorGame.setText(extras.get("killsPorGame").toString());
        tvTop25.setText(extras.get("top25").toString());
        tvTop10.setText(extras.get("top10").toString());




    }




}
