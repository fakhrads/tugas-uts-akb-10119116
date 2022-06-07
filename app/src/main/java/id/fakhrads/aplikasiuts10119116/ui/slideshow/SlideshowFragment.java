// Nama : Fakhri Adi Saputra
// NIM : 10119116
// Kelas : IF-3
package id.fakhrads.aplikasiuts10119116.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

import id.fakhrads.aplikasiuts10119116.databinding.FragmentHomeBinding;
import id.fakhrads.aplikasiuts10119116.databinding.FragmentSlideshowBinding;
import id.fakhrads.aplikasiuts10119116.R;

public class SlideshowFragment extends Fragment {

    private FragmentSlideshowBinding binding;
    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        viewPager2 = (ViewPager2) root.findViewById(R.id.viewpager);
        int[] images = {R.drawable.foto, R.drawable.jojo};
        String[] heading = {"Tentang Pembuat","Alasan Aplikasi Ini Ada"};
        String[] desc = {getString(R.string.a_desc),
                getString(R.string.b_desc),};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){

            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i],heading[i],desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);

        }

        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList);

        viewPager2.setAdapter(vpAdapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}