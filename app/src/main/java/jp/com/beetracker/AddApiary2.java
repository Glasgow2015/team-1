package jp.com.beetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;


public class AddApiary2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<String> questions = populateQuestions();
        savedInstanceState.putStringArray("questions", (String[])questions.toArray());
        super.onCreate(savedInstanceState);
    }

    private List<String> populateQuestions(){
        List<String> questions = new ArrayList<String>();
        for(int i = 0; i < 17; i++){
            questions.add(String.format("Question %d?", i));
        }
        return questions;
    }
}
