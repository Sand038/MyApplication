package com.sand.myapplication;

import com.sematext.logseneandroid.Logsene;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  int counter = 1;
  Logsene logsene;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Logsene.init(this);
    logsene = Logsene.getInstance();
  }

  public void sendMessage(View view) {
    String log = "The counter value is: " + counter++;
    System.out.println(log);
    logsene.info(log);
  }

}