package reson.cathaysec.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import reson.cathaysec.R

class FragmentB : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_b, container, false)

        val tabs = activity?.findViewById<TabLayout>(R.id.tabs)
        val btn = root.findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
            tabs?.getTabAt(0)?.select()
        }

        return root
    }
}