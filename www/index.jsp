<%@ page contentType="text/html; charset=utf-8"  %>
<%@ page import="java.util.*" %>
<jsp:useBean id="webBean" scope="session" class="winter.Web" />
<%= webBean.indexHtml(request, session) %>