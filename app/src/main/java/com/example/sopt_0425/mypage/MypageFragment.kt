package com.example.sopt_0425.mypage


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sopt_0425.ItemDecoration
import com.example.sopt_0425.R
import kotlinx.android.synthetic.main.fragment_mypage.*

/**
 * A simple [Fragment] subclass.
 */
class MypageFragment : Fragment() {

    //리사이클러뷰 적용
    lateinit var myAdapter: MyAdapter
    val datas = mutableListOf<MyData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myAdapter = MyAdapter(view.context)
        rv_mypage.adapter = myAdapter    // 리사이클러뷰의 어댑터를 webtoonAdapter로 지정
        val myLayoutManager = GridLayoutManager(view.context, 3)
        rv_mypage.layoutManager = myLayoutManager
        loadDatas()         // 데이터 생성하고 어댑터에 전달

        btn_bottom.setOnClickListener {
            val bottomSheetDialogFragment = MybottomsheetFragment()
            activity?.supportFragmentManager?.let { bottomSheetDialogFragment.show(it, bottomSheetDialogFragment.tag) }
        }
    }

    private fun loadDatas() {
        datas.apply {
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
            add(
                MyData(
                    img_contents = "https://cdn.pixabay.com/photo/2017/07/18/22/08/light-2517226__340.jpg"
                )
            )
        }
        myAdapter.datas = datas
        myAdapter.notifyDataSetChanged()
        rv_mypage.addItemDecoration(ItemDecoration())
    }
}
