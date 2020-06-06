package br.com.example.rpg_dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.example.rpg_dice.controller.DicesActivityController;

public class DicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dices);
        new DicesActivityController(this);
    }
}


