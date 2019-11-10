package br.com.frcnetto.cryptowallet.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import br.com.frcnetto.cryptowallet.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val userGreetings = root.findViewById<TextView>(R.id.userGreetings)
        val userMessage = root.findViewById<TextView>(R.id.userMessage)

        homeViewModel.userGreetings.observe(this, Observer {
            userGreetings.text = it
        })
        homeViewModel.userMessage.observe(this, Observer {
            userMessage.text = it
        })

        return root
    }
}