package io.github.sahalnazar.activitiestofragments.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.github.sahalnazar.activitiestofragments.R
import io.github.sahalnazar.activitiestofragments.databinding.FragmentMainBinding
import io.github.sahalnazar.activitiestofragments.model.Data

class MainFragment : Fragment(R.layout.fragment_main) {

    private var fragmentMainBinding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentMainBinding.bind(view)
        fragmentMainBinding = binding

        val string = "Hello World!"
        val int = 123
        val bool = true
        val list = listOf("a", "b", "c", "d")
        val dataList = listOf(Data(id = 0, value = "Hello"), Data(id = 1, value = "Universe"))

        binding.btnAnotherView.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAnotherFragment(
                string, int, bool, list.toTypedArray(), dataList.toTypedArray()
            ))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentMainBinding = null
    }
}