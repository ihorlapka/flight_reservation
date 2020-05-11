<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Flights</title>
</head>
<body>
    <h2>Find Flights:</h2>
    <form action="findFlights" method="post">
        From:<input type="text" name="from">
        To:<input type="text" name="to">
        Departure Date:<input type="date" name="departureDate">
<%--        <div>--%>
<%--            <form:label path="date"><pre>Date: </pre></form:label>--%>
<%--            <input type="date" name="date" value="${order.date}">--%>
<%--        </div>--%>
        <input type="submit" value="search"/>
    </form>
</body>
</html>
