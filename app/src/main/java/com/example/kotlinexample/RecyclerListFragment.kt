package com.example.kotlinexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinexample.adapter.RecyclerViewAdapter
import com.example.kotlinexample.model.RecyclerList
import com.example.kotlinexample.viewmodel.MainActivityViewModel


/**
 * A simple [Fragment] subclass.
 * Use the [RecyclerListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecyclerListFragment : Fragment() {

    private lateinit var recyclerAdapter : RecyclerViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recycler_list, container, false)
        initRecyclerView(view)
        initViewModel()
        return view
    }

    private fun initViewModel() {
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getRecyclerListObserver().observe(this, Observer<RecyclerList> {
            if (it != null){

                recyclerAdapter.setUpdatedData(it.items)

            } else{
                Toast.makeText(activity, "Error in getting data", Toast.LENGTH_LONG).show()
            }
        })

        viewModel.makeApiCall()
    }

    private fun initRecyclerView(view: View) {

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerId)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(decoration)
        recyclerAdapter = RecyclerViewAdapter()
        recyclerView.adapter = recyclerAdapter


    }

    companion object {

        @JvmStatic
        fun newInstance() = RecyclerListFragment()
    }

}