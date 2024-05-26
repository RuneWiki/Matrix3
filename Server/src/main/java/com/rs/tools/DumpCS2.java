package com.rs.tools;

import java.io.FileOutputStream;

import com.rs.cache.Cache;

public class DumpCS2 {

	public static void main(String[] args) throws Throwable {
		Cache.init();
		
		for (int i = 0; i < 20000; i++) {
			if (!Cache.STORE.getIndexes()[12].fileExists(i, 0))
				continue;
			
			byte[] data = Cache.STORE.getIndexes()[12].getFile(i, 0);
			FileOutputStream fos = new FileOutputStream(System.getProperty("user.home") + "/Desktop/eclipse/workspace_/CS2 Decompiler v3/scripts/" + i);
			fos.write(data);
			fos.close();
		}
		
		System.out.println("Done");
	}

}
