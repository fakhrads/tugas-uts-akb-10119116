// Nama : Fakhri Adi Saputra
// NIM : 10119116
// Kelas : IF-3
package id.fakhrads.aplikasiuts10119116.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("ASDASD");
    }

    public LiveData<String> getText() {
        return mText;
    }
}