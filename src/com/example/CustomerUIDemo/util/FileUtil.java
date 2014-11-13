package com.example.CustomerUIDemo.util;

import android.os.Environment;

public class FileUtil {

	// Get the storage root path.
	public String getStorageRootPath() {

		String sdCardDir = null;
		String phoneDataDir = null;
		String path;

		boolean sdCardExist = Environment.getExternalStorageState().equals(
				android.os.Environment.MEDIA_MOUNTED); // SD card is exist or
														// not

		if (sdCardExist) {
			// Get the SD Card root: /mnt/sdcard - Sonny Shih 2014/09/26
			sdCardDir = Environment.getExternalStorageDirectory()
					.getAbsolutePath();
			path = sdCardDir;

		} else {
			// Get the phone root: /data - Sonny Shih 2014/09/26
			phoneDataDir = Environment.getDataDirectory().getAbsolutePath();

			path = phoneDataDir;
		}

		return path;
	}	

	
	// Check the file is the image or not. - Sonny Shih 2014/09/26
	public static boolean isImage(String fileName){
		boolean isImage = false;
		
		if (fileName.endsWith("jpg")) {
			isImage = true;
		} else if(fileName.endsWith("png")){
			isImage = true;
		} else if(fileName.endsWith("gif")){
			isImage = true;
		} else if(fileName.endsWith("jpge")){
			isImage = true;
		}
		
		return isImage;
		
	}

}
