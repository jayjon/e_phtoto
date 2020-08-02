package com.fsq.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImageUtils {
    public static String createMinPic(String saveurl, String picName, String picExt) throws IOException{
    	
   	 //-----------------------上传完成，开始生成缩略图-------------------------    
		java.io.File file = new java.io.File(saveurl+picName+"."+picExt); //读入刚才上传的文件
		String newfilename_min = picName + "_min." + picExt;//获得生成后的小图的名称
	
		Image src = javax.imageio.ImageIO.read(file); //构造Image对象
		float tagsize = 200;
		int old_w = src.getWidth(null); //得到源图宽
		int old_h = src.getHeight(null);
		int new_w = 0;
		int new_h = 0; //得到源图长
		//int tempsize;
		float tempdouble;
		if (old_w > old_h) {
			tempdouble = old_w / tagsize; 
		} else {
			tempdouble = old_h / tagsize;
		}
		new_w = Math.round(old_w / tempdouble);
		new_h = Math.round(old_h / tempdouble);//计算新图长宽
		BufferedImage tag = new BufferedImage(new_w, new_h,
				BufferedImage.TYPE_INT_RGB);
		tag.getGraphics().drawImage(src, 0, 0, new_w, new_h,
				null); //绘制缩小后的图
		FileOutputStream newimage = new FileOutputStream(saveurl+newfilename_min ); //输出到文件流
		JPEGImageEncoder encoder = JPEGCodec
				.createJPEGEncoder(newimage);
		encoder.encode(tag); //近JPEG编码
		newimage.close();
		return newfilename_min;
   }
}
