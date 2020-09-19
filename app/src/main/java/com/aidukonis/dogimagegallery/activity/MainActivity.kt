package com.aidukonis.dogimagegallery.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.aidukonis.dogimagegallery.R
import com.aidukonis.dogimagegallery.adapter.GalleryImageAdapter
import com.aidukonis.dogimagegallery.adapter.GalleryImageClickListener
import com.aidukonis.dogimagegallery.adapter.Image
import com.aidukonis.dogimagegallery.fragment.GalleryFullscreenFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GalleryImageClickListener {

    // gallery column count
    private val SPAN_COUNT = 2

    private val imageList = ArrayList<Image>()
    lateinit var galleryAdapter: GalleryImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init adapter
        galleryAdapter = GalleryImageAdapter(imageList)
        galleryAdapter.listener = this

        // init recyclerview
        recyclerView.layoutManager = GridLayoutManager(this, SPAN_COUNT)
        recyclerView.adapter = galleryAdapter

        // load images
        loadImages()
    }

    private fun loadImages() {

        // Could not figure out how to parse the images from JSON
        // So I put some of the images in manually
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1003.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1007.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1023.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_10263.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_10715.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_10822.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_10832.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_10982.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11006.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11172.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11182.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1126.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1128.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11432.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1145.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_115.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1150.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11570.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11584.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1167.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1186.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_11953.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1222.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1234.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_12364.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1254.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_12563.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1259.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_12664.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1270.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_12867.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_12879.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_12945.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1301.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13011.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13145.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13270.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1335.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13442.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13502.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1357.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_1370.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13742.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13879.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13907.jpg"))
        imageList.add(Image("https://images.dog.ceo/breeds/hound-afghan/n02088094_13909.jpg"))

        galleryAdapter.notifyDataSetChanged()
    }

    override fun onClick(position: Int) {
        // handle click of image

        val bundle = Bundle()
        bundle.putSerializable("images", imageList)
        bundle.putInt("position", position)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val galleryFragment = GalleryFullscreenFragment()
        galleryFragment.setArguments(bundle)
        galleryFragment.show(fragmentTransaction, "gallery")
    }
}