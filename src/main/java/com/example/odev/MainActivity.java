package com.example.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Login;
    EditText KullaniciAdi ,KullaniciSifre;
    int sayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login=findViewById(R.id.btnLogin);
        KullaniciAdi=findViewById(R.id.txtKadi);
        KullaniciSifre=findViewById(R.id.txtPass);
        sayac=0;
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    public void login(){
        String user = KullaniciAdi.getText().toString().trim();
        String pass = KullaniciSifre.getText().toString().trim();

        if(user.equals("kubrauyanik")&&pass.equals("1234")){
            Intent anasayfa=new Intent(MainActivity.this, Anasayfa.class);
            startActivity(anasayfa);
        }

        else {
            ++sayac;
            Toast.makeText(this,sayac+" kere yanlış giriş yaptınız",Toast.LENGTH_LONG).show();

            if(sayac==3){
                Login.setClickable(false);
            }
        }
    }
}
