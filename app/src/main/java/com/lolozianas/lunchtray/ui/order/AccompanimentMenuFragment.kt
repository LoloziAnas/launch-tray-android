package com.lolozianas.lunchtray.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lolozianas.lunchtray.R

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class AccompanimentMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accompaniment_menu, container, false)
    }
}