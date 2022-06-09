package de.lavego.saleTerminal.ui.nexo;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import de.lavego.saleTerminal.R;
import de.lavego.saleTerminal.ui.nexo.model.NexoViewModel;

public class NexoFragment extends Fragment
{
    private NexoViewModel nexoViewModel = null;
    private TextView      response      = null;
    
    private static void onChanged(String s) {Log.v("NEXO", s);}
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
    
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_nexo, container, false);
        response = root.findViewById(R.id.response);
        response.setMovementMethod(new ScrollingMovementMethod());
        
        return root;
    }
    
    @Override
    public void onViewCreated(@NonNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        
        final Activity self = getActivity();
        if (self != null)
        {
            nexoViewModel = new ViewModelProvider(getActivity()).get(NexoViewModel.class);
            nexoViewModel.getText().observe(getActivity(), s -> response.setText(s));
        }
    }
    
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.nexo, menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        if (item.getItemId() == R.id.action_login)
        {
            changeSubFragment(new LoginFragment());
        }
        else if (item.getItemId() == R.id.action_logout)
        {
            changeSubFragment(new LogoutFragment());
        }
        else if (item.getItemId() == R.id.action_reconciliation)
        {
            changeSubFragment(new ReconciliationFragment());
        }
        else if (item.getItemId() == R.id.action_payment)
        {
            changeSubFragment(new PaymentFragment());
        }
        
        return super.onOptionsItemSelected(item);
    }
    
    private void changeSubFragment(@NonNull Fragment newFragment)
    {
        FragmentTransaction ft      = getChildFragmentManager().beginTransaction();
        final Fragment      current = getChildFragmentManager().findFragmentById(R.id.nexo_sub_fragment);
        
        if (current != null)
        {
            ft.replace(R.id.nexo_sub_fragment, newFragment);
        }
        else
        {
            ft.add(R.id.nexo_sub_fragment, newFragment);
        }
        
        ft.commit();
    }
    
    @Override
    public void onOptionsMenuClosed(@NonNull Menu menu)
    {
        super.onOptionsMenuClosed(menu);
    }
}
