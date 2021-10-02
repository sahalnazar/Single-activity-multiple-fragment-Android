package io.github.sahalnazar.activitiestofragments.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import io.github.sahalnazar.activitiestofragments.R
import io.github.sahalnazar.activitiestofragments.databinding.FragmentAnotherBinding

class AnotherFragment : Fragment(R.layout.fragment_another) {

    private var fragmentAnotherBinding: FragmentAnotherBinding? = null
    private val args by navArgs<AnotherFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentAnotherBinding.bind(view)
        fragmentAnotherBinding = binding

        binding.tvReceivedString.text = args.argString
        binding.tvReceivedInt.text = args.argInt.toString()
        binding.tvReceivedBoolean.text = args.argBool.toString()
        binding.tvReceivedList.text = args.argListString.toList().toString()
        binding.tvReceivedDataList.text = args.argDataList.toList().toString()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentAnotherBinding = null
    }
}