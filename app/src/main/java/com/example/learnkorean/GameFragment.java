package com.example.learnkorean;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A {@link Fragment} subclass for the game page.
 */
public class GameFragment extends Fragment {
    // Global variables
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

    public GameFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize global variables on creating this fragment
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

        // TODO: Implement game score counts
        score = 0;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

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

        // Set button text
        button1.setText(R.string.unclick);
        button2.setText(R.string.unclick);
        button3.setText(R.string.unclick);
        button4.setText(R.string.unclick);
        button5.setText(R.string.unclick);
        button6.setText(R.string.unclick);
        button7.setText(R.string.unclick);
        button8.setText(R.string.unclick);
        button9.setText(R.string.unclick);
        button10.setText(R.string.unclick);


        // Set listener to the buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button1Clicked) {
                    button1.setText(R.string.click);
                    button1.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button1Clicked = true;
                } else {
                    button1.setText(R.string.unclick);
                    button1.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button1Clicked = false;
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button2Clicked) {
                    button2.setText(R.string.click);
                    button2.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button2Clicked = true;
                } else {
                    button2.setText(R.string.unclick);
                    button2.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button2Clicked = false;
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button3Clicked) {
                    button3.setText(R.string.click);
                    button3.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button3Clicked = true;
                } else {
                    button3.setText(R.string.unclick);
                    button3.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button3Clicked = false;
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button4Clicked) {
                    button4.setText(R.string.click);
                    button4.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button4Clicked = true;
                } else {
                    button4.setText(R.string.unclick);
                    button4.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button4Clicked = false;
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button5Clicked) {
                    button5.setText(R.string.click);
                    button5.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button5Clicked = true;
                } else {
                    button5.setText(R.string.unclick);
                    button5.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button5Clicked = false;
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button6Clicked) {
                    button6.setText(R.string.click);
                    button6.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button6Clicked = true;
                } else {
                    button6.setText(R.string.unclick);
                    button6.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button6Clicked = false;
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button7Clicked) {
                    button7.setText(R.string.click);
                    button7.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button7Clicked = true;
                } else {
                    button7.setText(R.string.unclick);
                    button7.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button7Clicked = false;
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button8Clicked) {
                    button8.setText(R.string.click);
                    button8.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button8Clicked = true;
                } else {
                    button8.setText(R.string.unclick);
                    button8.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button8Clicked = false;
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button9Clicked) {
                    button9.setText(R.string.click);
                    button9.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button9Clicked = true;
                } else {
                    button9.setText(R.string.unclick);
                    button9.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button9Clicked = false;
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(false == button10Clicked) {
                    button10.setText(R.string.click);
                    button10.setTextColor(Color.BLACK);
                    view.setBackgroundColor(Color.parseColor("#fff176"));
                    button10Clicked = true;
                } else {
                    button10.setText(R.string.unclick);
                    button10.setTextColor(Color.WHITE);
                    view.setBackgroundColor(Color.parseColor("#484848"));
                    button10Clicked = false;
                }
            }
        });

        return view;
    }
}
