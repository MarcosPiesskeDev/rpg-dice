package br.com.example.rpg_dice.controller;

import android.app.Activity;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import br.com.example.rpg_dice.R;

public class HistoryActivityController {

    Context context;
    Activity activity;
    TextView txtHistoryDices;
    private String s;

    public HistoryActivityController(Context context) {
        this.context = context;
        this.activity = (Activity) context;
        showHistory();
    }

    public void showHistory(){
        txtHistoryDices = activity.findViewById(R.id.history_dices_list);
        s = activity.getIntent().getExtras().getString("historyDices");
        txtHistoryDices.setText(s+"\n");
        txtHistoryDices.setMovementMethod(new ScrollingMovementMethod());
    }

}
