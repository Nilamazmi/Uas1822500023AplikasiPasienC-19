<?php
require_once('koneksi.php');
	
	//Membuat SQL Query
	$sql = "SELECT * FROM pasien";
	
	//Mendapatkan Hasil
	$r = mysqli_query($con,$sql);
	
	//Membuat Array Kosong 
	$result = array();
	
	while($row = mysqli_fetch_array($r)){
		
		//Memasukkan Nama dan ID kedalam Array Kosong yang telah dibuat 
		array_push($result,array(
			"nik"=>$row['nik'],
			"name"=>$row['nama'],
			"jk"=>$row['jk'],
			"gd"=>$row['gd'],
			"kec"=>$row['kec'],
			"kel"=>$row['kel'],
			"gp"=>$row['gp']
		));
	}
	
	//Menampilkan Array dalam Format JSON
	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>