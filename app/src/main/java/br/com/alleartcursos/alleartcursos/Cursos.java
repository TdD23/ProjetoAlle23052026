package br.com.alleartcursos.alleartcursos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import br.com.alleartcursos.alleartcursos.R;

public class Cursos extends AppCompatActivity {

    Intent nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
    }
    public void clickVoltar (View view){
        finish();
    }

    public void clickCurPortugal (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
    public void clickCurLingC (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
    public void clickCurAndroid (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
    public void clickCurPHP (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
    public void clickCurCSharp (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
    public void clickCurKotlin (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
    public void clickCurVideo (View view){
        nav = new Intent(Intent.ACTION_VIEW, Uri.parse("https://alleartcursos.com.br"));
        startActivity(nav);
    }
}
