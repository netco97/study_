package com.sm.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {

	// 연결
	public static Connection connect() throws SQLException{
		
		String url = "jdbc:oracle:thin:@exnfr5oh0liddajx_high?TNS_ADMIN=/Users/isangmin/Oracle_wallet/Wallet_EXNFR5OH0LIDDAJX";
		String id = "ADMIN";
		String pw = "Soldesk802!!";
		
		
		return DriverManager.getConnection(url, id, pw);
		
	}
	
	public static void close(Connection con, PreparedStatement pstmt,ResultSet rs) throws SQLException
	{
		if(rs!=null) {
			rs.close();
		}
		con.close();
		pstmt.close();
	}
}
