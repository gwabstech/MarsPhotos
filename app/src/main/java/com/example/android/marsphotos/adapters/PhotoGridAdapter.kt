package com.example.android.marsphotos.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.leanback.widget.DiffCallback
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsphotos.data.MarsPhotoModel
import com.example.android.marsphotos.databinding.GridViewItemBinding

class PhotoGridAdapter : ListAdapter<MarsPhotoModel,
        PhotoGridAdapter.MarsPhotoViewHolder>(DiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoGridAdapter.MarsPhotoViewHolder {
        return MarsPhotoViewHolder(GridViewItemBinding.inflate(
            LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PhotoGridAdapter.MarsPhotoViewHolder, position: Int) {
        val marsPhoto = getItem(position)
        holder.bind(marsPhoto)
    }

    class MarsPhotoViewHolder(private var binding:
                              GridViewItemBinding

    ):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(MarsPhoto: MarsPhotoModel) {
            binding.photo = MarsPhoto
            binding.executePendingBindings()
        }
    }


    companion object DiffCallback : DiffUtil.ItemCallback<MarsPhotoModel>() {
        override fun areItemsTheSame(oldItem: MarsPhotoModel, newItem: MarsPhotoModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MarsPhotoModel, newItem: MarsPhotoModel): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
