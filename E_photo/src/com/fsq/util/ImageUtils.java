package com.fsq.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class ImageUtils {
    public static String createMinPic(String saveurl, String picName, String picExt) throws IOException{
    	
   	 //-----------------------�ϴ���ɣ���ʼ��������ͼ-------------------------    
		java.io.File file = new java.io.File(saveurl+picName+"."+picExt); //����ղ��ϴ����ļ�
		String newfilename_min = picName + "_min." + picExt;//������ɺ��Сͼ������
	
		Image src = javax.imageio.ImageIO.read(file); //����Image����
		float tagsize = 200;
		int old_w = src.getWidth(null); //�õ�Դͼ��
		int old_h = src.getHeight(null);
		int new_w = 0;
		int new_h = 0; //�õ�Դͼ��
		//int tempsize;
		float tempdouble;
		if (old_w > old_h) {
			tempdouble = old_w / tagsize; 
		} else {
			tempdouble = old_h / tagsize;
		}
		new_w = Math.round(old_w / tempdouble);
		new_h = Math.round(old_h / tempdouble);//������ͼ����
		BufferedImage tag = new BufferedImage(new_w, new_h,
				BufferedImage.TYPE_INT_RGB);
		tag.getGraphics().drawImage(src, 0, 0, new_w, new_h,
				null); //������С���ͼ
		FileOutputStream newimage = new FileOutputStream(saveurl+newfilename_min ); //������ļ���
		JPEGImageEncoder encoder = JPEGCodec
				.createJPEGEncoder(newimage);
		encoder.encode(tag); //��JPEG����
		newimage.close();
		return newfilename_min;
   }
}
