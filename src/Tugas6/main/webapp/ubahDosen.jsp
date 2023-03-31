<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Ubah Data Dosen</title>
	<script>
		function validateform(){  
			var nama=document.myform.nama.value;    
			if (nama==null || nama==""){  
				alert("Nama tidak boleh kosong !");  
				return false;  
			}
		} 
		function success() {
			alert("Data Berhasil Diubah!");
		}
	</script> 
</head>
<body style="margin: 100px; background-color: rgb(240, 240, 240) ">
	<div class="container" style="width: 400px; text-align: center; background-color: white; padding: 10px">
		<form name="myform" action="DosenServlet?action=edit" method="post" onsubmit="return success()">
			<div class="form-floating mb-3">
			  <input type="text" name="nip" value="${param.nip}" readonly class="form-control" id="floatingInput" >
			  <label for="floatingInput">NIP</label>
			</div>
			<div class="form-floating">
			  <input type="text" name="nama" value="${param.nama}" class="form-control" id="floatingPassword" >
			  <label for="floatingPassword">Nama Baru</label>
			</div>
			<br>
			<p style="text-align: left"><a  href="DosenServlet?action=edit&nip=${param.nip}&nama=${param.nama}" ><button class="btn btn-light" onclick="return validateform()">Ubah dan Simpan</button></a></p>
		</form>
		<p style="text-align: left"><a href="index.jsp"><button class="btn btn-secondary">kembali ke halaman utama</button></a></p>
	</div>
</body>
</html>