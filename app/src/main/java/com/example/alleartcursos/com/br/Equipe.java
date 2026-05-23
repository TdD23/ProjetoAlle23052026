package com.example.alleartcursos.com.br;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.alleartcursos.alleartcursos.R;

public class Equipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipe);
    }
    public void clickVoltar(View view) {

        finish();
    }
}
