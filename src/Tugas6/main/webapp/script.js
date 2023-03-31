/**
 * 
 */

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