package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.decathlon.design.sample.databinding.FragmentRatingsBinding
import java.math.BigDecimal
import kotlin.random.Random

class RatingsFragment : ComponentFragment() {

    private lateinit var binding: FragmentRatingsBinding
    private var note: Float = 0f
    private var commentsCount: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRatingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupReadOnlyRating()
    }

    override fun showResetOption(): Boolean = true

    override fun onResetClick() {
        updateNote()
        with(binding) {
            commentsSwitch.isChecked = false
            compactSwitch.isChecked = false
            emphasisSwitch.isChecked = false
        }
    }

    private fun setupReadOnlyRating() {
        updateNote()
        with(binding) {
            commentsSwitch.setOnCheckedChangeListener { _, isChecked ->
                ratingView.showComments = isChecked
            }
            compactSwitch.setOnCheckedChangeListener { _, isChecked ->
                ratingView.compact = isChecked
            }
            emphasisSwitch.setOnCheckedChangeListener { _, isChecked ->
                ratingView.emphasis = isChecked
            }
            ratingView.setOnClickListener {
                Toast.makeText(it.context, "Rating component has been clicked", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    private fun updateNote() {
        val rawNote = Random.nextDouble(0.0, 5.0)
        note = BigDecimal(rawNote).setScale(1, BigDecimal.ROUND_HALF_UP).toFloat()
        commentsCount = Random.nextInt(0, 1000)
        binding.ratingView.note = note
        binding.ratingView.commentsCount = commentsCount
    }
}