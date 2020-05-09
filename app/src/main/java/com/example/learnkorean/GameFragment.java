package com.example.learnkorean;

import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * A {@link Fragment} subclass for the game page.
 */
public class GameFragment extends Fragment {
    // Global variables
    private ArrayList<Character> characters;
    private ArrayList<Integer> randomNumbers;

    private int datasetSize;

    private TextView scoreTextView;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;

    private boolean button1Clicked;
    private boolean button2Clicked;
    private boolean button3Clicked;
    private boolean button4Clicked;
    private boolean button5Clicked;
    private boolean button6Clicked;
    private boolean button7Clicked;
    private boolean button8Clicked;
    private boolean button9Clicked;
    private boolean button10Clicked;

    private int score;

    private int clickedButtonColor;
    private int unclickedButtonColor;
    private int clickedButtonTextColor;
    private int unclickedButtonTextColor;

    public GameFragment() {
        // Required empty public constructor
    }

    /**
     * Method to load dataset to characters list
     *
     * @param resourceId type int, id of a dataset resource
     * @return type int, size of a dataset
     */
    private int loadDataset(int resourceId) {
        InputStream is = this.getResources().openRawResource(resourceId);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        int datasetSize = 0;
        String korean = null;
        String english = null;

        try {
            // Read the first line that contains the size of the dataset
            datasetSize = Integer.parseInt(br.readLine());

            // While the next line is not null
            while ((null != (korean = br.readLine())) && (null != (english = br.readLine()))) {
                characters.add(new Character(korean, english));
            }

            is.close();
            br.close();
        }
        catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }

        return datasetSize;
    }

    /**
     * Method to generate random numbers to randomNumbers list
     */
    private void generateRandomNumbers() {
        Random random = new Random();
        int counter = 0;                    // Incremented from zero to max
        int numerator = 5;                  // Decremented from 5 to zero
        int denominator = datasetSize;      // Decremented from datasetSize

        while(counter < datasetSize && numerator > 0) {
            if (random.nextDouble() < (double) numerator / denominator) {
                randomNumbers.add(counter);
                numerator--;
            }
            counter++;
            denominator--;
        }

        // Shuffle list randomly
        Collections.shuffle(randomNumbers);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize global variables on creating this fragment
        characters = new ArrayList<Character>();
        randomNumbers = new ArrayList<Integer>(5);

        score = 0;

        button1Clicked = false;
        button2Clicked = false;
        button3Clicked = false;
        button4Clicked = false;
        button5Clicked = false;
        button6Clicked = false;
        button7Clicked = false;
        button8Clicked = false;
        button9Clicked = false;
        button10Clicked = false;

        // Load character list from the dataset
        datasetSize = loadDataset(R.raw.dataset);

        // Generate random numbers
        generateRandomNumbers();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        // Get reference to the score text view
        scoreTextView = view.findViewById(R.id.scoreTextView);

        // Get reference to the buttons
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);
        button7 = view.findViewById(R.id.button7);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);
        button10 = view.findViewById(R.id.button10);

        // Get colors from the resource
        clickedButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorGameButtonClicked, null);
        unclickedButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null);
        clickedButtonTextColor = ResourcesCompat.getColor(getResources(), R.color.colorGameButtonTextClicked, null);
        unclickedButtonTextColor = ResourcesCompat.getColor(getResources(), R.color.colorGameButtonTextUnclicked, null);

        // Set text of score text view
        scoreTextView.setText(getString(R.string.score_text) + score);

        // Set button text
        button1.setText(characters.get(randomNumbers.get(0)).getKorean());
        button2.setText(characters.get(randomNumbers.get(0)).getEnglish());
        button3.setText(characters.get(randomNumbers.get(1)).getKorean());
        button4.setText(characters.get(randomNumbers.get(1)).getEnglish());
        button5.setText(characters.get(randomNumbers.get(2)).getKorean());
        button6.setText(characters.get(randomNumbers.get(2)).getEnglish());
        button7.setText(characters.get(randomNumbers.get(3)).getKorean());
        button8.setText(characters.get(randomNumbers.get(3)).getEnglish());
        button9.setText(characters.get(randomNumbers.get(4)).getKorean());
        button10.setText(characters.get(randomNumbers.get(4)).getEnglish());

        // Set listener to the buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button1Clicked) {
                    button1.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button1Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button1.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button1Clicked = false;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button2Clicked) {
                    button2.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button2Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button2.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button2Clicked = false;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button3Clicked) {
                    button3.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button3Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button3.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button3Clicked = false;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button4Clicked) {
                    button4.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button4Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button4.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button4Clicked = false;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button5Clicked) {
                    button5.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button5Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button5.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button5Clicked = false;
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button6Clicked) {
                    button6.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button6Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button6.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button6Clicked = false;
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button7Clicked) {
                    button7.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button7Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button7.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button7Clicked = false;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button8Clicked) {
                    button8.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button8Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button8.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button8Clicked = false;
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button9Clicked) {
                    button9.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button9Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button9.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button9Clicked = false;
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button10Clicked) {
                    button10.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button10Clicked = true;
                    scoreTextView.setText(getString(R.string.score_text) + (++score));
                }
                else {
                    button10.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button10Clicked = false;
                }
            }
        });

        return view;
    }
}
