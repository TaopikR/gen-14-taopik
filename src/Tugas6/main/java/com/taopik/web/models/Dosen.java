package com.taopik.web.models;

public class Dosen {
	
	private int nip;
	private String nama;
	public int getNip() {
		return nip;
	}
	public void setNip(int nip) {
		this.nip = nip;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	@Override
	public String toString() {
		return "\nDosen" + "\n nip=" + nip + "\n nama=" + nama ;
	}
	

}
