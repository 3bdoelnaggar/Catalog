package com.elnaggar.catalog.ui.notifications

import androidx.fragment.app.Fragment
import com.elnaggar.catalog.R
import com.elnaggar.catalog.databinding.ConstraintLayoutFragmentBinding

class ConstraintLayoutFragment : Fragment(R.layout.constraint_layout_fragment) {

    private var _binding: ConstraintLayoutFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}