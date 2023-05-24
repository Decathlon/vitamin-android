package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.decathlon.design.sample.databinding.FragmentRatingsBinding
import java.math.BigDecimal
import java.math.RoundingMode
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
        setupInteractiveRating()
    }

    override fun showResetOption(): Boolean = true

    override fun onResetClick() {
        updateReadOnlyNote()
        with(binding) {
            readOnlyCommentsSwitch.isChecked = false
            readOnlyCompactSwitch.isChecked = false
            readOnlyEmphasisSwitch.isChecked = false
            interactiveRatingView.progress = 0
            interactiveEmphasisSwitch.isChecked = false
        }
    }

    private fun setupReadOnlyRating() {
        updateReadOnlyNote()
        with(binding) {
            readOnlyCommentsSwitch.setOnCheckedChangeListener { _, isChecked ->
                readOnlyRatingView.showComments = isChecked
            }
            readOnlyCompactSwitch.setOnCheckedChangeListener { _, isChecked ->
                readOnlyRatingView.compact = isChecked
            }
            readOnlyEmphasisSwitch.setOnCheckedChangeListener { _, isChecked ->
                readOnlyRatingView.emphasis = isChecked
            }
            readOnlyRatingView.setOnClickListener {
                Toast.makeText(it.context, "Rating component has been clicked", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    private fun updateReadOnlyNote() {
        val rawNote = Random.nextDouble(0.0, 5.0)
        note = BigDecimal(rawNote).setScale(1, RoundingMode.HALF_UP).toFloat()
        commentsCount = Random.nextInt(0, 1000)
        binding.readOnlyRatingView.note = note
        binding.readOnlyRatingView.commentsCount = commentsCount
    }

    private fun setupInteractiveRating() {
        with(binding) {
            interactiveEmphasisSwitch.setOnCheckedChangeListener { _, isChecked ->
                interactiveRatingView.emphasis = isChecked
            }
        }
    }
}