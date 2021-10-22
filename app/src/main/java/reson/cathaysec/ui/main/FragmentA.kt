package reson.cathaysec.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import reson.cathaysec.R
import java.text.SimpleDateFormat
import java.util.*

class FragmentA : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_a, container, false)

        val layoutManager = LinearLayoutManager(this.context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        val dataList = root.findViewById<RecyclerView>(R.id.recyclerview)
        dataList.layoutManager = layoutManager
        dataList.adapter = RecyclerAdapter(getDateList())

        val tabs = activity?.findViewById<TabLayout>(R.id.tabs)
        val btn = root.findViewById<Button>(R.id.button1)
        btn.setOnClickListener{
            tabs?.getTabAt(1)?.select()
        }

        return root
    }

    fun getDateList(): List<String> {
        val curFormater = SimpleDateFormat("MM/dd (EEEE)")
        val date = GregorianCalendar()
        var dateList = arrayListOf<String>()
        for (day in 0..19) {
            dateList.add(curFormater.format(date.getTime()))
            date.roll(Calendar.DAY_OF_YEAR, true)
        }
        return dateList
    }
}