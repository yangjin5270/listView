package com.td.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
            "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};

    List<Fruit> fruitList = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        initFruitArray();
        FrutiArray arrayAdapter = new FrutiArray(
                            this,R.layout.fruit_item,fruitList);
        listView1.setAdapter(arrayAdapter);
    }

    public void initFruitArray(){

        for (int i=0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.banana);
            fruitList.add(banana);
            Fruit orange =  new Fruit("Orange",R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear",R.drawable.pear);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape",R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple",R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry",R.drawable.strawberry);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry",R.drawable.cherry);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango",R.drawable.mango);
            fruitList.add(mango);

        }

    }


}
