<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Initial Screen</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/quanlynhanvien.css" />
<link rel="stylesheet" href="css/myStyle.css" />
<script src="js/jquery.min.js"></script>

</head>
<body>
<div class="container">

	<div class="body">
		<div class="main-form col-sm-12" style="padding-top:20px;">
			<div class="top-text col-sm-12;" style="color:#F8FFFF;margin-bottom:5px;" >
				<div class="col-sm-5" style="float: left;background-color:#303549;padding-bottom: 10px;">
					<label class="my-label">AUTA302</label>
				</div>
				<div class="col-sm-4" style="float: left;background-color:#303549;padding-bottom: 10px;">
					<label class="my-label" style=";">出荷指示 送信情報 登録</label>
				</div>
				<div class="col-sm-3" style="float: left;background-color:#303549;">
					<div id="clock" class="my-label" style="padding-left: 65%;padding-bottom:15px;" ></div>
					
				</div>
			</div>
			<div class="top-message col-sm-12" style="background-color:#F8F8F8;margin-top: 10px;margin-bottom: 10px;">
				<label style="color: red;padding-top:5px;"><<< エラーメッセージ >>></label>
			</div>
			<div class="body-filter col-sm-12" align="center" style="">
				<div style="background-color: #E7E7E8;">
					<div class="body-main-label-text"><h1>Initial Screen</h1></div>
				</div>
			</div>
			
		
		</div>
		
	<div class="footer">
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
</html/>