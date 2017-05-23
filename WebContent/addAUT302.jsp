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
<title>AUTA302</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/quanlynhanvien.css" />
<link rel="stylesheet" href="css/myStyle.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<script src="js/jquery.min.js"></script>
<style>
.decoratedErrorField{
    background-color: red;
    color: white;
}
</style>
</head>
<body>
<div class="container">
	<html:form styleId="addForm" action="/addAUT302.do" method="post" style="">
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
				<bean:define id="errorFirst" name="autKYSNDForm" property="errorFirst"></bean:define>
				<html:hidden styleId="errorFirst" property="errorFirst" styleClass="form-control"></html:hidden>
				<label for="errorMessage" style="color: red;padding-top:5px;padding-left: 5px;">
					<c:if test="${errorFirst == 0}">
						<span>&lt;&lt;&lt; エラーメッセージ >>></span>
					</c:if>
					<c:if test="${errorFirst != 0}">
						<span id="iconmessage1"></span>
						<label for="message1" id="message1"><html:errors property="kYSND_DEPOError" /></label>
						<span id="iconmessage2"></span>
						<label for="message2" id="message2"><html:errors property="kYSND_MKCDError" /></label>
						<span id="iconmessage3"></span>
						<label for="message3" id="message3"><html:errors property="kYSND_BHNOError" /></label>
						<span id="iconmessage4"></span>
						<label for="message4" id="message4"><html:errors property="kYSND_BHMEError" /></label>
						<span id="iconmessage5"></span>
						<label for="message5" id="message5"><html:errors property="kYSND_SSCDError" /></label>
						<span id="iconmessage6"></span>
						<label for="message6" id="message6"><html:errors property="kYSND_FORMError" /></label>
						<span id="iconmessage7"></span>
						<label for="message7" id="message7"><html:errors property="kYSND_CHNOError" /></label>
						<span id="iconmessage8"></span>
						<label for="message8" id="message8"><html:errors property="kYSND_SYMDError" /></label>
						<span id="iconmessage9"></span>
						<label for="message9" id="message9"><html:errors property="kYSND_SZSUError" /></label>
						<span id="iconmessage10"></span>
						<label for="message10" id="message10"><html:errors property="kYSND_SKCDError" /></label>
						<span id="iconmessage12"></span>
						<label for="message12" id="message12"><html:errors property="kYSND_SPBNError" /></label>
					</c:if>
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
						 	<logic:iterate name="autKYSNDForm"  id="num" property="number" >
							<tr style="" class="no-border-radius " id="row1${num} ">
								<td rowspan="2" style="" >
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" ><bean:write name="num" /></label>
									</div>
								</td>
								<td style=" text-align:center;width:6%;" ">
									<html:text styleId="txtDEPO${num}" property="arrKYSND_DEPO[${num}]"  styleClass="form-control no-border-radius" maxlength="2"  tabindex="1" onfocus="" ></html:text>
								</td>
								<td colspan="2" style="">
									<html:select styleId="txtMKCD${num}" styleClass="form-control no-border-radius" property="arrKYSND_MKCD[${num}]" style="">
										<html:option value="0">--Please choose--</html:option>
										<html:optionsCollection name="autKYSNDForm" property="listAUTMFOPM" 
										label="mFOPM_NAME" value="mFOPM_MKCD" />
									</html:select>
										
								</td>
								<td colspan="2" style=" text-align:center;">
									<html:text styleId="txtBHNO${num}" property="arrKYSND_BHNO[${num}]" styleClass=" form-control no-border-radius" maxlength="26"  tabindex="3"></html:text>
								</td>
								<td colspan="5" style=" text-align:center;">
									<html:text styleId="txtBHME${num}" property="arrKYSND_BHME[${num}]" styleClass=" form-control no-border-radius" maxlength="30"  tabindex="4"></html:text>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr style="" class="no-border-radius " id="row2${num}">
								<td style=" text-align:center;">
									<html:text styleId="txtSSCD${num}" property="arrKYSND_SSCD[${num}]" styleClass=" form-control no-border-radius" maxlength="1"  tabindex="5"></html:text>
								</td>
								<td style="width"></td>
								<td style=" text-align:center;width:11%;">
									<html:text styleId="txtFORM${num}" property="arrKYSND_FORM[${num}]"  styleClass=" form-control no-border-radius" maxlength="10"  tabindex="6"></html:text>
								</td>
								<td style=" text-align:center;width:15%;">
									<html:text styleId="txtCHNO${num}" property="arrKYSND_CHNO[${num}]"  styleClass=" form-control no-border-radius" maxlength="15"  tabindex="7"></html:text>
								</td>
								<td align="right" style="">
									<html:text styleId="txtSYMD${num}" style="" property="arrKYSND_SYMD[${num}]"  styleClass=" form-control no-border-radius" maxlength="8"  tabindex="8"></html:text>
								</td>
								<td align="right" style="">
									<html:text styleId="txtSZSU${num}" property="arrKYSND_SZSU[${num}]"  styleClass=" form-control no-border-radius" maxlength="7"  tabindex="9"></html:text>
								</td>
								<td style="text-align:center;">
									<html:text styleId="txtSKCD${num}" property="arrKYSND_SKCD[${num}]"  styleClass=" form-control no-border-radius" maxlength="2"  tabindex="10"></html:text>
								</td>
								<td style=" text-align:center;"></td>
								<td  style="">						
									<html:select styleId="txtSYCD${num}" styleClass="form-control no-border-radius" property="arrKYSND_SYCD[${num}]" style="padding: 1px -2px 1px 1px;">
										<html:option styleClass="li" value="0">Choose</html:option>
										<html:option styleClass="li" value="1">1.４輪</html:option>
		            					<html:option styleClass="li" value="2">2.２輪</html:option>
									</html:select>
								</td>
								<td style=" text-align:center;">
									<html:text styleId="txtSPBN${num}" property="arrKYSND_SPBN[${num}]" styleClass=" form-control no-border-radius" maxlength="6"  tabindex="12"></html:text>
								</td>
							  </tr>
							  </logic:iterate>
						 </tbody>
					</table>
					<br>
					
				</div>
			</div>
				<div class="body-button col-sm-12">
					<div style="margin: 10px 0 0 69%;">
						<html:submit styleId="btnSubmit" property="submit" styleClass="mybtn mybtn-success my-btn" style="width: 69px;height: 34px;margin-left: 10px;" value="登録(Ｎ)"></html:submit>
						<button class="mybtn mybtn-success my-btn" style="width: 110px;height: 34px;margin-left: 10px;">クリアー(Ｒ)</button>
						<button class="mybtn mybtn-success my-btn" style="width: 120px;height: 34px;margin-left: 10px;">キャンセル(C)</button>
					</div>
				</div>
			
		</div>
		
	<div class="footer">
	</div>
</div>
</html:form>
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
	<script>
	jQuery.extend(jQuery.expr[':'], {
	    focusable: function (el, index, selector) {
	        return $(el).is('a, button, :input, [tabindex]');
	    }
	});
	
	$(document).on('keydown', ':focusable', function (e) {
	    if (e.which == 13) {
	        e.preventDefault();
	        // Get all focusable elements on the page
	        var $canfocus = $(':focusable');
	        var index = $canfocus.index(this) + 1;
	        if (index >= $canfocus.length) index = 0;
	        $canfocus.eq(index).focus();
	    }
	});
	</script>
	<script >
	$(function() {
		  $('#txtDEPO1').focus();
		  var errorFirst = ${errorFirst}
		  for(var i=1; i<=10; i++){
			  switch (errorFirst) {
				case 1+i*10:
					$('#txtDEPO1').blur();
					$('#txtDEPO'+i).focus();
					document.getElementById('txtDEPO'+i).className += ' decoratedErrorField ';
					break;
				case 2+i*10:
					$('#txtDEPO1').blur();
					$('#txtMKCD'+i).focus();
					document.getElementById('txtMKCD'+i).className += ' decoratedErrorField ';
					break;
				case 3+i*10:
					$('#txtDEPO1').blur();
					$('#txtBHNO'+i).focus();
					document.getElementById('txtBHNO'+i).className += ' decoratedErrorField ';
					break;
				case 4+i*10:
					$('#txtDEPO1').blur();
					$('#txtBHME'+i).focus();
					document.getElementById('txtBHME'+i).className += ' decoratedErrorField ';
					break;
				case 5+i*10:
					$('#txtDEPO1').blur();
					$('#txtSSCD'+i).focus();
					document.getElementById('txtBHME'+i).className += ' decoratedErrorField ';
					break;
				case 6+i*10:
					$('#txtDEPO1').blur();
					$('#txtFORM'+i).focus();
					document.getElementById('txtFORM'+i).className += ' decoratedErrorField ';
					break;
				case 7+i*10:
					$('#txtDEPO1').blur();
					$('#txtCHNO'+i).focus();
					document.getElementById('txtCHNO'+i).className += ' decoratedErrorField ';
					break;
				case 8+i*10:
					$('#txtDEPO1').blur();
					$('#txtSYMD'+i).focus();
					document.getElementById('txtSYMD'+i).className += ' decoratedErrorField ';
					break;
				case 9+i*10:
					$('#txtDEPO1').blur();
					$('#txtSZSU'+i).focus();
					document.getElementById('txtSZSU'+i).className += ' decoratedErrorField ';
					break;
				case 10+i*10:
					$('#txtDEPO1').blur();
					$('#txtSKCD'+i).focus();
					document.getElementById('txtSKCD'+i).className += ' decoratedErrorField ';
					break;
				case 13+i*100:
					$('#txtDEPO1').blur();
					$('#txtSPBN'+i).focus();
					document.getElementById('txtSPBN'+i).className += ' decoratedErrorField ';
					break;	
				}
		  }
		  
	});
	</script>
</html>