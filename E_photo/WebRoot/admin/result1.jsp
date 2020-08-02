<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/lightbox.css" type="text/css" media="screen" />
<script src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){	
	$(".zoom,.ilike").hide();

	$(".zoom").each(function(){//遍历所有对象
	var src=$(this).siblings("img").attr("src");
		$(this).attr({href:src});
	});
	
	$("#nav li").click(function(){
		$("#nav a").removeClass("hover");
		$(this).find("a").addClass("hover");
	});
	
	$("#waterfall li").mouseover(function(){
		$(this).addClass("hover");
		$(this).find(".zoom,.ilike").show();
	});
	
	$("#waterfall li").mouseout(function(){
		$(this).removeClass("hover");
		$(this).find(".zoom,.ilike").hide();
	});
});
</script>
</head>

<body>
<div id="nav">
	<a href="#" id="logo" class="float"></a>
    <ul>
    	<li><a href="#" class="hover">A</a></li>
    	<li><a href="#">B</a></li>
    	<li><a href="#">C</a></li>
    	<li><a href="#">D</a></li>
    </ul>
    <br />
</div>
<div id="main">
	<ul id="waterfall">
    	
        <li>
        	<div class="img_block">
            	<img src="files/t02a15cce0609367b63.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">YYM</a>
          </div>
            <h3>TITLE</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02ab3e8234460af10e.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">YYK</a>
      </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02a81ce70524e175d7.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02bee23c21dddc6707.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02a415b0bdec9addfd.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02b2d677a770616c3e.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/75462f17-1d2c-4a35-aa84-301f10d39476.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02a87bdfbd556ce8aa.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02fd158bc6a537cd42.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0271fde946d4ab0588.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0251eb6eed6a22a70c.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02ab045a98f47007a4.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02eb3d5e54190dcc96.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02b2d677a770616c3e.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02fb59b182aab53702.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0286ecbe9d90bbb461.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02b3f204f6988bb745.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02f3d7f35f113e2861.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02f5d1c2f8b5f58d13.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02de3862ebd78864de.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02e0a742709770a7af.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02a415b0bdec9addfd.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02c6b2bea6edeb60ec.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02e9e73d049364f5d8.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02eecc47c30bc9a770.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02f265cae00e3ebad3.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02e3f99debd9268075.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t026ce23955fd4f48bb.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02eb3d5e54190dcc96.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t027e3be008543e0fb7.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t028c01e25e39b5a652.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t021cf8ccec110927e5.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02fb59b182aab53702.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t022a83ab6607bd1d5b.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t020cb363d39dd4de03.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02d5220cf4c176fde9.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02f5d1c2f8b5f58d13.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02e0a742709770a7af.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0216d7fb8312f071e0.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t027b6882ae4fd00be3.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0271fde946d4ab0588.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02fc00475bb8c16f7f.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t026ce23955fd4f48bb.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0251eb6eed6a22a70c.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02ff568f59b8f04783.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t025b5ccfa2b1bfe4a0.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0216a728941796fb15.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0202e69f698ce00d4c.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02bf68624d00553ec5.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02268f5abe5f7a13ce.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02de3862ebd78864de.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t026ce23955fd4f48bb.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02344006eb8ed7120b.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t024567371490486722.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t024f5f4088fd4fa39c.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02990d7126fa46b7f8.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0246d9e944756258d6.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t026d107a54ebc02a58.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0275819368616bf0c5.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t0288cb1ee5ff827d84.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02f265cae00e3ebad3.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t024f5f4088fd4fa39c.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t028c01e25e39b5a652.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02f7782692b1b633d9.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
        <li>
        	<div class="img_block">
            	<img src="files/t02268f5abe5f7a13ce.jpg" />
                <a href="#" rel="lightbox[plants]" title="测试标题" class="zoom">放大</a>
                <a href="#" class="ilike">我喜欢</a>
          </div>
            <h3>标题测试</h3>
            <div class="iNum"><span>1</span><a href="#">4</a></div>
          <p>简介文字</p>
		</li>
        
    </ul>
    <br />
<div style="visibility:hidden" id=loading class=loading><p><img src="images/loading.gif"><IMG src="images/load.gif"></p></div>

</div>
<script src="js/lightbox.js"></script>
<script src="js/jquery.masonry.min.js"></script>
<script>
  $(function(){
    
    var $waterfall = $('#waterfall');
    
    $waterfall.masonry({
      columnWidth: 230
    });
    
  });
</script>

</body>
</html>
