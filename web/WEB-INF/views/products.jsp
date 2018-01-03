<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="template/header.jsp" %>

<div class="container">
    <div class="row">
        <h1>All products</h1>
        <p class="lead">Checkout all the available products now!</p>
    </div>

    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Price</th>
            <th>Condition</th>
            <th>Status</th>
            <th>Units in Stock</th>
            <th>Manufacturer</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr><a href="<spring:url value="/products/details/${product.id}"/>">
                <td><c:out value="${product.name}"/></td>
                <td><c:out value="${product.category}"/></td>
                <td><c:out value="${product.description}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.condition}"/></td>
                <td><c:out value="${product.status}"/></td>
                <td><c:out value="${product.unitInStock}"/></td>
                <td><c:out value="${product.manufacturer}"/></td>
            </a>
            </tr>
        </c:forEach>
        </tbody>
    </table>


<%@include file="template/footer.jsp" %>
