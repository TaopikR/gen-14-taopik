package com.taopik.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.taopik.web.models.Dosen;

public class DosenDao {

		public List<Dosen> getDosen() {
			List<Dosen> dosen = new ArrayList<>();
			
			try {
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prodemy","postgres","postgres");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from dosen order by nip");
				while(rs.next()) {
					Dosen d = new Dosen();
					d.setNip(rs.getInt("nip"));
					d.setNama(rs.getString("nama"));
					dosen.add(d);
				}
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return dosen;
		}
		
		public void updateDosen(int nip, String nama) throws SQLException {
			String sql="update dosen set nama=? where nip=?";
			try {
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prodemy","postgres","postgres");
				PreparedStatement stmt=con.prepareStatement(sql);  
				stmt.setString(1,nama);
				stmt.setInt(2,nip);  
				stmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			  
		}
		
		public void setDosen(int nip, String nama) throws SQLException {
			String sql="insert into dosen values(?,?)";
			try {
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prodemy","postgres","postgres");
				PreparedStatement stmt=con.prepareStatement(sql); 
				stmt.setInt(1,nip);
				stmt.setString(2,nama);
				stmt.executeUpdate();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void deleteDosen(int nip) throws SQLException {
			String sql="delete from dosen where nip=?";
			try {
				Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prodemy","postgres","postgres");
				PreparedStatement stmt=con.prepareStatement(sql);   
				stmt.setInt(1,nip);  
				stmt.executeUpdate();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
}
