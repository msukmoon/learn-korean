package com.example.learnkorean;

import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


/**
 * A {@link Fragment} subclass for the learn page.
 */
public class LearnFragment extends Fragment {
    // Global variables
    private ArrayList<Character> characters;
    private ArrayList<Integer> randomNumbers;

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
    private Button button11;
    private Button button12;

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
    private boolean button11Clicked;
    private boolean button12Clicked;

    private int clickedButtonColor;
    private int unclickedButtonColor;
    private int clickedButtonTextColor;
    private int unclickedButtonTextColor;

    public LearnFragment() {
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
     *
     * @param max type int, maximum range (highest possible number) of random numbers
     */
    private void generateRandomNumbers(int max) {
        Random random = new Random();
        int counter = 0;            // Incremented from zero to max
        int numerator = 12;         // Decremented from 12 to zero
        int denominator = max;      // Decremented from max

        while(counter < max && numerator > 0) {
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
        randomNumbers = new ArrayList<Integer>(12);

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
        button11Clicked = false;
        button12Clicked = false;

        // Load character list from the dataset
        int datasetSize = loadDataset(R.raw.dataset);

        // Generate random numbers
        generateRandomNumbers(datasetSize);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn, container, false);

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
        button11 = view.findViewById(R.id.button11);
        button12 = view.findViewById(R.id.button12);

        // Get colors from the resource
        clickedButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorLearnButtonClicked, null);
        unclickedButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null);
        clickedButtonTextColor = ResourcesCompat.getColor(getResources(), R.color.colorLearnButtonTextClicked, null);
        unclickedButtonTextColor = ResourcesCompat.getColor(getResources(), R.color.colorLearnButtonTextUnclicked, null);

        // Set button text
        button1.setText(characters.get(randomNumbers.get(0)).getKorean());
        button2.setText(characters.get(randomNumbers.get(1)).getKorean());
        button3.setText(characters.get(randomNumbers.get(2)).getKorean());
        button4.setText(characters.get(randomNumbers.get(3)).getKorean());
        button5.setText(characters.get(randomNumbers.get(4)).getKorean());
        button6.setText(characters.get(randomNumbers.get(5)).getKorean());
        button7.setText(characters.get(randomNumbers.get(6)).getKorean());
        button8.setText(characters.get(randomNumbers.get(7)).getKorean());
        button9.setText(characters.get(randomNumbers.get(8)).getKorean());
        button10.setText(characters.get(randomNumbers.get(9)).getKorean());
        button11.setText(characters.get(randomNumbers.get(10)).getKorean());
        button12.setText(characters.get(randomNumbers.get(11)).getKorean());

        // Set listener to the buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button1Clicked) {
                    button1.setText(characters.get(randomNumbers.get(0)).getEnglish());
                    button1.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button1Clicked = true;
                }
                else {
                    button1.setText(characters.get(randomNumbers.get(0)).getKorean());
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
                    button2.setText(characters.get(randomNumbers.get(1)).getEnglish());
                    button2.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button2Clicked = true;
                }
                else {
                    button2.setText(characters.get(randomNumbers.get(1)).getKorean());
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
                    button3.setText(characters.get(randomNumbers.get(2)).getEnglish());
                    button3.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button3Clicked = true;
                }
                else {
                    button3.setText(characters.get(randomNumbers.get(2)).getKorean());
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
                    button4.setText(characters.get(randomNumbers.get(3)).getEnglish());
                    button4.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button4Clicked = true;
                }
                else {
                    button4.setText(characters.get(randomNumbers.get(3)).getKorean());
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
                    button5.setText(characters.get(randomNumbers.get(4)).getEnglish());
                    button5.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button5Clicked = true;
                }
                else {
                    button5.setText(characters.get(randomNumbers.get(4)).getKorean());
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
                    button6.setText(characters.get(randomNumbers.get(5)).getEnglish());
                    button6.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button6Clicked = true;
                }
                else {
                    button6.setText(characters.get(randomNumbers.get(5)).getKorean());
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
                    button7.setText(characters.get(randomNumbers.get(6)).getEnglish());
                    button7.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button7Clicked = true;
                }
                else {
                    button7.setText(characters.get(randomNumbers.get(6)).getKorean());
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
                    button8.setText(characters.get(randomNumbers.get(7)).getEnglish());
                    button8.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button8Clicked = true;
                }
                else {
                    button8.setText(characters.get(randomNumbers.get(7)).getKorean());
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
                    button9.setText(characters.get(randomNumbers.get(8)).getEnglish());
                    button9.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button9Clicked = true;
                }
                else {
                    button9.setText(characters.get(randomNumbers.get(8)).getKorean());
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
                    button10.setText(characters.get(randomNumbers.get(9)).getEnglish());
                    button10.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button10Clicked = true;
                }
                else {
                    button10.setText(characters.get(randomNumbers.get(9)).getKorean());
                    button10.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button10Clicked = false;
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button11Clicked) {
                    button11.setText(characters.get(randomNumbers.get(10)).getEnglish());
                    button11.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button11Clicked = true;
                }
                else {
                    button11.setText(characters.get(randomNumbers.get(10)).getKorean());
                    button11.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button11Clicked = false;
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button12Clicked) {
                    button12.setText(characters.get(randomNumbers.get(11)).getEnglish());
                    button12.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedButtonColor);
                    button12Clicked = true;
                }
                else {
                    button12.setText(characters.get(randomNumbers.get(11)).getKorean());
                    button12.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedButtonColor);
                    button12Clicked = false;
                }
            }
        });

        return view;
    }
}
