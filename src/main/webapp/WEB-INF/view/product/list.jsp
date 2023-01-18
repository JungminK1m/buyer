<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
        <h1>상품목록 페이지</h1>
        <hr />
        <table border="1">
            <tr>
                <th>번호</th>
                <th>상품명</th>
                <th>가격</th>
                <th>재고</th>
                <th>등록일</th>
            </tr>
            <tr>
                <td>1</td>
                <td><a href="/product/1">바나나</a></td>
                <td>1000원</td>
                <td>500개</td>
                <td>2023-01-18</td>
            </tr>

        </table>

        <%@ include file="../layout/footer.jsp" %>