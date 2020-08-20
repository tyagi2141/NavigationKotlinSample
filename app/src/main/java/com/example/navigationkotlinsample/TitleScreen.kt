

package com.example.navigationkotlinsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * Shows the main title screen.
 */
class TitleScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_title_screen, container, false)

        view.findViewById<Button>(R.id.play_btn).setOnClickListener {
           Navigation.findNavController(view).navigate(R.id.action_titleScreen_to_register)
        }
        view.findViewById<Button>(R.id.leaderboard_btn).setOnClickListener {
           Navigation.findNavController(view).navigate(R.id.action_titleScreen_to_leaderboard)
        }

        return view
    }
}
