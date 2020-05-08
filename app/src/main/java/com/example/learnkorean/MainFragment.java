package com.example.learnkorean;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A {@link Fragment} subclass for the main page.
 */
public class MainFragment extends Fragment {
    // Global variables
    private Button learnButton;
    private Button gameButton;
    private Button helpButton;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        // Get reference to the buttons
        learnButton = view.findViewById(R.id.learn_button);
        gameButton = view.findViewById(R.id.game_button);
        helpButton = view.findViewById(R.id.help_button);

        // Set listener to the buttons
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.learnFragmentAction);
            }
        });

        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.gameFragmentAction);
            }
        });

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.helpFragmentAction);
            }
        });

        return view;
    }
}
