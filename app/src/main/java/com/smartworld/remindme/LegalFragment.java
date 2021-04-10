package com.smartworld.remindme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LegalFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ((MainActivity)getActivity()).changeTitle("Legal", true, 1, 2);

        return inflater.inflate(R.layout.fragment_legal, container, false);

    }
}
