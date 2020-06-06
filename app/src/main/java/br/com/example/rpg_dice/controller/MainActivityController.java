package br.com.example.rpg_dice.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;

import br.com.example.rpg_dice.DicesActivity;
import br.com.example.rpg_dice.R;

public class MainActivityController {

    private Context context;
    private Activity activity;
    private Button btn;

    public MainActivityController(Context context) {
        this.context = context;
        this.activity = (Activity) context;
        showDices();
    }

    public void showDices(){
        btn = activity.findViewById(R.id.b_dices);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(context, DicesActivity.class);
            activity.startActivity(intent);
        });
    }
}
