package com.example.techkartadmin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.techkartadmin.R
import com.example.techkartadmin.databinding.ItemCategoryLayoutBinding
import com.example.techkartadmin.model.CategoryModel

class categoryAdapter(var context: Context, val list : ArrayList<CategoryModel>): RecyclerView.Adapter<categoryAdapter.CategoryViewHolder>() {

    inner class CategoryViewHolder(view: View): RecyclerView.ViewHolder(view){
        var binding = ItemCategoryLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category_layout, parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.textView2.text = list[position].cate
        Glide.with(context).load(list[position].img).into(holder.binding.imageView2)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}