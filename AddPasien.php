<?php

$HostName = "localhost";
$HostUser = "root";
$HostPass = "";
$DatabaseName = "pasien";
$con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);

$respon=array();

if(isset($_POST['nama']) && isset($_POST['alamat'])) { 
	$nama = $_POST['nama'];
	$jk = $_POST['jk'];
	$gd = $_POST['gd'];
	$kec = $_POST['kec'];
	$kel = $_POST['kel'];
	$gp = $_POST['gp'];


$result = mysqli_query($con,"INSERT INTO pasien (nama, jk, gd, kec, kel, gp) VALUES ('$nama','$jk','$gd','$kec','$kel','$gp')");

require_once('koneksi.php');

if($result){
$respon["sukses"] = 1;
$respon["pesan"] = "Berhasil Login";

echo json_encode($respon);
} else {
$respon["sukses"] = 0;
$respon["pesan"] = "Gagal Login";

echo json_encode($respon);
	}
} else {
$respon["sukses"] = 0;
$respon["pesan"] = "Data Belum Terisi";

echo json_encode($respon);
}
?>