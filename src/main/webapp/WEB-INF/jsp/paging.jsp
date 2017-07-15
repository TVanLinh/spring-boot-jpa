<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linhtran
  Date: 15/07/17
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



   <p>totalPage: ${totalPage}</p>
   <p>Start: ${pageResult.start}</p>
   <p>End: ${pageResult.end}</p>
   <p>PageCurre ${page}</p>

   <c:forEach var="item" items="${list}">
       <p>${item}  ----   ${item.articleId}</p>
   </c:forEach>

   <c:if test="${param.page == null}">
       <c:set var="page" value="1"/>
   </c:if>

   <c:if test="${param.page != null}">
       <c:set var="page" value="${param.page}"/>
   </c:if>


   <c:if test="${page>1 && totalPage>0}">
       <a href="/paging?page=${page-1}">Trang truoc</a>
   </c:if>
   <ul>
       <c:forEach var="item"  begin="${pageResult.start}" end="${pageResult.end}">
          <c:if test="${page==item}">
              <li style="color: red">Trang <a href="/paging?page=${item}">Trang ${item}</a></li>
          </c:if>
           <c:if test="${page!=item}">
               <li>Trang <a href="/paging?page=${item}">Trang ${item}</a></li>
           </c:if>
       </c:forEach>
    </ul>
   <c:if test="${page<totalPage && totalPage>1}">
       <a href="/paging?page=${page+1}">Trang sau</a>
   </c:if>
</body>
</html>
