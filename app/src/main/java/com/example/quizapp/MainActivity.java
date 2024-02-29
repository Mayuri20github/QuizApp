package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.quizapp.config.Constants;
import com.example.quizapp.data.Question;
import com.example.quizapp.databinding.ActivityMainBinding;
import com.example.quizapp.helper.QuestionGenerator;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ActivityMainBinding binding;

    private RadioButton[] checkButtons = new RadioButton[4];

    int currentIndex = 0;

    List<Question> questions;


    private int leftTime= Constants.TOTAL_EXAM_TIME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initComponents();
         startTimer();
    }
    private void submitTest(){
        Toast.makeText(this, "Test Submitted", Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        // Toast.makeText(MainActivity.this, "Timer Finished", Toast.LENGTH_SHORT).show();
        CountDownTimer timer= new CountDownTimer(Constants.TOTAL_EXAM_TIME * 1000, 1000) {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long millisUntilFinished) {
                int min = leftTime / 60;
                int sec = leftTime % 60;
                binding.timer.setText(min + " min " + sec + " sec ");
                leftTime--;


                binding.circularProgressBar.setProgress((float) leftTime / Constants.TOTAL_EXAM_TIME * 100);

            }

            @Override
            public void onFinish() {
                // Toast.makeText(MainActivity.this, "Timer Finished", Toast.LENGTH_SHORT).show();
                submitTest();
                binding.timer.setText("Finished");
            }
        };
        timer.start();
    }

    private void initComponents() {
        checkButtons[0] = binding.option1;
        checkButtons[1] = binding.option2;
        checkButtons[2] = binding.option3;
        checkButtons[3] = binding.option4;

        for (RadioButton button : checkButtons) {
            button.setOnClickListener(this);
        }
        questions = QuestionGenerator.getQuestions();
        Question question = questions.get(currentIndex);
        setQuestionToView(question, currentIndex);

        binding.nextButton.setOnClickListener(e -> {
            nextQuestion();
        });

        binding.previousButton.setOnClickListener(e -> {
            previousQuestion();
        });

        binding.submitButton.setOnClickListener(e->{
            submitTest();
        });
    }


    private void previousQuestion() {

        if ((currentIndex - 1) < 0) {
            Toast.makeText(this, "Already at 0th position", Toast.LENGTH_SHORT).show();
        } else {
            currentIndex = currentIndex - 1;
            setQuestionToView(questions.get(currentIndex), currentIndex);
        }
    }

    private void nextQuestion() {

        if ((currentIndex + 1) > questions.size() - 1) {
            Toast.makeText(this, "Already at last question", Toast.LENGTH_SHORT).show();
        } else {
            currentIndex = currentIndex + 1;
            setQuestionToView(questions.get(currentIndex), currentIndex);
        }
    }


    @Override
    public void onClick(View v) {

        RadioButton buttonClick = (RadioButton) v;
        for (RadioButton button : checkButtons) {
            button.setChecked(button.getId() == buttonClick.getId());
        }

        questions.get(currentIndex).setCheckValue(buttonClick.getId());

    }

    @SuppressLint("SetTextI18n")
    private void setQuestionToView(Question question, int index) {

        binding.question.setText((currentIndex + 1) + " ." + question.getQuestion());
        binding.option1.setText(question.getOption1());
        binding.option2.setText(question.getOption2());
        binding.option3.setText(question.getOption3());
        binding.option4.setText(question.getOption4());
        for (RadioButton button : checkButtons) {
            button.setChecked(questions.get(currentIndex).getCheckValue() == button.getId());

        }
    }
}