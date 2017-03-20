package ru.samsung.itschool.book.debugexamplr232;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    private static final String LOG_TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(LOG_TAG, "Matrix: \n" + matrixToString(createMatrix(5, 5)));
    }

    public int[][] createMatrix(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public String matrixToString(int[][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
