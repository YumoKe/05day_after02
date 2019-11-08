package com.bwei.utils;

import java.io.File;

/**
 * 文件相关工具类
 * @author wanghd
 */
public class FileUtils {

	/**
     * 递归 删除文件或文件夹， 不走回收站慎用
     * @param file  文件类型参数
     */
    public static void DeleteFile(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File files[] = file.listFiles();
                for (File file2 : files) {
                    DeleteFile(file2);
                }
                file.delete();
            }
        }else{
        	System.out.println("文件文不存在，请查看!!!");
        }
    }
    
    /**
     * 递归 删除文件或文件夹， 不走回收站慎用
     * @param filePath  字符串类型  文件绝对路径
     */
    public static void DeleteFile(String filePath) {
    	File file = new File(filePath);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File files[] = file.listFiles();
                for (File file2 : files) {
                    DeleteFile(file2);
                }
                file.delete();
            }
        }else{
        	System.out.println("文件文不存在，请查看!!!");
        }
    }
    
    public static void main(String[] args) {
    	File file = new File("G:\\2.png");
    	if(file.exists()){
    		if(file.isFile()){
        		String name = file.getName();
        		int i = name.lastIndexOf(".");
        		
        		String substring = name.substring(i);
        		System.out.println(substring);
        	}else{
        		System.out.println("不是文件");
        	}
    	}else{
    		System.out.println("文件文不存在，请查看!!!");
    	}
	}
	
}
