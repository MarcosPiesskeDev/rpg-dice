package br.com.example.rpg_dice.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import br.com.example.rpg_dice.DiceResultActivity;
import br.com.example.rpg_dice.HistoryActivity;
import br.com.example.rpg_dice.R;
import br.com.example.rpg_dice.util.DiceMethods;

public class DicesActivityController {

    private Context context;
    private Activity activity;
    private Button btn;
    private String valueDice;
    private List<String> listHistory = new ArrayList();

    public DicesActivityController(Context context) {
        this.context = context;
        this.activity =  (Activity) context;
        rollDiceD3();
        rollDiceD4();
        rollDiceD6();
        rollDiceD8();
        rollDiceD10();
        rollDiceD12();
        rollDiceD20();
        rollDiceD100();
        flipCoin();
        rollDirection();
        showHistory();
    }

//================= ROLL DICES IMPL ================

    public void rollDiceD3() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d3);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d3());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-3");
            listHistory.add("\n D-3 -> "+  valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDiceD4() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d4);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d4());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-4");
            listHistory.add("\n D-4 -> "+  valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDiceD6() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d6);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d6());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-6");
            activity.startActivity(i);
            listHistory.add("\n D-6 -> "+ valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
        });
    }

    public void rollDiceD8(){
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d8);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d8());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-8");
            listHistory.add("\n D-8 -> "+ valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDiceD10() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d10);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d10());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-10");
            listHistory.add("\n D-10 -> "+ valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDiceD12(){
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d12);
        btn.setOnClickListener( v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d12());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-12");
            listHistory.add("\n D-12 -> "+valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDiceD20() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d20);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d20());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-20");
            listHistory.add("\n D-20 -> "+  valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDiceD100() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_d100);
        btn.setOnClickListener(v -> {
            rollDiceSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = Integer.toString(dm.d100());
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "D-100");
            listHistory.add("\n D-100 -> "+ valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void flipCoin() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_coin);
        btn.setOnClickListener(v -> {
            flipCoinSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = dm.coinDice();
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "Coin");
            listHistory.add("\n Coin -> "+ valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
        });
    }

    public void rollDirection() {
        SimpleDateFormat formatTNow = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        DiceMethods dm = new DiceMethods();
        btn = activity.findViewById(R.id.b_dice_compass);
        btn.setOnClickListener(v -> {
            compassSoundE();
            Intent i = new Intent(context, DiceResultActivity.class);
            valueDice = dm.compassDice();
            i.putExtra("valueDice", valueDice);
            i.putExtra("kindOfDice", "Compass");
            listHistory.add("\n Compass -> "+ valueDice+"   ["+formatTNow.format(System.currentTimeMillis())+" BRST] \n");
            activity.startActivity(i);
            System.out.println("My History -> "+ listHistory);
        });
    }

//=============== HISTORY METHOD ===================
    public void showHistory(){
        btn = activity.findViewById(R.id.b_history_dices);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(context, HistoryActivity.class);
            i.putExtra("historyDices", listHistory.toString());
            activity.startActivity(i);
        });
    }

//========== SOUND EFFECT METHODS ============
    private void rollDiceSoundE() {
        final MediaPlayer mp = MediaPlayer.create(context, R.raw.rolling_dices_se);
        mp.start();
        try {
            TimeUnit.MILLISECONDS.sleep(800l);
            mp.stop();
        }catch (InterruptedException ie){
            Thread.currentThread().interrupt();
        }
    }

    private void flipCoinSoundE(){
        final MediaPlayer mp = MediaPlayer.create(context, R.raw.coin_flip_se);
        mp.start();
        try {
            TimeUnit.MILLISECONDS.sleep(2500l);
            mp.stop();
        }catch (InterruptedException ie){
            Thread.currentThread().interrupt();
        }
    }
    private void compassSoundE(){
        final MediaPlayer mp = MediaPlayer.create(context, R.raw.compass_se);
        mp.start();
        try{
            TimeUnit.SECONDS.sleep(1l);
            mp.stop();
        }catch (InterruptedException ie){
            Thread.currentThread().interrupt();
        }
    }
}
