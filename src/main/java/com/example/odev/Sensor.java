package com.example.odev;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.RelativeLayout;

import static android.hardware.Sensor.TYPE_ACCELEROMETER;

public class Sensor extends Activity implements SensorEventListener {

    private SensorManager sensorManager;
    private Vibrator vibrator;
    RelativeLayout ly;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor);
        ly=findViewById(R.id.sensorlayout);
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        ly.setBackgroundColor(Color.RED);
        vibrator.vibrate(500);
    }

    @Override
    public void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {
        ly.setBackgroundColor(Color.YELLOW);
        vibrator.vibrate(500);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sensorManager.unregisterListener(this);
        ly.setBackgroundColor(Color.WHITE);
        vibrator.vibrate(500);
    }
}
