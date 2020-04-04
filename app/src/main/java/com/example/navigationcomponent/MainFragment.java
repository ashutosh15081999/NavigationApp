package com.example.navigationcomponent;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    NavController navController;

    private ViewGroup root;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);


        Button view_transactions_btn = (Button)view.findViewById(R.id.view_transactions_btn);

        view_transactions_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this is to navigate to the corrosponding fragment
                Navigation.findNavController(v).navigate(R.id.action_mainFragment_to_viewTransactionFragment2);
            }
        });

        //or
        // view_transactions_btn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_viewTransactionFragment2, null));.

        Button send_money_btn = (Button)view.findViewById(R.id.send_money_btn);
        send_money_btn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_chooseRecipientFragment, null));

        Button view_balance_btn = (Button)view.findViewById(R.id.view_balance_btn);
        view_balance_btn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_mainFragment_to_viewBalanceFragment, null));
        //navController

    }





}
