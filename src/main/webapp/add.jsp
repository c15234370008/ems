<%@ page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>add Product</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
		<link href="${pageContext.request.contextPath}/css/common.css" type="text/css" rel="stylesheet" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p>
								
								<input type="button" class="button" value="安全退出" onclick="location='${pageContext.request.contextPath}/login.jsp'"/>
								<br />
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								
								
							</h1>
						</div>
						<div id="navigation">
						</div>
					</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						添加商品信息:
					</h1>
					<form action='${pageContext.request.contextPath}/myproduct/add' method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									商品名称:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="name" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									商品价格:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="price" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									商品描述:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="describe" />
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="添加" />
							<input type="button" class="button" onclick="javascript:location.href='${pageContext.request.contextPath}/myproduct/findAll'" value="返回商品列表页面" />
						</p>
					</form>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
					ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>