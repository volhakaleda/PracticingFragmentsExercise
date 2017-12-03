package nyc.c4q.fragmentsinclassanimation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class NextFragment extends Fragment {

    View rootView;
    TextView textView;


    public NextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_next, container, false);

        textView = (TextView) rootView.findViewById(R.id.next_fragment_text_view);

        Bundle bundle = getArguments();
        String textString = bundle.getString("key for edit text");

        CheckingInput checkingInput = new CheckingInput(textString);
        textView.setText(checkingInput.getValue());


        return rootView;

    }

}
