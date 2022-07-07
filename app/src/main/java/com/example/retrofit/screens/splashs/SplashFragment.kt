package com.example.retrofit.screens.splashs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.retrofit.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.lang.Exception

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_splash, container, false)
   CoroutineScope(Dispatchers.Main).launch {

       delay(1500)
       try {
           Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_rootFragment)

       }catch (e:Exception){
           Toast.makeText(requireContext(), "no internet", Toast.LENGTH_SHORT).show()
       }
   }
        return view
    }


   
}