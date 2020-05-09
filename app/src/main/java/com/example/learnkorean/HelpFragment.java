package com.example.learnkorean;

import android.os.Bundle;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A {@link Fragment} subclass for the tutorial page.
 */
public class HelpFragment extends Fragment {
    // Global variables
    private Button learnButton;
    private Button gameButton1;
    private Button gameButton2;

    private boolean learnButtonClicked;
    private boolean gameButton1Clicked;
    private boolean gameButton2Clicked;

    private int clickedLearnButtonColor;
    private int unclickedLearnButtonColor;
    private int clickedGameButtonColor;
    private int unclickedGameButtonColor;
    private int clickedButtonTextColor;
    private int unclickedButtonTextColor;

    public HelpFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Reset all button clicked to false
        learnButtonClicked = false;
        gameButton1Clicked = false;
        gameButton2Clicked = false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help, container, false);

        // Get reference to the buttons
        learnButton = view.findViewById(R.id.learn_button);
        gameButton1 = view.findViewById(R.id.game_button_1);
        gameButton2 = view.findViewById(R.id.game_button_2);

        // Get colors from the resource
        clickedLearnButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorLearnButtonClicked, null);
        unclickedLearnButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null);
        clickedGameButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorGameButtonClicked, null);
        unclickedGameButtonColor = ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null);
        clickedButtonTextColor = ResourcesCompat.getColor(getResources(), R.color.colorLearnButtonTextClicked, null);
        unclickedButtonTextColor = ResourcesCompat.getColor(getResources(), R.color.colorLearnButtonTextUnclicked, null);

        // Set button text
        learnButton.setText(R.string.help_sample_korean_text);
        gameButton1.setText(R.string.help_sample_korean_text);
        gameButton2.setText(R.string.help_sample_english_text);

        // Set listener to the buttons
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == learnButtonClicked) {
                    learnButton.setText(R.string.help_sample_english_text);
                    learnButton.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedLearnButtonColor);
                    learnButtonClicked = true;
                }
                else {
                    learnButton.setText(R.string.help_sample_korean_text);
                    learnButton.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedLearnButtonColor);
                    learnButtonClicked = false;
                }
            }
        });
        gameButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == gameButton1Clicked) {
                    gameButton1.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedGameButtonColor);
                    gameButton1Clicked = true;
                }
                else {
                    gameButton1.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedGameButtonColor);
                    gameButton1Clicked = false;
                }
            }
        });
        gameButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == gameButton2Clicked) {
                    gameButton2.setTextColor(clickedButtonTextColor);
                    view.setBackgroundColor(clickedGameButtonColor);
                    gameButton2Clicked = true;
                }
                else {
                    gameButton2.setTextColor(unclickedButtonTextColor);
                    view.setBackgroundColor(unclickedGameButtonColor);
                    gameButton2Clicked = false;
                }
            }
        });

        return view;
    }
}
