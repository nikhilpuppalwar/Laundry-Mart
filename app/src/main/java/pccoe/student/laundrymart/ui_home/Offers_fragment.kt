package pccoe.student.laundrymart.ui_home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pccoe.student.laundrymart.R
import pccoe.student.laundrymart.databinding.FragmentOffersFragmentBinding

class Offers_fragment : Fragment() {
private lateinit var binding:FragmentOffersFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOffersFragmentBinding.inflate(inflater, container, false)


        return binding.root
    }

    companion object {

    }
}