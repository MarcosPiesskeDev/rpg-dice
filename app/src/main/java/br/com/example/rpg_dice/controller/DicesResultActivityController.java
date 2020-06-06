package br.com.example.rpg_dice.controller;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

import br.com.example.rpg_dice.R;

public class DicesResultActivityController {

    private Context context;
    private Activity activity;
    private TextView txt;
    private Button btn;
    private String s;

    public DicesResultActivityController(Context context) {
        this.context = context;
        this.activity = (Activity) context;
        textResultDices();
        kindDice();
        backDices();
    }

    public void textResultDices(){
        txt = activity.findViewById(R.id.result_dice_txt);
        s = activity.getIntent().getExtras().getString("valueDice");
        txt.setText(s);
    }

    public void kindDice(){
        txt = activity.findViewById(R.id.kind_of_dice);
        s = activity.getIntent().getExtras().getString("kindOfDice");
        txt.setText(s);
    }

    public void backDices() {
        btn = activity.findViewById(R.id.b_back_dices);
        btn.setOnClickListener(bView -> {
            activity.finish();
        });
    }
}
