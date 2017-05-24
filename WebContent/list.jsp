<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.lang.Math"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List AUTA302</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/quanlynhanvien.css" />
<link rel="stylesheet" href="css/myStyle.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<script src="js/jquery.min.js"></script>

</head>
<body>
<div class="container">
	<div class="body">
		<div class="main-form col-sm-12" style="padding-top:20px;">
			<div class="top-text col-sm-12;" style="color:#F8FFFF;margin-bottom:5px;" >
				<div class="top-text col-sm-12;" style="color:#F8FFFF;margin-bottom:5px;" >
				<div class="col-sm-5" style="float: left;background-color:#303549;padding-bottom: 10px;padding-left:5px;">
					<label class="my-label">AUTA302</label>
				</div>
				<div class="col-sm-4" style="float: left;background-color:#303549;padding-bottom: 10px;">
					<label class="my-label" style=";">出荷指示 送信情報 登録</label>
				</div>
				<div class="col-sm-3" style="float: left;background-color:#303549;">
					<div id="clock" class="my-label" style="font-style:bold;padding-left: 65%;padding-bottom:15px;" ></div>
				</div>
			</div>

			</div>
			<div class="top-message col-sm-12" style="border: 1px solid black;background-color:#F8F8F8;margin-top: 10px;margin-bottom: 10px;">
				<label for="errorMessage" style="color: red;padding-top:5px;padding-left: 5px;">
						<span>&lt;&lt;&lt; エラーメッセージ >>></span>
				</label>
			</div>
			<div class="body-filter col-sm-12" style="border: 1px solid black;">
				<div style="background-color: #E7E7E8;">
					<div class="body-main-label-text"><b>10件項目を入力できます。</b></div>
				</div>
			</div>
			<div class="body-main col-sm-12">
				<div style="margin: 0px 0 0 0px;">
					<table class="table-bordered  table-striped table-hover " style="width:100%; ">
						<thead style="background-color: #E7E7E8;">
							<tr>
								<th rowspan="2" style="width:5%; text-align:center;"></th>
								<th style=" text-align:center;width:5%;">DEPO <span class="require" style="color:red;"></span></th>
								<th colspan="2" style=" text-align:center;width:15%;">メーカー <span class="require" style="color:red;"></span></th>
								<th colspan="2" style=" text-align:center;width:25%;">部品番号</th>
								<th colspan="5" style=" text-align:center;width:35%;">部品名称</th>
								<th style="width:5%;"></th>
							</tr>
							<tr>
								<th style=" text-align:center;">ＳＳ <span class="require" style="color:red;"></span></th>
								<th style="width:10%;"></th>
								<th style=" text-align:center;">搬 入 先</th>
								<th style=" text-align:center;">注文番号</th>
								<th style=" text-align:center;">指 示 日</th>
								<th style=" text-align:center;width:10%;">指 示 数</th>
								<th style=" text-align:center;width:6%">出荷ｺｰﾄﾞ</th>
								<th style=" text-align:center;width:2%;"></th>
								<th style=" text-align:center;width:9%">２／４輪</th>
								<th style=" text-align:center;width:10%">ＳＰ部番</th>
								<th style=" text-align:center;"></th>
							</tr>
						 </thead>
						 <tbody>
						 	<tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >01</label>
									</div>
								</td>
								<td style=" text-align:left;width:6%;" class="">
									<span>XX</span>
								</td>
								<td colspan="2" ">
									<span>N N N N N</span>
								</td>
								<td colspan="2" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td colspan="5" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:left;">
									<span>X</span>
								</td>
								<td style="width"></td>
								<td style=" text-align:left;width:11%;">
									<span>XXXXXXXXXX</span>
								</td>
								<td style=" text-align:left;width:15%;">
									<span>XXXXXXXXXXXXXXX</span>
								</td>
								<td style=" text-align:right;">
									<span>9999/99/99</span>
								</td>
								<td style=" text-align:right;">
									<span>-999999</span>
								</td>
								<td style=" text-align:left;">
									<span>XX</span>
								</td>
								<td style=" text-align:left;"></td>
								<td  style="">
									<span>2.２輪</span>
								</td>
								<td style=" text-align:left;">
									<span>XXXXX</span>
								</td>
						
							  </tr>
						 	<tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >02</label>
									</div>
								</td>
								<td style=" text-align:left;width:6%;" class="">
									<span>XX</span>
								</td>
								<td colspan="2" ">
									<span>N N N N N</span>
								</td>
								<td colspan="2" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td colspan="5" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:left;">
									<span>X</span>
								</td>
								<td style="width"></td>
								<td style=" text-align:left;width:11%;">
									<span>XXXXXXXXXX</span>
								</td>
								<td style=" text-align:left;width:15%;">
									<span>XXXXXXXXXXXXXXX</span>
								</td>
								<td style=" text-align:right;">
									<span>9999/99/99</span>
								</td>
								<td style=" text-align:right;">
									<span>-999999</span>
								</td>
								<td style=" text-align:left;">
									<span>XX</span>
								</td>
								<td style=" text-align:left;"></td>
								<td  style="">
									<span>2.２輪</span>
								</td>
								<td style=" text-align:left;">
									<span>XXXXX</span>
								</td>
						
							  </tr>
							  <tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >03</label>
									</div>
								</td>
								<td style=" text-align:left;width:6%;" class="">
									<span>XX</span>
								</td>
								<td colspan="2" ">
									<span>N N N N N</span>
								</td>
								<td colspan="2" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td colspan="5" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:left;">
									<span>X</span>
								</td>
								<td style="width"></td>
								<td style=" text-align:left;width:11%;">
									<span>XXXXXXXXXX</span>
								</td>
								<td style=" text-align:left;width:15%;">
									<span>XXXXXXXXXXXXXXX</span>
								</td>
								<td style=" text-align:right;">
									<span>9999/99/99</span>
								</td>
								<td style=" text-align:right;">
									<span>-999999</span>
								</td>
								<td style=" text-align:left;">
									<span>XX</span>
								</td>
								<td style=" text-align:left;"></td>
								<td  style="">
									<span>2.２輪</span>
								</td>
								<td style=" text-align:left;">
									<span>XXXXX</span>
								</td>
						
							  </tr>
							  <tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >04</label>
									</div>
								</td>
								<td style=" text-align:left;width:6%;" class="">
									<span>XX</span>
								</td>
								<td colspan="2" ">
									<span>N N N N N</span>
								</td>
								<td colspan="2" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td colspan="5" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:left;">
									<span>X</span>
								</td>
								<td style="width"></td>
								<td style=" text-align:left;width:11%;">
									<span>XXXXXXXXXX</span>
								</td>
								<td style=" text-align:left;width:15%;">
									<span>XXXXXXXXXXXXXXX</span>
								</td>
								<td style=" text-align:right;">
									<span>9999/99/99</span>
								</td>
								<td style=" text-align:right;">
									<span>-999999</span>
								</td>
								<td style=" text-align:left;">
									<span>XX</span>
								</td>
								<td style=" text-align:left;"></td>
								<td  style="">
									<span>2.２輪</span>
								</td>
								<td style=" text-align:left;">
									<span>XXXXX</span>
								</td>
						
							  </tr>
							  <tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >05</label>
									</div>
								</td>
								<td style=" text-align:left;width:6%;" class="">
									<span>XX</span>
								</td>
								<td colspan="2" ">
									<span>N N N N N</span>
								</td>
								<td colspan="2" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td colspan="5" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:left;">
									<span>X</span>
								</td>
								<td style="width"></td>
								<td style=" text-align:left;width:11%;">
									<span>XXXXXXXXXX</span>
								</td>
								<td style=" text-align:left;width:15%;">
									<span>XXXXXXXXXXXXXXX</span>
								</td>
								<td style=" text-align:right;">
									<span>9999/99/99</span>
								</td>
								<td style=" text-align:right;">
									<span>-999999</span>
								</td>
								<td style=" text-align:left;">
									<span>XX</span>
								</td>
								<td style=" text-align:left;"></td>
								<td  style="">
									<span>2.２輪</span>
								</td>
								<td style=" text-align:left;">
									<span>XXXXX</span>
								</td>
						
							  </tr>
							  <tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >06</label>
									</div>
								</td>
								<td style=" text-align:left;width:6%;" class="">
									<span>XX</span>
								</td>
								<td colspan="2" ">
									<span>N N N N N</span>
								</td>
								<td colspan="2" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td colspan="5" style=" text-align:left;">
									<span>XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</span>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:left;">
									<span>X</span>
								</td>
								<td style="width"></td>
								<td style=" text-align:left;width:11%;">
									<span>XXXXXXXXXX</span>
								</td>
								<td style=" text-align:left;width:15%;">
									<span>XXXXXXXXXXXXXXX</span>
								</td>
								<td style=" text-align:right;">
									<span>9999/99/99</span>
								</td>
								<td style=" text-align:right;">
									<span>-999999</span>
								</td>
								<td style=" text-align:left;">
									<span>XX</span>
								</td>
								<td style=" text-align:left;"></td>
								<td  style="">
									<span>2.２輪</span>
								</td>
								<td style=" text-align:left;">
									<span>XXXXX</span>
								</td>
						
							  </tr>
						 </tbody>
					</table>
					<br>
					
				</div>
			</div>
				<div class="body-button col-sm-12">
					<div style="margin: 10px 0 0 69%;">
						<a href="addAUT302.do" id="btnSubmit" property="submit" class="mybtn mybtn-success my-btn" style="width: 69px;height: 34px;margin-left: 10px;text-decoration: none !important;" >登録(Ｎ)</a>
						<a role="button" href="index.jsp" class="mybtn mybtn-success my-btn" style="width: 110px;height: 34px;margin-left: 10px;text-decoration: none !important;">クリアー(Ｒ)</a>
						<a role="button" href="screenAUTA301.jsp" class="mybtn mybtn-success my-btn" style="width: 120px;height: 34px;margin-left: 10px;text-decoration: none !important;">キャンセル(C)</a>
					</div>
				</div>
			
		</div>
		
	<div class="footer">
	</div>
</div>
</div>
</body>
	<script type="text/javascript"> function refrClock() {
		var d=new Date();
			var s=d.getSeconds();
			var m=d.getMinutes();
			var h=d.getHours();
			var day=d.getDay();
			var date=d.getDate();
			var month=d.getMonth();
			var year=d.getFullYear();
			var days=new Array("Chủ nhật,","Thứ 2,","Thứ 3,","Thứ 4,","Thứ 5,","Thứ 6,","Thứ 7,");
			var months=new Array("1","2","3","4","5","6","7","8","9","10","11","12"); var am_pm;
			if (s<10) {s="0" + s}
			if (m<10) {m="0" + m}
			if (h>12){
				h-=12;AM_PM = "PM"
			}
			else {AM_PM="AM"}
			if (h<10) {
				h="0" + h
			}
			document.getElementById("clock").innerHTML= year + "年" +months[month] + "月" + date + "日"; 

			setTimeout("refrClock()",1000); } refrClock();
	</script>
	<script>
		$(document).ready(function () {
			$(".btn-select").each(function (e) {
				var value = $(this).find("ul li.selected").html();
				if (value != undefined) {
					$(this).find(".btn-select-input").val(value);
					$(this).find(".btn-select-value").html(value);
				}
			});
		});

		$(document).on('click', '.btn-select', function (e) {
			e.preventDefault();
			var ul = $(this).find("ul");
			if ($(this).hasClass("active")) {
				if (ul.find("li").is(e.target)) {
					var target = $(e.target);
					target.addClass("selected").siblings().removeClass("selected");
					var value = target.html();
					$(this).find(".btn-select-input").val(value);
					$(this).find(".btn-select-value").html(value);
				}
				ul.hide();
				$(this).removeClass("active");
			}
			else {
				$('.btn-select').not(this).each(function () {
					$(this).removeClass("active").find("ul").hide();
				});
				ul.slideDown(300);
				$(this).addClass("active");
			}
		});

		$(document).on('click', function (e) {
			var target = $(e.target).closest(".btn-select");
			if (!target.length) {
				$(".btn-select").removeClass("active").find("ul").hide();
			}
		});
	</script>
	<script type="text/javascript">
		var message1 = $("#message1").text();
		var message2 = $("#message2").text();
		var message3 = $("#message3").text();
		var message4 = $("#message4").text();
		var message5 = $("#message5").text();
		var message6 = $("#message6").text();
		var message7 = $("#message7").text();
		var message8 = $("#message8").text();
		var message9 = $("#message9").text();
		var message10 = $("#message10").text();
		var message12 = $("#message12").text();
		if(message1.length > 0){
			$("#iconmessage1").html('<i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message2.length > 0){
			$("#iconmessage2").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message3.length > 0){
			$("#iconmessage3").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message4.length > 0){
			$("#iconmessage4").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message5.length > 0){
			$("#iconmessage5").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message6.length > 0){
			$("#iconmessage6").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message7.length > 0){
			$("#iconmessage7").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message8.length > 0){
			$("#iconmessage8").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message9.length > 0){
			$("#iconmessage9").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message10.length > 0){
			$("#iconmessage10").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
		if(message12.length > 0){
			$("#iconmessage12").html('</br><i class="fa fa-exclamation-triangle" style="color:#cccc00;"></i>');
		}
	</script>
</html>