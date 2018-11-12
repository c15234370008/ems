<%@ page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
	<head>
		<title>productlist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
		<link href="${pageContext.request.contextPath}/css/common.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<h1>
							<input type="button" class="button" value="安全退出" onclick="location='${pageContext.request.contextPath}/login.jsp'"/>
							<br />
						</h1>
					</div>
					<div id="topheader">
						<h1 id="title">
							
						</h1>
					</div>
					<div id="navigation" align="right">
						<form action="${pageContext.request.contextPath}/myproduct/findProduct" method="post">
							<input type="text"  name="name"/><input type="submit"  value="搜索"/>
						</form>
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome <s:property value="#session.name"/> !
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								商品ID
							</td>
							<td>
								商品名称
							</td>
							<td>
								价格
							</td>
							<td>
								描述
							</td>
							<td>
								操作
							</td>
						</tr>
						
						<c:forEach items="${requestScope.list}" var="a">
						<tr class="row2">
							<td>
								${a.id}
							</td>
							<td>
								${a.name}
							</td>
							<td>
								${a.price}
							</td>
							<td>
								${a.describe}
							</td>
							<td>
								<a href="${pageContext.request.contextPath}/myproduct/remove?id=${a.id}">删除</a>&nbsp;<a href='${pageContext.request.contextPath}/update.jsp?id=${a.id}&name=${a.name}&price=${a.price}&describe=${a.describe}'>修改</a>
							</td>
						</tr>
					 </c:forEach>
					</table>
					<p>
						<input type="button" class="button" value="添加商品" onclick="location='${pageContext.request.contextPath}/add.jsp'"/>
						<input type="button" class="button" onclick="javascript:location.href='${pageContext.request.contextPath}/myproduct/findAll'" value="展示页面" />
					</p>
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