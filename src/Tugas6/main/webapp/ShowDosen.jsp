<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.taopik.web.models.Dosen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" %>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
	 <script>
		 function konfirmasi()
		 {
		 tanya = confirm("Anda Yakin Akan Menghapus Data ?");
		 if (tanya == true) return true;
		 else return false;
		 }
		 
		 function success() {
			alert("Data Berhasil Dihapus!");
		 }
	 </script>
<title>Show Dosen</title> 
</head>
<body style="margin: 30px; background-color: white ">
	
	<div class="container" style="width: 800px; text-align: center; background-color: rgb(249, 249, 249)">
		<h2 style="text-align: left">Data Dosen</h2>
		<table class="table table-bordered" style="text-align: center ">
		  <tr>
		    <th>NIP</th>
		    <th>Nama</th>
		    <th colspan="2">Tindakan</th>
		  </tr>
			  <c:forEach var="dosen" items="${dataDosen}">
			  	  <tr>
				    <td><c:out value="${dosen.nip}"></c:out></td>
				    <td><c:out value="${dosen.nama}"></c:out></td>
				    <td>
				    	<a href="ubahDosen.jsp?nip=${dosen.nip}&nama=${dosen.nama}"><button class="btn btn-info btn-sm">Ubah</button></a>
					</td>
				    <td>
				    	<a href="DosenServlet?action=delete&nip=${dosen.nip}&nama=${dosen.nama}" onclick="return success()"><button class="btn btn-danger btn-sm" onclick="return konfirmasi()">Hapus</button></a>
					</td>
				  </tr>
			  </c:forEach>
		</table>
		<form action="insertDosen.jsp" style="text-align: left">
			<input type="submit" value="Tambah Data" class="btn btn-secondary">
		</form>
		</div>

</body>
</html>