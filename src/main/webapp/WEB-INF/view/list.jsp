<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="/resource/mystyles.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<meta charset="UTF-8">
<title>电影列表显示</title>
</head>

<script type="text/javascript">
	//从model获取排序方式.如果不是asc则使用desc. 
	var orderByMethod = '${movieVO.orderByMethod=="asc"?"desc":"asc"}';

	function myOrder(orderByColumn) {

		location.href = "/selects?orderByColumn=" + orderByColumn
				+ "&orderByMethod=" + orderByMethod;

	}
	
	//改变状态
	function updateStatus(id,status){
		$.post("/update",{status:status,id:id},function(obj){
			if(obj){
				alert("操作成功");
				location.reload();
			}
		})
		
	}
</script>
<body>

	<form action="/selects" method="post">
		影片名称: <input type="text" name="name" value="${movieVO.name }">
		导演: <input type="text" name="actor" value="${movieVO.actor}">
		年代:<input type="text" name="year" value="${movieVO.year }"><br>
		上映时间 :<input type="text" name="uptimeStart">--<input
			type="text" name="uptimeEnd"><br> 价格: <input type="text"
			name="priceStart">--<input type="text" name="priceEnd"><br>
		时长: <input type="text" name="durationStart">--<input
			type="text" name="durationEnd"><br>
		<button type="submit">查询</button>

	</form>



	<table>
		<tr>

			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td><a href="javascript:myOrder('uptime')">上映时间</a></td>
			<td><a href="javascript:myOrder('duration')">时长</a></td>
			<td><a href="javascript:myOrder('year')">年代</a></td>
			<td>类型</td>
			<td>价格</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>


		<c:forEach items="${movies }" var="m" varStatus="i">

			<tr>

				<td>${i.index+1 }</td>
				<td>${m.name }</td>
				<td>${m.actor }</td>
				<td>${m.uptime }</td>
				<td>${m.duration }</td>
				<td>${m.year }</td>
				<td>${m.type }</td>
				<td>${m.price }</td>
				<td>${m.area }</td>
				<td>${m.status==0?"即将热映":m.status==1?"正在热映":"已经下架" }</td>
				<td>
				<c:if test="${m.status==0}">
				<button type="button" onclick=" updateStatus(${m.id},-1)" >下架</button>
				</c:if>
				<c:if test="${m.status==1}">
				<button type="button" onclick="updateStatus(${m.id},-1)" >下架</button>
				</c:if>
		       <c:if test="${m.status==-1}">
				<button type="button" onclick="updateStatus(${m.id},1)">上架</button>
				</c:if>
				 |详情
				
				</td>
			</tr>




		</c:forEach>


		<tr>
			<td colspan="10">${page }
			<td>
		</tr>

	</table>



</body>
</html>