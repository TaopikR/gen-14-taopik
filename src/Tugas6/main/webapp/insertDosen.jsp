<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>Tambah Data Dosen</title>
	<script>
		function validateform(){  
			var nip=document.myform.nip.value; 
			var nama=document.myform.nama.value;    
			if (nama==null || nama==""){  
				alert("Nama tidak boleh kosong !");  
				return false;  
			} else if (nip==null||nip==""){
				alert("NIP tidak boleh kosong !");  
				return false;
			}
		} 
		function success() {
			alert("Data Berhasil Ditambahkan!");
		}
	</script> 
</head>
<body style="margin: 100px; background-color: rgb(240, 240, 240) ">
	<div class="container" style="width: 400px; text-align: center; background-color: white; padding: 10px">
		<form name="myform" action="DosenServlet?action=insert" method="post" onsubmit="return success()">
			<div class="form-floating mb-3">
			  <input type="number" min="1" max="200000000" name="nip" class="form-control" id="floatingInput" placeholder="Masukan NIP" >
			  <label for="floatingInput">NIP</label>
			</div>
			<div class="form-floating">
			  <input type="text" name="nama" class="form-control" id="floatingPassword" placeholder="Masukan Nama">
			  <label for="floatingPassword">Nama</label>
			</div>
			<br>
			<p style="text-align: left"><a  href="DosenServlet?action=insert" ><button class="btn btn-light" onclick="return validateform()">Tambahkan</button></a></p>
		</form>
		<p style="text-align: left"><a href="index.jsp"><button class="btn btn-secondary">kembali ke halaman utama</button></a></p>
	</div>
	
</body>
</html>
