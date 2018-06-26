package com.example.prabhjot.ordersummary;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class OrderSummaryFragment extends Fragment {

    private ArrayList<OrderSummaryModel> arrayList = new ArrayList<>();
    private RecyclerView recyclerView;
    private View inflate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        inflate = inflater.inflate(R.layout.os_fragment_layout, container, false);
        recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);

        populateList(arrayList);

        OrderSummaryAdapter mAdapter = new OrderSummaryAdapter(arrayList, getActivity());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        return inflate;
    }

    private void populateList(ArrayList<OrderSummaryModel> arrayList) {
        arrayList.add(0,new OrderSummaryModel("ALBUMIN, 24HRS URINE","lab",true,"","Urinary Infection",true,"ALBUMIN,24 HRS URINE"));
        arrayList.add(1,new OrderSummaryModel("BENCE JONES PROTEIN - URINE","lab",false,"","Urinary Infection",true,"ALBUMIN,24 HRS URINE"));
        arrayList.add(2,new OrderSummaryModel("BLOOD GAS ANALYSIS , ARTERIAL","lab",true,"","Urinary Infection",true,"ALBUMIN,24 HRS URINE"));
        arrayList.add(3,new OrderSummaryModel("BLOOD GROUP(A,B,O) AND RH...","lab",false,"","Urinary Infection",true,"ALBUMIN,24 HRS URINE"));
        arrayList.add(4,new OrderSummaryModel("BUN, BLOOD UREA NITROGEN","lab",true,"","Urinary Infection",true,"ALBUMIN,24 HRS URINE"));
        arrayList.add(5,new OrderSummaryModel("CALCIUM,SERUM","lab",false,"","Urinary Infection",true,"ALBUMIN,24 HRS URINE"));
    }



}
