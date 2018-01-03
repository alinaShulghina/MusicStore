<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="template/header.jsp" %>

<div class="container">
    <div class="row">
        <h1>Product details</h1>
    </div>
    <div class="row">
        <div class="col-md-5">
            <img alt="image"/>
        </div>
        <div class="col-md-5">
            <h1>${product.name}</h1>
            <p>${product.description}</p>
            <p>${product.manufacturer}</p>
            <p>${product.condition}</p>
            <p>${product.status}</p>
            <p>${product.price}</p>
        </div>
    </div>
</div>

<%@include file="template/footer.jsp" %>
