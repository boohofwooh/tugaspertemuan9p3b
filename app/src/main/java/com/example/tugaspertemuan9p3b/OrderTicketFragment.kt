package com.example.tugaspertemuan9p3b

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tugaspertemuan9p3b.databinding.FragmentOrderTicketBinding

class OrderTicketFragment : Fragment() {
    private lateinit var binding: FragmentOrderTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            val ticketOptions = arrayOf("First Class Ticket", "Business Class Ticket", "Economy Class Ticket")

            val spinner = spinnerTicket
            val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, ticketOptions)

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View?, position: Int, id: Long) {
                    if (position == 0) {

                    } else {

                    }
                }

                override fun onNothingSelected(parentView: AdapterView<*>) {

                }
            }

            btnBuy.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}
