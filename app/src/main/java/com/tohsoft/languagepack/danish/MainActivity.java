package com.tohsoft.languagepack.danish;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = "MainActivity";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
  public static String convertStreamToString(InputStream is) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(is));
    StringBuilder sb = new StringBuilder();
    String line = null;
    while ((line = reader.readLine()) != null) {
      sb.append(line).append("\n");
      Log.e("convertStreamToString",sb.toString());
    }
    reader.close();
    return sb.toString();
  }
//    private void loadDictionaryFromResource(int[] resId) {
//        final InputStream[] is = new InputStream[resId.length];
//        try {
//            // merging separated dictionary into one if dictionary is separated
//            int total = 0;
//            for (int i = 0; i < resId.length; i++) {
//                // http://ponystyle.com/blog/2010/03/26/dealing-with-asset-compression-in-android-apps/
//                // NOTE: the resource file can not be larger than 1MB
//                is[i] =getResources().openRawResource(resId[i]);
//                final int dictSize = is[i].available();
//                Log.d(
//                        TAG,
//                        "Will load a resource dictionary id "
//                                + resId[i]
//                                + " whose size is "
//                                + dictSize
//                                + " bytes.");
//                total += dictSize;
//                convertStreamToString(is[i]);
//            }
//
//
//        } catch (IOException e) {
//            Log.w(TAG, "No available memory for binary dictionary: " + e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            for (InputStream i1 : is) {
//                try {
//                    if (i1 != null) i1.close();
//                } catch (IOException e) {
//                    Log.w(TAG, "Failed to close input stream");
//                }
//            }
//        }
//    }
//    public static String getStringFromFile (String filePath) throws Exception {
//        File fl = new File(filePath);
//        FileInputStream fin = new FileInputStream(fl);
//        String ret = convertStreamToString(fin);
//        //Make sure you close all streams.
//        fin.close();
//        return ret;
//    }
}
