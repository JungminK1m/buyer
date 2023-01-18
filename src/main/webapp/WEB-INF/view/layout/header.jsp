<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>구매서버</title>
        </head>

        <body>
            <ul>
                
                <c:choose>
                   <c:when test="${principal == null}">
                    <li>
                        <a href="/">홈</a>
                    </li>
                    <li>
                        <a href="/loginForm">로그인</a>
                    </li>
                    <li>
                        <a href="/joinForm">회원가입</a>
                    </li>
                   </c:when>

                   <c:otherwise>
                        <li>
                            <a href="/">홈</a>
                        </li>
                        <li>
                            <a href="/purchase">구매목록</a>
                        </li>
                        <li>
                            <a href="/logout">로그아웃</a>
                        </li>
                   </c:otherwise>
                </c:choose>

            </ul>