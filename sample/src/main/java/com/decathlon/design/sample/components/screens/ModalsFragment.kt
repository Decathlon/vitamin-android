package com.decathlon.design.sample.components.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decathlon.design.sample.R
import com.decathlon.design.sample.databinding.FragmentModalsBinding
import com.decathlon.vitamin.modals.VitaminModalBuilder
import com.decathlon.vitamin.modals.VitaminModalBuilderCentered

const val lorem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."

class ModalsFragment : ComponentFragment() {

    private lateinit var binding: FragmentModalsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentModalsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ad.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setMessage("Body 3")
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adMessage2Actions.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setMessage("Body 3")
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adTitle2Actions.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adTitleMessage3LongActions.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setMessage("Body 3")
                    .setNegativeButton("This is a long decline message", null)
                    .setPositiveButton("This is a long accept message", null)
                    .setNeutralButton("This is a long neutral message", null)
                    .show()
            }
        }
        binding.adIconTitleMessage2Actions.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setIcon(R.drawable.ic_vtmn_map_pin_line)
                    .setTitle("Subtitle 1")
                    .setMessage("Body 3")
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adItemsList.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setItems(arrayOf("Choice1 - Body 3", "Choice2 - Body 3", "Choice3 - Body 3"), null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adMultiSelectList.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setMultiChoiceItems(arrayOf("Choice1 - Body 3", "Choice2 - Body 3", "Choice3 - Body 3"), booleanArrayOf(false, false, false), null)
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adSingleSelectList.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setSingleChoiceItems(arrayOf("Choice1 - Body 3", "Choice2 - Body 3", "Choice3 - Body 3"), 0, null)
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adScrollingContentTitleActions.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setTitle("Subtitle 1")
                    .setMessage("$lorem $lorem $lorem")
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
        binding.adScrollingContent.setOnClickListener {
            this.context?.let {
                VitaminModalBuilder(it)
                    .setMessage("$lorem $lorem $lorem $lorem")
                    .show()
            }
        }
        binding.adIconTitleMessage2FullWidthActions.setOnClickListener {
            this.context?.let {
                VitaminModalBuilderCentered(it)
                    .setIcon(R.drawable.ic_vtmn_android_line)
                    .setTitle("Subtitle 1")
                    .setMessage("Body 3")
                    .setNegativeButton("Decline", null)
                    .setPositiveButton("Accept", null)
                    .show()
            }
        }
    }

}