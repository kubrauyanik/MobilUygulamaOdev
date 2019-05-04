package com.example.odev;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends Activity {
    Button sayi_0,sayi_1,sayi_2,sayi_3,sayi_4,sayi_5,sayi_6,sayi_7,sayi_8,sayi_9,sayi_topla,sayi_cikar,sayi_carp,sayi_bol,sayi_sil,hesapla;
    TextView display;
    private float ilkdeger=0;
    private double sonuc=0;
    private String islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        hesapla=(Button)findViewById(R.id.hesapla);
        sayi_0=(Button)findViewById(R.id.sayi_0);
        sayi_1=(Button)findViewById(R.id.sayi_1);
        sayi_2=(Button)findViewById(R.id.sayi_2);
        sayi_3=(Button)findViewById(R.id.sayi_3);
        sayi_4=(Button)findViewById(R.id.sayi_4);
        sayi_5=(Button)findViewById(R.id.sayi_5);
        sayi_6=(Button)findViewById(R.id.sayi_6);
        sayi_7=(Button)findViewById(R.id.sayi_7);
        sayi_8=(Button)findViewById(R.id.sayi_8);
        sayi_9=(Button)findViewById(R.id.sayi_9);
        sayi_topla=(Button)findViewById(R.id.sayi_topla);
        sayi_cikar=(Button)findViewById(R.id.sayi_cikar);
        sayi_carp=(Button)findViewById(R.id.sayi_carp);
        sayi_bol=(Button)findViewById(R.id.sayi_bol);
        sayi_sil=(Button)findViewById(R.id.sayi_sil);
        display=(TextView)findViewById(R.id.display);
        sayi_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"0");
            }
        });

        sayi_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"1");

            }
        });
        sayi_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"2");

            }
        });
        sayi_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"3");

            }
        });
        sayi_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"4");

            }
        });
        sayi_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"5");

            }
        });
        sayi_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"6");

            }
        });
        sayi_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"7");

            }
        });
        sayi_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"8");

            }
        });
        sayi_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText()+"9");

            }
        });
        try{

            sayi_sil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=0;
                    sonuc=0;
                    display.setText("");
                }
            });
        }
        catch (Exception c){}

        try{

            sayi_topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=0;
                    sonuc=0;
                    if(!display.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(display.getText().toString());
                        display.setText("");
                        islem="Toplama";

                    }

                }
            });
        }
        catch (Exception c){}

        try{

            sayi_cikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=0;
                    sonuc=0;
                    if(!display.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(display.getText().toString());
                        display.setText("");
                        islem="Cikarma";

                    }

                }
            });
        }
        catch (Exception c){}

        try{

            sayi_carp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=0;
                    sonuc=0;
                    if(!display.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(display.getText().toString());
                        display.setText("");
                        islem="Carpma";

                    }

                }
            });
        }
        catch (Exception c){}

        try{

            sayi_bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger=0;
                    sonuc=0;
                    if(!display.getText().toString().equals("")){
                        ilkdeger=Float.parseFloat(display.getText().toString());
                        display.setText("");
                        islem="Bolme";

                    }

                }
            });
        }
        catch (Exception c){}
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!display.getText().toString().equals("") && !String.valueOf(ilkdeger).equals("0")){
                    if(islem.equals("Toplama")){
                        sonuc=ilkdeger + Float.parseFloat(display.getText().toString());
                    }
                    else if(islem.equals("Cikarma")){
                        sonuc=ilkdeger - Float.parseFloat(display.getText().toString());

                    }
                    else if(islem.equals("Carpma")){
                        sonuc=ilkdeger * Float.parseFloat(display.getText().toString());

                    }

                    else if(islem.equals("Bolme")){
                        sonuc=ilkdeger / Float.parseFloat(display.getText().toString());

                    }
                    display.setText(String.valueOf(sonuc));
                    ilkdeger=0;
                    sonuc=0;

                }
                else{
                    display.setText("Deger Girmediniz..");

                }
                if (R.id.sayi_sil == view.getId()) {
                    ilkdeger=0;
                    sonuc=0;
                    display.setText("");
                }
            }
        });

    }
}