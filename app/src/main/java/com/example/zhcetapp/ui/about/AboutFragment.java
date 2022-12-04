package com.example.zhcetapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.zhcetapp.R;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

private ViewPager viewPager;
private  BranchAdapter adapter;
private List<BranchModel> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about, container, false);
       list = new ArrayList<>();
       list.add(new BranchModel(R.drawable.ic_computer_24,"Computer Engineering", "The Department of Computer Engineering was "));
        list.add(new BranchModel(R.drawable.ic_settings_24,"Mechanical Engineering", "The Department of Mechanical Engineeh a student strength of about 700"));

        adapter = new BranchAdapter(getContext(),list);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.collegeImage);
        Glide.with(getContext())
                .load("https://www.google.com/imgres?imgurl=https%3A%2F%2Flookaside.fbsbx.com%2Flookaside%2Fcrawler%2Fmedia%2F%3Fmedia_id%3D2776579842411753&imgrefurl=https%3A%2F%2Fwww.facebook.com%2FZHCETAMU%2F&tbnid=16FsmVDV1iA8zM&vet=12ahUKEwiw2JHykN_7AhVK_TgGHchrAKYQMygAegUIARCgAQ..i&docid=k-PT3nAtUDZhJM&w=640&h=489&itg=1&q=zhcet&hl=en-GB&ved=2ahUKEwiw2JHykN_7AhVK_TgGHchrAKYQMygAegUIARCgAQ")
                .into(imageView);

        return view;
    }
}