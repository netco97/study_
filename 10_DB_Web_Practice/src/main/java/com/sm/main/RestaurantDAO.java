package com.sm.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class RestaurantDAO {

	public static void select(HttpServletRequest request) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from restaurant_test";
		
		try {
			
		con = DBManager.connect();
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		System.out.println("등록 성공");
		ArrayList<RestaurantDTO> restaurants = new ArrayList<RestaurantDTO>();
		RestaurantDTO  restaurantdto = null;
		while(rs.next()) {
			int no = rs.getInt("r_no");
			String name = rs.getString("r_name");
			String menu = rs.getString("r_menu");
			String place = rs.getString("r_place");
			restaurantdto = new RestaurantDTO(no, name, menu, place);
			restaurants.add(restaurantdto);
		}
		
		request.setAttribute("restaurants", restaurants);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(con, pstmt, rs);
		}
	}

	public static void insert(HttpServletRequest request) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into RESTAURANT_TEST values (restaurant_test_seq.nextval,"+" ?, ?, ?)";
		try {
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("name"));
			pstmt.setString(2, request.getParameter("menu"));
			pstmt.setString(3, request.getParameter("place"));
			if(pstmt.executeUpdate()==1) {
				System.out.println("등록 성공");
				request.setAttribute("r", "등록 성공!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(con,pstmt,rs);
		}
	}

	public static void delete(HttpServletRequest request) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "delete from RESTAURANT_TEST where r_no = ?";
		
		try {
			con = DBManager.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("no"));
			if(pstmt.executeUpdate() == 1) {
				System.out.println("삭제 성공");
				request.setAttribute("r", "삭제 성공!");
			}
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("r", "server error ..");
		}
		finally {
			DBManager.close(con, pstmt, null);
		}
	}
		
	

}
