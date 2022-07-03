package com.claudemirandrade.library.author;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.claudemirandrade.library.R;

public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }
// metodo necessario para criacao do item author no menu.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (savedInstanceState == null) {
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_author, new ListFragment()).commit();
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.author_fragment_main, container, false);
    }
}