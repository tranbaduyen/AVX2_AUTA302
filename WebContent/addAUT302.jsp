<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AUTA302</title>
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
					<div id="clock" class="my-label" style="padding-left: 78%;padding-bottom:15px;" ></div>
					
				</div>
			</div>
			<div class="top-message col-sm-12" style="background-color:#F8F8F8;margin-top: 10px;margin-bottom: 10px;">
				<label style="color: red;padding-top:5px;"><<< エラーメッセージ >>></label>
			</div>
			<div class="body-filter col-sm-12" style="">
				<div style="background-color: #E7E7E8;">
					<div class="body-main-label-text"><b>10件項目を入力できます。ー</b></div>
				</div>
			</div>
			
		
			<div class="body-main col-sm-12">
				<div style="margin: 0px 0 0 0px;">
				<html:form styleId="addForm" action="/addAUT302.do" method="post" style="">
					<table class="table-bordered  table-striped " style="width:100%; ">
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
						 <tbody >
							<tr style="">
								<td rowspan="2" style="">
									<div style="margin-right:20px;padding-top:8px;padding-right:2px;border: 1px solid #B9B7C7;text-align:center;">
										<label style="" >01</label>
									</div>
								</td>
								<td style=" text-align:center;width:6%;" class="">
									<html:text styleId="txtDEPO" property="kYSND_DEPO" styleClass="form-control no-border-radius" maxlength="2"  tabindex="1" onfocus="" ></html:text>
								</td>
								<td colspan="2" style="">
									<html:select styleClass="form-control no-border-radius" property="kYSND_MKCD" style="">
										<html:optionsCollection name="autKYSNDForm" property="listAUTMFOPM" 
									label="mFOPM_NAME" value="mFOPM_MKCD" />
									</html:select>
									
								</td>
								<td colspan="2" style=" text-align:center;">
									<html:text styleId="txtMKCD" property="kYSND_MKCD" styleClass=" form-control no-border-radius" maxlength="26"  tabindex="3"></html:text>
								</td>
								<td colspan="5" style=" text-align:center;">
									<html:text styleId="txtBHME" property="kYSND_BHME" styleClass=" form-control no-border-radius" maxlength="30"  tabindex="4"></html:text>
								</td>
								<td rowspan="2" style="width:5%;"></td>
							  </tr>
							  <tr>
								<td style=" text-align:center;">
									<html:text styleId="txtSSCD" property="kYSND_SSCD" styleClass=" form-control no-border-radius" maxlength="1"  tabindex="5"></html:text>
								</td>
								<td style="width"></td>
								<td style=" text-align:center;width:11%;">
									<html:text styleId="txtFORM" property="kYSND_FORM" styleClass=" form-control no-border-radius" maxlength="10"  tabindex="6"></html:text>
								</td>
								<td style=" text-align:center;width:15%;">
									<html:text styleId="txtCHNO" property="kYSND_CHNO" styleClass=" form-control no-border-radius" maxlength="15"  tabindex="7"></html:text>
								</td>
								<td style=" text-align:center;">
									<html:text styleId="txtSYMD" property="kYSND_SYMD" styleClass=" form-control no-border-radius" maxlength="8"  tabindex="8"></html:text>
								</td>
								<td style=" text-align:center;">
									<html:text styleId="txtSZSU" property="kYSND_SZSU" styleClass=" form-control no-border-radius" maxlength="6"  tabindex="9"></html:text>
								</td>
								<td style=" text-align:center;">
									<html:text styleId="txtSKCD" property="kYSND_SKCD" styleClass=" form-control no-border-radius" maxlength="2"  tabindex="10"></html:text>
								</td>
								<td style=" text-align:center;"></td>
								<td  style="">						
									<html:select styleClass="form-control no-border-radius" property="kYSND_SYCD" style="padding: 1px -2px 1px 1px;">
										<html:option styleClass="li" value="1">1.４輪</html:option>
	            						<html:option styleClass="li" value="2">2.２輪</html:option>
									</html:select>
								</td>
								<td style=" text-align:center;">
									<html:text styleId="txtSPBN" property="kYSND_SPBN" styleClass=" form-control no-border-radius" maxlength="6"  tabindex="12"></html:text>
								</td>
						
							  </tr>
						 <tbody>
					</table>
					<br>
					</html:form>
				</div>
			</div>
			<div class="body-button col-sm-12">
				<div style="margin: 10px 0 0 69%;">
					<button class="mybtn mybtn-success my-btn " style="width: 69px;height: 34px;margin-left: 10px;">登録(Ｎ)</button>
					<button class="mybtn mybtn-success my-btn" style="width: 110px;height: 34px;margin-left: 10px;">クリアー(Ｒ)</button>
					<button class="mybtn mybtn-success my-btn" style="width: 120px;height: 34px;margin-left: 10px;">キャンセル(C)</button>
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
			document.getElementById("clock").innerHTML= year + "/" +months[month] + "/" + date; 
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