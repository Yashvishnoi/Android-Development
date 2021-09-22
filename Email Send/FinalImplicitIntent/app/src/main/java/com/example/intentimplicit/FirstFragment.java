package com.example.intentimplicit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.intentimplicit.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    Button button;
    EditText url;
    EditText subject;
    EditText Eid;
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
            button = view.findViewById(R.id.button);
            url=view.findViewById(R.id.url);
            subject=view.findViewById(R.id.subject);
            Eid =view.findViewById(R.id.Eid);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String urlText = url.getText().toString();
                    String Sub=subject.getText().toString();
                    String add = Eid.getText().toString();
//                    Toast.makeText(z//                    startActivity(intent);
                    String[] addresses = {add};
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("*/*");
                    intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                    intent.putExtra(Intent.EXTRA_SUBJECT, Sub);
                    intent.putExtra(Intent.EXTRA_TEXT,urlText );
                    if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                        startActivity(intent);
                    }
              }

            });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}